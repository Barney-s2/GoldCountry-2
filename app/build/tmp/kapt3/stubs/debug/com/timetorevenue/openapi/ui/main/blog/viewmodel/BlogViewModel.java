package com.timetorevenue.openapi.ui.main.blog.viewmodel;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/viewmodel/BlogViewModel;", "Lcom/timetorevenue/openapi/ui/BaseViewModel;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogViewState;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "blogRepository", "Lcom/timetorevenue/openapi/repository/main/BlogRepositoryImpl;", "sharedPreferences", "Landroid/content/SharedPreferences;", "editor", "Landroid/content/SharedPreferences$Editor;", "(Lcom/timetorevenue/openapi/session/SessionManager;Lcom/timetorevenue/openapi/repository/main/BlogRepositoryImpl;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;)V", "handleNewData", "", "data", "initNewViewState", "onCleared", "saveFilterOptions", "filter", "", "order", "setStateEvent", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public final class BlogViewModel extends com.timetorevenue.openapi.ui.BaseViewModel<com.timetorevenue.openapi.ui.main.blog.state.BlogViewState> {
    private final com.timetorevenue.openapi.session.SessionManager sessionManager = null;
    private final com.timetorevenue.openapi.repository.main.BlogRepositoryImpl blogRepository = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.Editor editor = null;
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.blog.state.BlogViewState data) {
    }
    
    @java.lang.Override()
    public void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.ui.main.blog.state.BlogViewState initNewViewState() {
        return null;
    }
    
    public final void saveFilterOptions(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    java.lang.String order) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public BlogViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.BlogRepositoryImpl blogRepository, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor) {
        super();
    }
}