package com.timetorevenue.openapi.persistence;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"BLOG_FILTER_DATE_CREATED", "", "BLOG_FILTER_TITLE", "BLOG_ORDER_ASC", "BLOG_ORDER_DESC", "BLOG_PAGINATION_PAGE_SIZE", "", "ORDER_BY_ASC_DATE_UPDATED", "ORDER_BY_ASC_TITLE", "ORDER_BY_DESC_DATE_UPDATED", "ORDER_BY_DESC_TITLE", "returnOrderedQuery", "", "Lcom/timetorevenue/openapi/models/BlogPost;", "Lcom/timetorevenue/openapi/persistence/BlogPostDao;", "query", "filterAndOrder", "page", "(Lcom/timetorevenue/openapi/persistence/BlogPostDao;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class BlogPostDaoKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOG_ORDER_ASC = "";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOG_ORDER_DESC = "-";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOG_FILTER_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOG_FILTER_DATE_CREATED = "created_at";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDER_BY_ASC_DATE_UPDATED = "created_at";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDER_BY_DESC_DATE_UPDATED = "-created_at";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDER_BY_ASC_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDER_BY_DESC_TITLE = "-title";
    public static final int BLOG_PAGINATION_PAGE_SIZE = 30;
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object returnOrderedQuery(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.BlogPostDao $this$returnOrderedQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String filterAndOrder, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.timetorevenue.openapi.models.BlogPost>> p4) {
        return null;
    }
}