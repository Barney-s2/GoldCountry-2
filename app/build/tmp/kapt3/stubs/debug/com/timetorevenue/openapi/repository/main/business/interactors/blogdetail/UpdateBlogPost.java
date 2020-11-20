package com.timetorevenue.openapi.repository.main.business.interactors.blogdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ#\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/interactors/blogdetail/UpdateBlogPost;", "", "blogPostCacheDataSource", "Lcom/timetorevenue/openapi/repository/main/business/data/cache/abstraction/BlogPostCacheDataSource;", "blogPostNetworkDataSource", "Lcom/timetorevenue/openapi/repository/main/business/data/network/abstraction/BlogPostNetworkDataSource;", "(Lcom/timetorevenue/openapi/repository/main/business/data/cache/abstraction/BlogPostCacheDataSource;Lcom/timetorevenue/openapi/repository/main/business/data/network/abstraction/BlogPostNetworkDataSource;)V", "updatBlogPost", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/DataState;", "Lcom/timetorevenue/openapi/repository/main/framework/presentation/blogdetail/state/BlogDetailViewState;", "blogPost", "Lcom/timetorevenue/openapi/models/BlogPost;", "stateEvent", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEvent;", "updateNetwork", "", "response", "", "(Ljava/lang/String;Lcom/timetorevenue/openapi/models/BlogPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UpdateBlogPost {
    private final com.timetorevenue.openapi.repository.main.business.data.cache.abstraction.BlogPostCacheDataSource blogPostCacheDataSource = null;
    private final com.timetorevenue.openapi.repository.main.business.data.network.abstraction.BlogPostNetworkDataSource blogPostNetworkDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UPDATE_BLOGPOST_SUCCESS = "Successfully updated blogPost.";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UPDATE_BLOGPOST_FAILED = "Failed to update blogPost.";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UPDATE_BLOGPOST_FAILED_PK = "Update failed. BlogPost is missing primary key.";
    public static final com.timetorevenue.openapi.repository.main.business.interactors.blogdetail.UpdateBlogPost.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.repository.main.business.domain.state.DataState<com.timetorevenue.openapi.repository.main.framework.presentation.blogdetail.state.BlogDetailViewState>> updatBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost blogPost, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
        return null;
    }
    
    public UpdateBlogPost(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.data.cache.abstraction.BlogPostCacheDataSource blogPostCacheDataSource, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.data.network.abstraction.BlogPostNetworkDataSource blogPostNetworkDataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/interactors/blogdetail/UpdateBlogPost$Companion;", "", "()V", "UPDATE_BLOGPOST_FAILED", "", "getUPDATE_BLOGPOST_FAILED", "()Ljava/lang/String;", "UPDATE_BLOGPOST_FAILED_PK", "getUPDATE_BLOGPOST_FAILED_PK", "UPDATE_BLOGPOST_SUCCESS", "getUPDATE_BLOGPOST_SUCCESS", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPDATE_BLOGPOST_SUCCESS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPDATE_BLOGPOST_FAILED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPDATE_BLOGPOST_FAILED_PK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}