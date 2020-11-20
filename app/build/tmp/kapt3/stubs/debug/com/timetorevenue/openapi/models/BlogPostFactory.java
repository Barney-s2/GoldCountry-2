package com.timetorevenue.openapi.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJJ\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/timetorevenue/openapi/models/BlogPostFactory;", "", "dateUtil", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;", "(Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;)V", "createBlogPostList", "", "Lcom/timetorevenue/openapi/models/BlogPost;", "numBlogPosts", "", "createSingleBlogPost", "id", "", "title", "slug", "body", "image", "username", "app_debug"})
@javax.inject.Singleton()
public final class BlogPostFactory {
    private final com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.models.BlogPost createSingleBlogPost(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.String body, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.models.BlogPost> createBlogPostList(int numBlogPosts) {
        return null;
    }
    
    @javax.inject.Inject()
    public BlogPostFactory(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil) {
        super();
    }
}