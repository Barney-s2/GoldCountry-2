package com.timetorevenue.openapi.repository.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH&J<\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH&JF\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\u001a"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/BlogRepository;", "", "deleteBlogPost", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogViewState;", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "blogPost", "Lcom/timetorevenue/openapi/models/BlogPost;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "isAuthorOfBlogPost", "slug", "", "searchBlogPosts", "query", "filterAndOrder", "page", "", "updateBlogPost", "title", "Lokhttp3/RequestBody;", "body", "image", "Lokhttp3/MultipartBody$Part;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public abstract interface BlogRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.blog.state.BlogViewState>> searchBlogPosts(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String filterAndOrder, int page, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.blog.state.BlogViewState>> isAuthorOfBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.blog.state.BlogViewState>> deleteBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.blog.state.BlogViewState>> updateBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
}