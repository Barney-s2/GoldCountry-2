package com.timetorevenue.openapi.repository.main.framework.datasource.cache.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J/\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J/\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J/\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J/\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J5\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\r2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/cache/implementation/BlogDaoServiceImpl;", "Lcom/timetorevenue/openapi/repository/main/framework/datasource/cache/abstraction/BlogDaoService;", "blogPostDao", "Lcom/timetorevenue/openapi/persistence/BlogPostDao;", "noteMapper", "error/NonExistentClass", "dateUtil", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;", "(Lcom/timetorevenue/openapi/persistence/BlogPostDao;Lerror/NonExistentClass;Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;)V", "Lerror/NonExistentClass;", "deleteBlogPost", "", "primaryKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPosts", "blogPosts", "", "Lcom/timetorevenue/openapi/models/BlogPost;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBlogPosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNumBlogPosts", "insertBlogPost", "", "blogPost", "(Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBlogPosts", "", "returnOrderedQuery", "query", "filterAndOrder", "page", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBlogPostById", "id", "searchBlogPosts", "searchBlogPostsOrderByDateASC", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBlogPostsOrderByDateDESC", "searchBlogPostsOrderByTitleDESC", "searchNotesOrderByTitleASC", "updateNote", "title", "body", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class BlogDaoServiceImpl implements com.timetorevenue.openapi.repository.main.framework.datasource.cache.abstraction.BlogDaoService {
    private final com.timetorevenue.openapi.persistence.BlogPostDao blogPostDao = null;
    private final error.NonExistentClass noteMapper = null;
    private final com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchBlogPostById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.BlogPost> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String body, @org.jetbrains.annotations.Nullable()
    java.lang.String timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0) {
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
    public java.lang.Object searchBlogPostsOrderByDateDESC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchBlogPostsOrderByDateASC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchBlogPostsOrderByTitleDESC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object searchNotesOrderByTitleASC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNumBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object returnOrderedQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String filterAndOrder, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3) {
        return null;
    }
    
    @javax.inject.Inject()
    public BlogDaoServiceImpl(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.BlogPostDao blogPostDao, @org.jetbrains.annotations.NotNull()
    error.NonExistentClass noteMapper, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil) {
        super();
    }
}