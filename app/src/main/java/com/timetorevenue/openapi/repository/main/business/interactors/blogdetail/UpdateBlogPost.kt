package com.timetorevenue.openapi.repository.main.business.interactors.blogdetail

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.business.data.cache.CacheResponseHandler
import com.timetorevenue.openapi.repository.main.business.data.cache.abstraction.BlogPostCacheDataSource
import com.timetorevenue.openapi.repository.main.business.data.network.abstraction.BlogPostNetworkDataSource
import com.timetorevenue.openapi.repository.main.business.domain.state.*
import com.timetorevenue.openapi.repository.main.framework.presentation.blogdetail.state.BlogDetailViewState
import com.timetorevenue.openapi.repository.safeApiCall
import com.timetorevenue.openapi.repository.safeCacheCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UpdateBlogPost(
    private val blogPostCacheDataSource: BlogPostCacheDataSource,
    private val blogPostNetworkDataSource: BlogPostNetworkDataSource
){

    fun updatBlogPost(
        blogPost: BlogPost,
        stateEvent: StateEvent
    ): Flow<DataState<BlogDetailViewState>?> = flow {

        val cacheResult = safeCacheCall(Dispatchers.IO){
            blogPostCacheDataSource.updateNote(
                primaryKey = blogPost.id,
                newTitle = blogPost.title,
                newImage = blogPost.image,
                newBody = blogPost.body
            )
        }

        val response = object: CacheResponseHandler<BlogDetailViewState , Int>(
            response = cacheResult,
            stateEvent = stateEvent
        ){
            override suspend fun handleSuccess(resultObj: Int): DataState<BlogDetailViewState>? {
                return if(resultObj > 0){
                    DataState.data(
                        response = Response(
                            message = UPDATE_BLOGPOST_SUCCESS,
                            uiComponentType = UIComponentType.Toast(),
                            messageType = MessageType.Success()
                        ),
                        data = null,
                        stateEvent = stateEvent
                    )
                }
                else{
                    DataState.data(
                        response = Response(
                            message = UPDATE_BLOGPOST_FAILED,
                            uiComponentType = UIComponentType.Toast(),
                            messageType = MessageType.Error()
                        ),
                        data = null,
                        stateEvent = stateEvent
                    )
                }
            }
        }.getResult()

        emit(response)

        updateNetwork(response?.stateMessage?.response?.message, blogPost)
    }

    private suspend fun updateNetwork(response: String?, blogPost: BlogPost) {
        if(response.equals(UPDATE_BLOGPOST_SUCCESS)){

            safeApiCall(Dispatchers.IO){
                blogPostNetworkDataSource.insertOrUpdateBlogPost(blogPost)
            }
        }
    }

    companion object{
        val UPDATE_BLOGPOST_SUCCESS = "Successfully updated blogPost."
        val UPDATE_BLOGPOST_FAILED = "Failed to update blogPost."
        val UPDATE_BLOGPOST_FAILED_PK = "Update failed. BlogPost is missing primary key."

    }
}