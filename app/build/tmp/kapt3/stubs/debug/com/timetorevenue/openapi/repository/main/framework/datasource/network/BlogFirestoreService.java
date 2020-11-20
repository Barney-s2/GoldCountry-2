package com.timetorevenue.openapi.repository.main.framework.datasource.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/BlogFirestoreService;", "", "deleteAllBlogPosts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPost", "primaryKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeletedBlogPost", "blogPost", "Lcom/timetorevenue/openapi/models/BlogPost;", "(Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBlogPosts", "", "getDeletedBlogPosts", "insertDeletedBlogPost", "insertDeletedBlogPosts", "blogPosts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrUpdateBlogPost", "insertOrUpdateBlogPosts", "searchBlogPost", "app_debug"})
public abstract interface BlogFirestoreService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrUpdateBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrUpdateBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertDeletedBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertDeletedBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteDeletedBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeletedBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.BlogPost> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0);
}