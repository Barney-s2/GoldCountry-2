package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/util/CacheResponseHandler;", "ViewState", "Data", "", "response", "Lcom/timetorevenue/openapi/util/CacheResult;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "(Lcom/timetorevenue/openapi/util/CacheResult;Lcom/timetorevenue/openapi/util/StateEvent;)V", "getResult", "Lcom/timetorevenue/openapi/util/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccess", "resultObj", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class CacheResponseHandler<ViewState extends java.lang.Object, Data extends java.lang.Object> {
    private final com.timetorevenue.openapi.util.CacheResult<Data> response = null;
    private final com.timetorevenue.openapi.util.StateEvent stateEvent = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.DataState<ViewState>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handleSuccess(Data resultObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.DataState<ViewState>> p1);
    
    public CacheResponseHandler(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.CacheResult<? extends Data> response, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        super();
    }
}