package com.timetorevenue.openapi.di;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/timetorevenue/openapi/di/AppModule;", "", "()V", "provideAccountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "db", "Lcom/timetorevenue/openapi/persistence/AppDatabase;", "provideAppDb", "app", "Landroid/app/Application;", "provideAuthTokenDao", "Lcom/timetorevenue/openapi/persistence/AuthTokenDao;", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "application", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "provideGsonBuilder", "Lcom/google/gson/Gson;", "provideRequestOptions", "provideRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "gsonBuilder", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPrefsEditor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.timetorevenue.openapi.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final android.content.SharedPreferences.Editor provideSharedPrefsEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.google.gson.Gson provideGsonBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final retrofit2.Retrofit.Builder provideRetrofitBuilder(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gsonBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.timetorevenue.openapi.persistence.AppDatabase provideAppDb(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.timetorevenue.openapi.persistence.AuthTokenDao provideAuthTokenDao(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.timetorevenue.openapi.persistence.AccountPropertiesDao provideAccountPropertiesDao(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.bumptech.glide.request.RequestOptions provideRequestOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}