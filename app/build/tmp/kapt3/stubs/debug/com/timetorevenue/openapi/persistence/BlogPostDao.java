package com.timetorevenue.openapi.persistence;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0014\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J1\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J1\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J1\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J9\u0010$\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/timetorevenue/openapi/persistence/BlogPostDao;", "", "deleteAllBlogPosts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPost", "", "primaryKey", "Lcom/timetorevenue/openapi/models/BlogPost;", "(Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPosts", "pks", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBlogPosts", "getNumBlogPost", "insert", "blogPost", "insertBlogPost", "", "insertBlogPosts", "", "blogPosts", "searchBlogPostById", "pk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBlogPosts", "searchBlogPostsOrderByDateASC", "query", "page", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBlogPostsOrderByDateDESC", "searchBlogPostsOrderByTitleASC", "searchBlogPostsOrderByTitleDESC", "updateBlogPost", "title", "body", "image", "updated_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BlogPostDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM blog_post Where pk = :pk")
    public abstract java.lang.Object searchBlogPostById(@org.jetbrains.annotations.NotNull()
    java.lang.String pk, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.BlogPost> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM blog_post WHERE pk IN (:pks)")
    public abstract java.lang.Object deleteBlogPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> pks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM blog_post")
    public abstract java.lang.Object deleteAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM blog_post")
    public abstract java.lang.Object getAllBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        UPDATE blog_post \n        SET \n        title = :title,\n        body = :body,\n        image = :image,\n        updated_at = :updated_at\n        WHERE pk = :pk\n        ")
    public abstract java.lang.Object updateBlogPost(@org.jetbrains.annotations.NotNull()
    java.lang.String pk, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p5);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM blog_post WHERE pk = :primaryKey")
    public abstract java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost primaryKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM blog_post")
    public abstract java.lang.Object searchBlogPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM blog_post \n        WHERE title LIKE \'%\' || :query || \'%\' \n        OR body LIKE \'%\' || :query || \'%\' \n        ORDER BY updated_at DESC LIMIT (:page * :pageSize)\n        ")
    public abstract java.lang.Object searchBlogPostsOrderByDateDESC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM blog_post \n        WHERE title LIKE \'%\' || :query || \'%\' \n        OR body LIKE \'%\' || :query || \'%\' \n        ORDER BY updated_at ASC LIMIT (:page * :pageSize)\n        ")
    public abstract java.lang.Object searchBlogPostsOrderByDateASC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM blog_post \n        WHERE title LIKE \'%\' || :query || \'%\' \n        OR body LIKE \'%\' || :query || \'%\' \n        ORDER BY title DESC LIMIT (:page * :pageSize)\n        ")
    public abstract java.lang.Object searchBlogPostsOrderByTitleDESC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM blog_post \n        WHERE title LIKE \'%\' || :query || \'%\' \n        OR body LIKE \'%\' || :query || \'%\' \n        ORDER BY title ASC LIMIT (:page * :pageSize)\n        ")
    public abstract java.lang.Object searchBlogPostsOrderByTitleASC(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM blog_post")
    public abstract java.lang.Object getNumBlogPost(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}