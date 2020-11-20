package com.timetorevenue.openapi.repository;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BX\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u001e\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0010R+\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/timetorevenue/openapi/repository/NetworkBoundResource;", "NetworkObj", "CacheObj", "ViewState", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "cacheCall", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/timetorevenue/openapi/util/StateEvent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "Lkotlin/jvm/functions/Function1;", "result", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "getResult", "()Lkotlinx/coroutines/flow/Flow;", "handleCacheSuccess", "resultObj", "(Ljava/lang/Object;)Lcom/timetorevenue/openapi/util/DataState;", "returnCache", "markJobComplete", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCache", "", "networkObject", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class NetworkBoundResource<NetworkObj extends java.lang.Object, CacheObj extends java.lang.Object, ViewState extends java.lang.Object> {
    private final java.lang.String TAG = "AppDebug";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<ViewState>> result = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.timetorevenue.openapi.util.StateEvent stateEvent = null;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super NetworkObj>, java.lang.Object> apiCall = null;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super CacheObj>, java.lang.Object> cacheCall = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<ViewState>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCache(NetworkObj networkObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.util.DataState<ViewState> handleCacheSuccess(CacheObj resultObj);
    
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super NetworkObj>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super CacheObj>, ? extends java.lang.Object> cacheCall) {
        super();
    }
}