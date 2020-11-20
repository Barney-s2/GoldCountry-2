package com.timetorevenue.openapi.repository.main.framework.datasource.network

import com.timetorevenue.openapi.models.BlogPost
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BlogNetworkDataSourceImpl
@Inject
constructor(
    private val firestoreService: BlogFirestoreService
): BlogNetworkDataSource {

    override suspend fun insertOrUpdateBlogPost(blogPost: BlogPost) {
        return firestoreService.insertOrUpdateBlogPost(blogPost)
    }

    override suspend fun deleteBlogPost(primaryKey: String) {
        return firestoreService.deleteBlogPost(primaryKey)
    }

    override suspend fun insertDeletedBlogPost(blogPost: BlogPost) {
        return firestoreService.insertDeletedBlogPost(blogPost)
    }

    override suspend fun insertDeletedBlogPosts(blogPosts: List<BlogPost>) {
        return firestoreService.insertDeletedBlogPosts(blogPosts)
    }

    override suspend fun deleteDeletedBlogPost(blogPost: BlogPost) {
        return firestoreService.deleteDeletedBlogPost(blogPost)
    }

    override suspend fun getDeletedBlogPosts(): List<BlogPost> {
        return firestoreService.getDeletedBlogPosts()
    }

    override suspend fun deleteAllBlogPosts() {
        firestoreService.deleteAllBlogPosts()
    }

    override suspend fun searchBlogPost(blogPost: BlogPost): BlogPost? {
        return firestoreService.searchBlogPost(blogPost)
    }

    override suspend fun getAllBlogPosts(): List<BlogPost> {
        return firestoreService.getAllBlogPosts()
    }

    override suspend fun insertOrUpdateBlogPosts(blogPosts: List<BlogPost>) {
        return firestoreService.insertOrUpdateBlogPosts(blogPosts)
    }


}