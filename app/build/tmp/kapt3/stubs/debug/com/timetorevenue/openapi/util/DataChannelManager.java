package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0017J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\rJ\u0015\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010&\u001a\u00020\'2\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010(\u001a\u00020\'2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,0+J\u0012\u0010-\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0006\u0010.\u001a\u00020\u0017J\u0010\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002J\b\u00101\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00062"}, d2 = {"Lcom/timetorevenue/openapi/util/DataChannelManager;", "ViewState", "", "()V", "TAG", "", "_activeStateEvents", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "_numActiveJobs", "Landroidx/lifecycle/MutableLiveData;", "", "channelScope", "Lkotlinx/coroutines/CoroutineScope;", "messageStack", "Lcom/timetorevenue/openapi/util/MessageStack;", "getMessageStack", "()Lcom/timetorevenue/openapi/util/MessageStack;", "numActiveJobs", "Landroidx/lifecycle/LiveData;", "getNumActiveJobs", "()Landroidx/lifecycle/LiveData;", "addStateEvent", "", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "appendStateMessage", "stateMessage", "Lcom/timetorevenue/openapi/util/StateMessage;", "cancelJobs", "clearActiveStateEventCounter", "clearStateMessage", "index", "getChannelScope", "handleNewData", "data", "(Ljava/lang/Object;)V", "handleNewStateMessage", "isJobAlreadyActive", "", "isStateEventActive", "launchJob", "jobFunction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "removeStateEvent", "setupChannel", "setupNewChannelScope", "coroutineScope", "syncNumActiveStateEvents", "app_debug"})
public abstract class DataChannelManager<ViewState extends java.lang.Object> {
    private final java.lang.String TAG = "AppDebug";
    private final java.util.HashSet<java.lang.String> _activeStateEvents = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _numActiveJobs = null;
    private kotlinx.coroutines.CoroutineScope channelScope;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.util.MessageStack messageStack = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.util.MessageStack getMessageStack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNumActiveJobs() {
        return null;
    }
    
    public final void setupChannel() {
    }
    
    public abstract void handleNewData(ViewState data);
    
    public final void launchJob(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<ViewState>> jobFunction) {
    }
    
    private final void handleNewStateMessage(com.timetorevenue.openapi.util.StateMessage stateMessage) {
    }
    
    private final void appendStateMessage(com.timetorevenue.openapi.util.StateMessage stateMessage) {
    }
    
    public final void clearStateMessage(int index) {
    }
    
    private final void clearActiveStateEventCounter() {
    }
    
    private final void addStateEvent(com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    private final void removeStateEvent(com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    public final boolean isJobAlreadyActive(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return false;
    }
    
    private final boolean isStateEventActive(com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getChannelScope() {
        return null;
    }
    
    private final kotlinx.coroutines.CoroutineScope setupNewChannelScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
    
    public final void cancelJobs() {
    }
    
    private final void syncNumActiveStateEvents() {
    }
    
    public DataChannelManager() {
        super();
    }
}