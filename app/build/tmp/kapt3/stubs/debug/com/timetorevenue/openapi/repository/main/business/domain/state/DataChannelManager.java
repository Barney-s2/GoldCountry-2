package com.timetorevenue.openapi.repository.main.business.domain.state;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u0006\u0010$\u001a\u00020\u0005J\u0015\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\u000e\u0010*\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010+\u001a\u00020\u000fH\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0/J\u0016\u00100\u001a\u00020\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0006\u00102\u001a\u00020\u0015J\u0010\u00103\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u00104\u001a\u00020\u0015J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/DataChannelManager;", "ViewState", "", "()V", "channelScope", "Lkotlinx/coroutines/CoroutineScope;", "dataChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/DataState;", "messageStack", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageStack;", "getMessageStack", "()Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageStack;", "shouldDisplayProgressBar", "Landroidx/lifecycle/LiveData;", "", "getShouldDisplayProgressBar", "()Landroidx/lifecycle/LiveData;", "stateEventManager", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEventManager;", "addStateEvent", "", "stateEvent", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEvent;", "appendStateMessage", "stateMessage", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateMessage;", "cancelJobs", "clearActiveStateEventCounter", "clearAllStateMessages", "clearStateMessage", "index", "", "getActiveJobs", "", "", "getChannelScope", "handleNewData", "data", "(Ljava/lang/Object;)V", "handleNewStateMessage", "initChannel", "isJobAlreadyActive", "isMessageStackEmpty", "isStateEventActive", "launchJob", "jobFunction", "Lkotlinx/coroutines/flow/Flow;", "offerToDataChannel", "dataState", "printStateMessages", "removeStateEvent", "setupChannel", "setupNewChannelScope", "coroutineScope", "app_debug"})
public abstract class DataChannelManager<ViewState extends java.lang.Object> {
    private final kotlinx.coroutines.channels.BroadcastChannel<com.timetorevenue.openapi.repository.main.business.domain.state.DataState<ViewState>> dataChannel = null;
    private kotlinx.coroutines.CoroutineScope channelScope;
    private final com.timetorevenue.openapi.repository.main.business.domain.state.StateEventManager stateEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.repository.main.business.domain.state.MessageStack messageStack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldDisplayProgressBar = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.main.business.domain.state.MessageStack getMessageStack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldDisplayProgressBar() {
        return null;
    }
    
    public final void setupChannel() {
    }
    
    private final void initChannel() {
    }
    
    public abstract void handleNewData(ViewState data);
    
    private final void offerToDataChannel(com.timetorevenue.openapi.repository.main.business.domain.state.DataState<ViewState> dataState) {
    }
    
    public final void launchJob(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.repository.main.business.domain.state.DataState<ViewState>> jobFunction) {
    }
    
    private final boolean isMessageStackEmpty() {
        return false;
    }
    
    private final void handleNewStateMessage(com.timetorevenue.openapi.repository.main.business.domain.state.StateMessage stateMessage) {
    }
    
    private final void appendStateMessage(com.timetorevenue.openapi.repository.main.business.domain.state.StateMessage stateMessage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.main.business.domain.state.StateMessage clearStateMessage(int index) {
        return null;
    }
    
    public final void clearAllStateMessages() {
    }
    
    public final void printStateMessages() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getActiveJobs() {
        return null;
    }
    
    public final void clearActiveStateEventCounter() {
    }
    
    private final void addStateEvent(com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
    }
    
    public final void removeStateEvent(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
    }
    
    private final boolean isStateEventActive(com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
        return false;
    }
    
    public final boolean isJobAlreadyActive(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.state.StateEvent stateEvent) {
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
    
    public DataChannelManager() {
        super();
    }
}