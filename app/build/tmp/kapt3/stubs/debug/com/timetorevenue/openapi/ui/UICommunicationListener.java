package com.timetorevenue.openapi.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/timetorevenue/openapi/ui/UICommunicationListener;", "", "displayProgressBar", "", "isLoading", "", "expandAppBar", "hideSoftKeyboard", "isStoragePermissionGranted", "onResponseReceived", "response", "Lcom/timetorevenue/openapi/util/Response;", "stateMessageCallback", "Lcom/timetorevenue/openapi/util/StateMessageCallback;", "app_debug"})
public abstract interface UICommunicationListener {
    
    public abstract void onResponseReceived(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.Response response, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback);
    
    public abstract void displayProgressBar(boolean isLoading);
    
    public abstract void expandAppBar();
    
    public abstract void hideSoftKeyboard();
    
    public abstract boolean isStoragePermissionGranted();
}