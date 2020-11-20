package com.timetorevenue.openapi.ui.main.create_blog;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.UseExperimental(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0014J$\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/create_blog/CreateBlogViewModel;", "Lcom/timetorevenue/openapi/ui/BaseViewModel;", "Lcom/timetorevenue/openapi/ui/main/create_blog/state/CreateBlogViewState;", "createBlogRepository", "Lcom/timetorevenue/openapi/repository/main/CreateBlogRepositoryImpl;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "(Lcom/timetorevenue/openapi/repository/main/CreateBlogRepositoryImpl;Lcom/timetorevenue/openapi/session/SessionManager;)V", "getCreateBlogRepository", "()Lcom/timetorevenue/openapi/repository/main/CreateBlogRepositoryImpl;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "clearNewBlogFields", "", "handleNewData", "data", "initNewViewState", "onCleared", "setNewBlogFields", "title", "", "body", "uri", "Landroid/net/Uri;", "setStateEvent", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public final class CreateBlogViewModel extends com.timetorevenue.openapi.ui.BaseViewModel<com.timetorevenue.openapi.ui.main.create_blog.state.CreateBlogViewState> {
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.repository.main.CreateBlogRepositoryImpl createBlogRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.session.SessionManager sessionManager = null;
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.create_blog.state.CreateBlogViewState data) {
    }
    
    @java.lang.Override()
    public void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.ui.main.create_blog.state.CreateBlogViewState initNewViewState() {
        return null;
    }
    
    public final void setNewBlogFields(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String body, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    public final void clearNewBlogFields() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.main.CreateBlogRepositoryImpl getCreateBlogRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.session.SessionManager getSessionManager() {
        return null;
    }
    
    @javax.inject.Inject()
    public CreateBlogViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.CreateBlogRepositoryImpl createBlogRepository, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager) {
        super();
    }
}