package com.timetorevenue.openapi.repository.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/CreateBlogRepository;", "", "createNewBlogPost", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/main/create_blog/state/CreateBlogViewState;", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "title", "Lokhttp3/RequestBody;", "body", "image", "Lokhttp3/MultipartBody$Part;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public abstract interface CreateBlogRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.create_blog.state.CreateBlogViewState>> createNewBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
}