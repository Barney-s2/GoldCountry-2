package com.timetorevenue.openapi.ui;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0010J\u000b\u0010\u001e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0010J\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J\r\u0010$\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'J\"\u0010(\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'H&J\u0013\u0010-\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00028\u0000\u00a2\u0006\u0002\u0010#J\u0006\u0010.\u001a\u00020\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006/"}, d2 = {"Lcom/timetorevenue/openapi/ui/BaseViewModel;", "ViewState", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "dataChannelManager", "Lcom/timetorevenue/openapi/util/DataChannelManager;", "getDataChannelManager", "()Lcom/timetorevenue/openapi/util/DataChannelManager;", "numActiveJobs", "Landroidx/lifecycle/LiveData;", "", "getNumActiveJobs", "()Landroidx/lifecycle/LiveData;", "stateMessage", "Lcom/timetorevenue/openapi/util/StateMessage;", "getStateMessage", "viewState", "getViewState", "areAnyJobsActive", "", "cancelActiveJobs", "", "clearStateMessage", "index", "getCurrentViewStateOrNew", "()Ljava/lang/Object;", "getMessageStackSize", "handleNewData", "data", "(Ljava/lang/Object;)V", "initNewViewState", "isJobAlreadyActive", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "launchJob", "jobFunction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "setStateEvent", "setViewState", "setupChannel", "app_debug"})
public abstract class BaseViewModel<ViewState extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AppDebug";
    private final androidx.lifecycle.MutableLiveData<ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.util.DataChannelManager<ViewState> dataChannelManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> numActiveJobs = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.util.DataChannelManager<ViewState> getDataChannelManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNumActiveJobs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.timetorevenue.openapi.util.StateMessage> getStateMessage() {
        return null;
    }
    
    public final int getMessageStackSize() {
        return 0;
    }
    
    public final void setupChannel() {
    }
    
    public abstract void handleNewData(ViewState data);
    
    public abstract void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    public final void launchJob(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<ViewState>> jobFunction) {
    }
    
    public final boolean areAnyJobsActive() {
        return false;
    }
    
    public final boolean isJobAlreadyActive(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return false;
    }
    
    public final ViewState getCurrentViewStateOrNew() {
        return null;
    }
    
    public final void setViewState(ViewState viewState) {
    }
    
    public final void clearStateMessage(int index) {
    }
    
    public void cancelActiveJobs() {
    }
    
    public abstract ViewState initNewViewState();
    
    public BaseViewModel() {
        super();
    }
}