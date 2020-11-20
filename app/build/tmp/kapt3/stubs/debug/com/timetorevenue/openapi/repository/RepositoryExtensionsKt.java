package com.timetorevenue.openapi.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001aG\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u001aG\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0018\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001e\u0010\u0019\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"TAG", "", "buildError", "Lcom/timetorevenue/openapi/util/DataState;", "ViewState", "message", "uiComponentType", "Lcom/timetorevenue/openapi/util/UIComponentType;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "convertErrorBody", "throwable", "Lretrofit2/HttpException;", "safeApiCall", "Lcom/timetorevenue/openapi/util/ApiResult;", "T", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeCacheCall", "Lcom/timetorevenue/openapi/util/CacheResult;", "cacheCall", "app_debug"})
public final class RepositoryExtensionsKt {
    
    /**
     * Reference: https://medium.com/@douglas.iacovelli/how-to-handle-errors-with-retrofit-and-coroutines-33e7492a912
     */
    private static final java.lang.String TAG = "AppDebug";
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.ApiResult<? extends T>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeCacheCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> cacheCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.CacheResult<? extends T>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <ViewState extends java.lang.Object>com.timetorevenue.openapi.util.DataState<ViewState> buildError(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.UIComponentType uiComponentType, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    private static final java.lang.String convertErrorBody(retrofit2.HttpException throwable) {
        return null;
    }
}