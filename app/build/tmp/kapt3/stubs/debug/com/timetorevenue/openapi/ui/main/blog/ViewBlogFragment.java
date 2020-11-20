package com.timetorevenue.openapi.ui.main.blog;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/ViewBlogFragment;", "Lcom/timetorevenue/openapi/ui/main/blog/BaseBlogFragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lcom/bumptech/glide/RequestManager;)V", "adaptViewToAuthorMode", "", "checkIsAuthorOfBlogPost", "confirmDeleteRequest", "deleteBlogPost", "navUpdateBlogFragment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "setBlogProperties", "blogPost", "Lcom/timetorevenue/openapi/models/BlogPost;", "subscribeObservers", "app_debug"})
public final class ViewBlogFragment extends com.timetorevenue.openapi.ui.main.blog.BaseBlogFragment {
    private final com.bumptech.glide.RequestManager requestManager = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * !IMPORTANT!
     * Must save ViewState b/c in event of process death the LiveData in ViewModel will be lost
     */
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void confirmDeleteRequest() {
    }
    
    public final void deleteBlogPost() {
    }
    
    public final void checkIsAuthorOfBlogPost() {
    }
    
    public final void subscribeObservers() {
    }
    
    public final void adaptViewToAuthorMode() {
    }
    
    public final void setBlogProperties(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void navUpdateBlogFragment() {
    }
    
    @javax.inject.Inject()
    public ViewBlogFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager) {
        super(0, null);
    }
}