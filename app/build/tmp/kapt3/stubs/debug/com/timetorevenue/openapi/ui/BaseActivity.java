package com.timetorevenue.openapi.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH&J\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H&J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0017H\u0014J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/timetorevenue/openapi/ui/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/timetorevenue/openapi/ui/UICommunicationListener;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "dialogInView", "Lcom/afollestad/materialdialogs/MaterialDialog;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "setSessionManager", "(Lcom/timetorevenue/openapi/session/SessionManager;)V", "areYouSureDialog", "message", "callback", "Lcom/timetorevenue/openapi/ui/AreYouSureCallback;", "stateMessageCallback", "Lcom/timetorevenue/openapi/util/StateMessageCallback;", "displayDialog", "", "response", "Lcom/timetorevenue/openapi/util/Response;", "displayErrorDialog", "displayInfoDialog", "displayProgressBar", "isLoading", "", "displaySuccessDialog", "hideSoftKeyboard", "inject", "isStoragePermissionGranted", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResponseReceived", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.timetorevenue.openapi.ui.UICommunicationListener {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AppDebug";
    private com.afollestad.materialdialogs.MaterialDialog dialogInView;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.timetorevenue.openapi.session.SessionManager sessionManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.session.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager p0) {
    }
    
    public abstract void inject();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResponseReceived(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.Response response, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
    }
    
    private final void displayDialog(com.timetorevenue.openapi.util.Response response, com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
    }
    
    @java.lang.Override()
    public abstract void displayProgressBar(boolean isLoading);
    
    @java.lang.Override()
    public void hideSoftKeyboard() {
    }
    
    @java.lang.Override()
    public boolean isStoragePermissionGranted() {
        return false;
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final com.afollestad.materialdialogs.MaterialDialog displaySuccessDialog(java.lang.String message, com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
        return null;
    }
    
    private final com.afollestad.materialdialogs.MaterialDialog displayErrorDialog(java.lang.String message, com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
        return null;
    }
    
    private final com.afollestad.materialdialogs.MaterialDialog displayInfoDialog(java.lang.String message, com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
        return null;
    }
    
    private final com.afollestad.materialdialogs.MaterialDialog areYouSureDialog(java.lang.String message, com.timetorevenue.openapi.ui.AreYouSureCallback callback, com.timetorevenue.openapi.util.StateMessageCallback stateMessageCallback) {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}