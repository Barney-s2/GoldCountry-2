package com.timetorevenue.openapi.di;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/di/AppComponent;", "", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "authComponent", "Lcom/timetorevenue/openapi/di/auth/AuthComponent$Factory;", "inject", "", "baseActivity", "Lcom/timetorevenue/openapi/ui/BaseActivity;", "mainComponent", "Lcom/timetorevenue/openapi/di/main/MainComponent$Factory;", "Builder", "app_debug"})
@dagger.Component(modules = {com.timetorevenue.openapi.di.AppModule.class, com.timetorevenue.openapi.di.SubComponentsModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.session.SessionManager getSessionManager();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.BaseActivity baseActivity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.di.auth.AuthComponent.Factory authComponent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.di.main.MainComponent.Factory mainComponent();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/timetorevenue/openapi/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/timetorevenue/openapi/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.timetorevenue.openapi.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.timetorevenue.openapi.di.AppComponent build();
    }
}