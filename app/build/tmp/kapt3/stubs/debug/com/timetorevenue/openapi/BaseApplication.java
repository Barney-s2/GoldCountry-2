package com.timetorevenue.openapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/timetorevenue/openapi/BaseApplication;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/timetorevenue/openapi/di/AppComponent;", "getAppComponent", "()Lcom/timetorevenue/openapi/di/AppComponent;", "setAppComponent", "(Lcom/timetorevenue/openapi/di/AppComponent;)V", "authComponent", "Lcom/timetorevenue/openapi/di/auth/AuthComponent;", "mainComponent", "Lcom/timetorevenue/openapi/di/main/MainComponent;", "initAppComponent", "", "onCreate", "releaseAuthComponent", "releaseMainComponent", "app_debug"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.timetorevenue.openapi.di.AppComponent appComponent;
    private com.timetorevenue.openapi.di.auth.AuthComponent authComponent;
    private com.timetorevenue.openapi.di.main.MainComponent mainComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.di.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.di.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void releaseMainComponent() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.di.main.MainComponent mainComponent() {
        return null;
    }
    
    public final void releaseAuthComponent() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.di.auth.AuthComponent authComponent() {
        return null;
    }
    
    public final void initAppComponent() {
    }
    
    public BaseApplication() {
        super();
    }
}