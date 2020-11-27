package com.timetorevenue.openapi.network.implementation
//package com.codingwithmitch.cleannotes.framework.datasource.network.implementation

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.network.abstraction.BlogPostNetworkDataSource
import com.timetorevenue.openapi.network.mappers.NetworkMapper
import com.timetorevenue.openapi.network.model.BlogPostNetworkEntity
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

class BlogPostFirestoreServiceImpl {
}