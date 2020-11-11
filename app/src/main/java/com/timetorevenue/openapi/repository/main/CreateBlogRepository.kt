package com.timetorevenue.openapi.repository.main

import com.timetorevenue.openapi.di.main.MainScope
import com.timetorevenue.openapi.models.AuthToken
import com.timetorevenue.openapi.ui.main.create_blog.state.CreateBlogViewState
import com.timetorevenue.openapi.util.DataState
import com.timetorevenue.openapi.util.StateEvent
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import okhttp3.RequestBody

@FlowPreview
@MainScope
interface CreateBlogRepository {

    fun createNewBlogPost(
        authToken: AuthToken,
        title: RequestBody,
        body: RequestBody,
        image: MultipartBody.Part?,
        stateEvent: StateEvent
    ): Flow<DataState<CreateBlogViewState>>
}