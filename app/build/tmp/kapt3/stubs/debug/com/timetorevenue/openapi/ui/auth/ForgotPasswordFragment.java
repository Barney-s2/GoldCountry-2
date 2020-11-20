package com.timetorevenue.openapi.ui.auth;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment;", "Lcom/timetorevenue/openapi/ui/auth/BaseAuthFragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "webInteractionCallback", "Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface$OnWebInteractionCallback;", "getWebInteractionCallback", "()Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface$OnWebInteractionCallback;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "loadPasswordResetWebView", "", "onPasswordResetLinkSent", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "WebAppInterface", "app_debug"})
@com.timetorevenue.openapi.di.auth.AuthScope()
public final class ForgotPasswordFragment extends com.timetorevenue.openapi.ui.auth.BaseAuthFragment {
    @org.jetbrains.annotations.NotNull()
    public android.webkit.WebView webView;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.ui.auth.ForgotPasswordFragment.WebAppInterface.OnWebInteractionCallback webInteractionCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebView getWebView() {
        return null;
    }
    
    public final void setWebView(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.ui.auth.ForgotPasswordFragment.WebAppInterface.OnWebInteractionCallback getWebInteractionCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public final void loadPasswordResetWebView() {
    }
    
    public final void onPasswordResetLinkSent() {
    }
    
    @javax.inject.Inject()
    public ForgotPasswordFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        super(0, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface;", "", "callback", "Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface$OnWebInteractionCallback;", "(Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface$OnWebInteractionCallback;)V", "TAG", "", "onError", "", "errorMessage", "onLoading", "isLoading", "", "onSuccess", "email", "OnWebInteractionCallback", "app_debug"})
    public static final class WebAppInterface {
        private final java.lang.String TAG = "AppDebug";
        private final com.timetorevenue.openapi.ui.auth.ForgotPasswordFragment.WebAppInterface.OnWebInteractionCallback callback = null;
        
        @android.webkit.JavascriptInterface()
        public final void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String email) {
        }
        
        @android.webkit.JavascriptInterface()
        public final void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage) {
        }
        
        @android.webkit.JavascriptInterface()
        public final void onLoading(boolean isLoading) {
        }
        
        public WebAppInterface(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.ui.auth.ForgotPasswordFragment.WebAppInterface.OnWebInteractionCallback callback) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/ui/auth/ForgotPasswordFragment$WebAppInterface$OnWebInteractionCallback;", "", "onError", "", "errorMessage", "", "onLoading", "isLoading", "", "onSuccess", "email", "app_debug"})
        public static abstract interface OnWebInteractionCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
            java.lang.String email);
            
            public abstract void onError(@org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage);
            
            public abstract void onLoading(boolean isLoading);
        }
    }
}