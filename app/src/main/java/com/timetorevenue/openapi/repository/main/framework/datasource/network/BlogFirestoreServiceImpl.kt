package com.timetorevenue.openapi.repository.main.framework.datasource.network

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.framework.datasource.network.mappers.NetworkMapper
import com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity
import com.timetorevenue.openapi.util.cLog
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.*
import kotlinx.coroutines.tasks.await
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Firestore doc refs:
 * 1. add:  https://firebase.google.com/docs/firestore/manage-data/add-data
 * 2. delete: https://firebase.google.com/docs/firestore/manage-data/delete-data
 * 3. update: https://firebase.google.com/docs/firestore/manage-data/add-data#update-data
 * 4. query: https://firebase.google.com/docs/firestore/query-data/queries
 */
@Singleton
class BlogFirestoreServiceImpl
@Inject
constructor(
    private val firebaseAuth: FirebaseAuth, // might include auth in the future
    private val firestore: FirebaseFirestore,
    private val networkMapper: NetworkMapper
): BlogFirestoreService {

    override suspend fun insertOrUpdateBlogPost(blogPost: BlogPost) {
        val entity = networkMapper.mapToEntity(blogPost)
        entity.updated_at = Timestamp.now() // for updates
        firestore
            .collection(BLOGPOSTS_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)
            .document(entity.pk)
            .set(entity)
            .addOnFailureListener {
                // send error reports to Firebase Crashlytics
                cLog(it.message)
            }
            .await()
    }

    override suspend fun deleteBlogPost(primaryKey: String) {
        firestore
            .collection(BLOGPOSTS_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)
            .document(primaryKey)
            .delete()
            .addOnFailureListener {
                // send error reports to Firebase Crashlytics
                cLog(it.message)
            }
            .await()
    }

    override suspend fun insertDeletedBlogPost(blogPost: BlogPost) {
        val entity = networkMapper.mapToEntity(blogPost)
        firestore
            .collection(DELETES_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)
            .document(entity.pk)
            .set(entity)
            .addOnFailureListener {
                // send error reports to Firebase Crashlytics
                cLog(it.message)
            }
            .await()
    }

    override suspend fun insertDeletedBlogPosts(blogPosts: List<BlogPost>) {
        if(blogPosts.size > 500){
            throw Exception("Cannot delete more than 500 blogPosts at a time in firestore.")
        }

        val collectionRef = firestore
            .collection(DELETES_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)

        firestore.runBatch { batch ->
            for(blogPost in blogPosts){
                val documentRef = collectionRef.document(blogPost.pk.toString())
                batch.set(documentRef, networkMapper.mapToEntity(blogPost))
            }
        }.addOnFailureListener {
            // send error reports to Firebase Crashlytics
            cLog(it.message)
        }.await()
    }

    override suspend fun deleteDeletedBlogPost(blogPost: BlogPost) {
        val entity = networkMapper.mapToEntity(blogPost)
        firestore
            .collection(DELETES_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)
            .document(entity.pk)
            .delete()
            .addOnFailureListener {
                // send error reports to Firebase Crashlytics
                cLog(it.message)
            }
            .await()
    }

    // used in testing
    override suspend fun deleteAllBlogPosts() {
        firestore
            .collection(BLOGPOSTS_COLLECTION)
            .document(USER_ID)
            .delete()
            .await()
        firestore
            .collection(DELETES_COLLECTION)
            .document(USER_ID)
            .delete()
            .await()
    }

    override suspend fun getDeletedBlogPosts(): List<BlogPost> {
        return networkMapper.entityListToBlogPostList(
            firestore
                .collection(DELETES_COLLECTION)
                .document(USER_ID)
                .collection(BLOGPOSTS_COLLECTION)
                .get()
                .addOnFailureListener {
                    // send error reports to Firebase Crashlytics
                    cLog(it.message)
                }
                .await().toObjects(BlogNetworkEntity::class.java)
        )
    }

    override suspend fun searchBlogPost(blogPost: BlogPost): BlogPost? {
        return firestore
            .collection(BLOGPOSTS_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)
            .document(blogPost.pk.toString())
            .get()
            .addOnFailureListener {
                // send error reports to Firebase Crashlytics
                cLog(it.message)
            }
            .await()
            .toObject(BlogNetworkEntity::class.java)?.let {
                networkMapper.mapFromEntity(it)
            }
    }

    override suspend fun getAllBlogPosts(): List<BlogPost> {
        return networkMapper.entityListToBlogPostList(
            firestore
                .collection(BLOGPOSTS_COLLECTION)
                .document(USER_ID)
                .collection(BLOGPOSTS_COLLECTION)
                .get()
                .addOnFailureListener {
                    // send error reports to Firebase Crashlytics
                    cLog(it.message)
                }
                .await()
                .toObjects(BlogNetworkEntity::class.java)
        )
    }

    override suspend fun insertOrUpdateBlogPosts(blogPosts: List<BlogPost>) {

        if(blogPosts.size > 500){
            throw Exception("Cannot insert more than 500 blogPosts at a time into firestore.")
        }

        val collectionRef = firestore
            .collection(BLOGPOSTS_COLLECTION)
            .document(USER_ID)
            .collection(BLOGPOSTS_COLLECTION)

        firestore.runBatch { batch ->
            for(blogPost in blogPosts){
                val entity = networkMapper.mapToEntity(blogPost)
                entity.updated_at = Timestamp.now()
                val documentRef = collectionRef.document(blogPost.pk.toString())
                batch.set(documentRef, entity)
            }
        }.addOnFailureListener {
            // send error reports to Firebase Crashlytics
            cLog(it.message)
        }.await()

    }
    //bjs companion objects are used in place of the "systems User Auth login" developed during login.
    // which is used instead of passing user Auth as a constructor argument.
    companion object {
        const val BLOGPOSTS_COLLECTION = "blogPosts"
        const val USERS_COLLECTION = "users"
        const val DELETES_COLLECTION = "deletes"
        const val USER_ID = "8BE7SmCAgLhBNHfqaEodMqWM7P52" // hardcoded for single user
        const val EMAIL = "barney@timetorevenue.com"
    }


}
