package com.timetorevenue.openapi.ui.main.blog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\'()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u001c\u0010 \u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"J\u001e\u0010#\u001a\u00020\u001a2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"2\u0006\u0010%\u001a\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\f0\f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "interaction", "Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;", "(Lcom/bumptech/glide/RequestManager;Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;)V", "BLOG_ITEM", "", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/timetorevenue/openapi/models/BlogPost;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "NO_MORE_RESULTS", "NO_MORE_RESULTS_BLOG_MARKER", "TAG", "", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "preloadGlideImages", "list", "", "submitList", "blogList", "isQueryExhausted", "", "BlogRecyclerChangeCallback", "BlogViewHolder", "Interaction", "app_debug"})
public final class BlogListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.lang.String TAG = "AppDebug";
    private final int NO_MORE_RESULTS = -1;
    private final int BLOG_ITEM = 0;
    private final com.timetorevenue.openapi.models.BlogPost NO_MORE_RESULTS_BLOG_MARKER = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.timetorevenue.openapi.models.BlogPost> DIFF_CALLBACK = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.timetorevenue.openapi.models.BlogPost> differ = null;
    private final com.bumptech.glide.RequestManager requestManager = null;
    private final com.timetorevenue.openapi.ui.main.blog.BlogListAdapter.Interaction interaction = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.timetorevenue.openapi.models.BlogPost> getDIFF_CALLBACK() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void preloadGlideImages(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager, @org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> list) {
    }
    
    public final void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogList, boolean isQueryExhausted) {
    }
    
    public BlogListAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.main.blog.BlogListAdapter.Interaction interaction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$BlogRecyclerChangeCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "adapter", "Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter;", "(Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter;Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "app_debug"})
    public final class BlogRecyclerChangeCallback implements androidx.recyclerview.widget.ListUpdateCallback {
        private final com.timetorevenue.openapi.ui.main.blog.BlogListAdapter adapter = null;
        
        @java.lang.Override()
        public void onChanged(int position, int count, @org.jetbrains.annotations.Nullable()
        java.lang.Object payload) {
        }
        
        @java.lang.Override()
        public void onInserted(int position, int count) {
        }
        
        @java.lang.Override()
        public void onMoved(int fromPosition, int toPosition) {
        }
        
        @java.lang.Override()
        public void onRemoved(int position, int count) {
        }
        
        public BlogRecyclerChangeCallback(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.ui.main.blog.BlogListAdapter adapter) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$BlogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "interaction", "Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;", "(Landroid/view/View;Lcom/bumptech/glide/RequestManager;Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;)V", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "bind", "", "item", "Lcom/timetorevenue/openapi/models/BlogPost;", "app_debug"})
    public static final class BlogViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.bumptech.glide.RequestManager requestManager = null;
        private final com.timetorevenue.openapi.ui.main.blog.BlogListAdapter.Interaction interaction = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.models.BlogPost item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.RequestManager getRequestManager() {
            return null;
        }
        
        public BlogViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.RequestManager requestManager, @org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.ui.main.blog.BlogListAdapter.Interaction interaction) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BlogListAdapter$Interaction;", "", "onItemSelected", "", "position", "", "item", "Lcom/timetorevenue/openapi/models/BlogPost;", "restoreListPosition", "app_debug"})
    public static abstract interface Interaction {
        
        public abstract void onItemSelected(int position, @org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.models.BlogPost item);
        
        public abstract void restoreListPosition();
    }
}