package com.timetorevenue.openapi.ui.main.blog;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016J\u0010\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0017H\u0016J\u001a\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010,\u001a\u00020\u0010H\u0002J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\u0006\u00100\u001a\u00020\u0010J\b\u00101\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BlogFragment;", "Lcom/timetorevenue/openapi/ui/main/blog/BaseBlogFragment;", "Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lcom/bumptech/glide/request/RequestOptions;)V", "recyclerAdapter", "Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "searchView", "Landroidx/appcompat/widget/SearchView;", "initRecyclerView", "", "initSearchView", "menu", "Landroid/view/Menu;", "onBlogSearchOrFilter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onItemSelected", "position", "", "item", "Lcom/timetorevenue/openapi/models/BlogPost;", "onOptionsItemSelected", "", "Landroid/view/MenuItem;", "onPause", "onRefresh", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "resetUI", "restoreListPosition", "saveLayoutManagerState", "setupGlide", "showFilterDialog", "subscribeObservers", "app_debug"})
public final class BlogFragment extends com.timetorevenue.openapi.ui.main.blog.BaseBlogFragment implements com.timetorevenue.openapi.ui.main.blog.BlogListAdapter.Interaction, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private androidx.appcompat.widget.SearchView searchView;
    private com.timetorevenue.openapi.ui.main.blog.BlogListAdapter recyclerAdapter;
    private com.bumptech.glide.RequestManager requestManager;
    private final com.bumptech.glide.request.RequestOptions requestOptions = null;
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void saveLayoutManagerState() {
    }
    
    private final void subscribeObservers() {
    }
    
    private final void initSearchView(android.view.Menu menu) {
    }
    
    private final void onBlogSearchOrFilter() {
    }
    
    private final void resetUI() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void setupGlide() {
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
    
    @java.lang.Override()
    public void onItemSelected(int position, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost item) {
    }
    
    @java.lang.Override()
    public void restoreListPosition() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public final void showFilterDialog() {
    }
    
    @javax.inject.Inject()
    public BlogFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        super(0, null);
    }
}