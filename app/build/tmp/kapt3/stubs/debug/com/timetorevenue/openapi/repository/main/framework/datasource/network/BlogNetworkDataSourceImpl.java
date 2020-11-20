package com.timetorevenue.openapi.repository.main.framework.datasource.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/BlogNetworkDataSourceImpl;", "Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/BlogNetworkDataSource;", "firestoreService", "Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/BlogFirestoreService;", "(Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/BlogFirestoreService;)V", "deleteAllBlogPosts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPost", "primaryKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeletedBlogPost", "blogPost", "Lcom/timetorevenue/openapi/models/BlogPost;", "(Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBlogPosts", "", "getDeletedBlogPosts", "insertDeletedBlogPost", "insertDeletedBlogPosts", "blogPosts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrUpdateBlogPost", "insertOrUpdateBlogPosts", "searchBlogPost", "app_debug"})
@javax.inject.Singleton()
public final class BlogNetworkDataSourceImpl implements com.timetorevenue.openapi.repository.main.framework.datasource.network.BlogNetworkDataSource {
    private final com.timetorevenue.openapi.repository.main.framework.datasource.network.BlogFirestoreService firestoreService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertOrUpdateBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertDeletedBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertDeletedBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteDeletedBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDeletedBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.BlogPost> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertOrUpdateBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public BlogNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.framework.datasource.network.BlogFirestoreService firestoreService) {
        super();
    }
}