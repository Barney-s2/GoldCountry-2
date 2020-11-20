package com.timetorevenue.openapi.repository.main.business.data.cache.abstraction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/data/cache/abstraction/BlogPostCacheDataSource;", "", "deleteBlogPost", "", "primaryKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPosts", "blogPosts", "", "Lcom/timetorevenue/openapi/models/BlogPost;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBlogPosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNumBlogPosts", "insertBlogPost", "", "blogPost", "(Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBlogPosts", "", "searchBlogPostById", "id", "searchBlogPosts", "query", "filterAndOrder", "page", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBlogPost", "newTitle", "newBody", "newImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BlogPostCacheDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String newBody, @org.jetbrains.annotations.NotNull()
    java.lang.String newImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchBlogPosts(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String filterAndOrder, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchBlogPostById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.BlogPost> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNumBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> p1);
}