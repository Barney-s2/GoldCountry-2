package com.timetorevenue.openapi.di.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/timetorevenue/openapi/di/main/ProductionModule;", "", "()V", "provideBlogPostDb", "Lcom/timetorevenue/openapi/persistence/AppDatabase;", "app", "Lcom/timetorevenue/openapi/BaseApplication;", "provideFirebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "application", "app_debug"})
@dagger.Module()
public final class ProductionModule {
    public static final com.timetorevenue.openapi.di.main.ProductionModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.timetorevenue.openapi.persistence.AppDatabase provideBlogPostDb(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.BaseApplication app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.google.firebase.firestore.FirebaseFirestore provideFirebaseFirestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.BaseApplication application) {
        return null;
    }
    
    private ProductionModule() {
        super();
    }
}