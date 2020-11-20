package com.timetorevenue.openapi.repository.main.business.interactors.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J)\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/interactors/common/DeleteBlogPost;", "ViewState", "", "noteCacheDataSource", "error/NonExistentClass", "noteNetworkDataSource", "(Lerror/NonExistentClass;Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "deleteBlogPost", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/DataState;", "note", "stateEvent", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEvent;", "(Lerror/NonExistentClass;Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEvent;)Lkotlinx/coroutines/flow/Flow;", "Companion", "app_debug"})
public final class DeleteBlogPost<ViewState extends java.lang.Object> {
    private final error.NonExistentClass noteCacheDataSource = null;
    private final error.NonExistentClass noteNetworkDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_NOTE_SUCCESS = "Successfully deleted note.";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_NOTE_PENDING = "Delete pending...";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_NOTE_FAILED = "Failed to delete note.";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_ARE_YOU_SURE = "Are you sure you want to delete this?";
    public static final com.timetorevenue.openapi.repository.main.business.interactors.common.DeleteBlogPost.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.repository.main.business.domain.state.DataState<ViewState>> deleteBlogPost(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass note, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
        return null;
    }
    
    public DeleteBlogPost(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass noteCacheDataSource, @org.jetbrains.annotations.NotNull()
    error.NonExistentClass noteNetworkDataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/interactors/common/DeleteBlogPost$Companion;", "", "()V", "DELETE_ARE_YOU_SURE", "", "getDELETE_ARE_YOU_SURE", "()Ljava/lang/String;", "DELETE_NOTE_FAILED", "getDELETE_NOTE_FAILED", "DELETE_NOTE_PENDING", "getDELETE_NOTE_PENDING", "DELETE_NOTE_SUCCESS", "getDELETE_NOTE_SUCCESS", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE_NOTE_SUCCESS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE_NOTE_PENDING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE_NOTE_FAILED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE_ARE_YOU_SURE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}