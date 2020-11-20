package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001d\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/timetorevenue/openapi/util/ApiResponseHandler;", "ViewState", "Data", "", "response", "Lcom/timetorevenue/openapi/util/ApiResult;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "(Lcom/timetorevenue/openapi/util/ApiResult;Lcom/timetorevenue/openapi/util/StateEvent;)V", "TAG", "", "getResult", "Lcom/timetorevenue/openapi/util/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccess", "resultObj", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class ApiResponseHandler<ViewState extends java.lang.Object, Data extends java.lang.Object> {
    private final java.lang.String TAG = "AppDebug";
    private final com.timetorevenue.openapi.util.ApiResult<Data> response = null;
    private final com.timetorevenue.openapi.util.StateEvent stateEvent = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.DataState<ViewState>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handleSuccess(Data resultObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.util.DataState<ViewState>> p1);
    
    public ApiResponseHandler(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.ApiResult<? extends Data> response, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        super();
    }
}