package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/timetorevenue/openapi/util/DataState;", "T", "", "stateMessage", "Lcom/timetorevenue/openapi/util/StateMessage;", "data", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "(Lcom/timetorevenue/openapi/util/StateMessage;Ljava/lang/Object;Lcom/timetorevenue/openapi/util/StateEvent;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getStateEvent", "()Lcom/timetorevenue/openapi/util/StateEvent;", "setStateEvent", "(Lcom/timetorevenue/openapi/util/StateEvent;)V", "getStateMessage", "()Lcom/timetorevenue/openapi/util/StateMessage;", "setStateMessage", "(Lcom/timetorevenue/openapi/util/StateMessage;)V", "component1", "component2", "component3", "copy", "(Lcom/timetorevenue/openapi/util/StateMessage;Ljava/lang/Object;Lcom/timetorevenue/openapi/util/StateEvent;)Lcom/timetorevenue/openapi/util/DataState;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
public final class DataState<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.util.StateMessage stateMessage;
    @org.jetbrains.annotations.Nullable()
    private T data;
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.util.StateEvent stateEvent;
    public static final com.timetorevenue.openapi.util.DataState.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.util.StateMessage getStateMessage() {
        return null;
    }
    
    public final void setStateMessage(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateMessage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.util.StateEvent getStateEvent() {
        return null;
    }
    
    public final void setStateEvent(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateEvent p0) {
    }
    
    public DataState(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateMessage stateMessage, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        super();
    }
    
    public DataState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.util.StateMessage component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.util.StateEvent component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.util.DataState<T> copy(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateMessage stateMessage, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u0001H\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a8\u0006\f"}, d2 = {"Lcom/timetorevenue/openapi/util/DataState$Companion;", "", "()V", "data", "Lcom/timetorevenue/openapi/util/DataState;", "T", "response", "Lcom/timetorevenue/openapi/util/Response;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "(Lcom/timetorevenue/openapi/util/Response;Ljava/lang/Object;Lcom/timetorevenue/openapi/util/StateEvent;)Lcom/timetorevenue/openapi/util/DataState;", "error", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.timetorevenue.openapi.util.DataState<T> error(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.util.Response response, @org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.util.StateEvent stateEvent) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.timetorevenue.openapi.util.DataState<T> data(@org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.util.Response response, @org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.util.StateEvent stateEvent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}