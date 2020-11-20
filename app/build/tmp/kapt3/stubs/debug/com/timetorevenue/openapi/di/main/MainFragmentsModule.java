package com.timetorevenue.openapi.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/timetorevenue/openapi/di/main/MainFragmentsModule;", "", "()V", "provideAccountFragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "provideBlogFragmentFactory", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "provideCreateBlogFragmentFactory", "app_debug"})
@dagger.Module()
public final class MainFragmentsModule {
    public static final com.timetorevenue.openapi.di.main.MainFragmentsModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "AccountFragmentFactory")
    @dagger.Provides()
    @MainScope()
    public static final androidx.fragment.app.FragmentFactory provideAccountFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "BlogFragmentFactory")
    @dagger.Provides()
    @MainScope()
    public static final androidx.fragment.app.FragmentFactory provideBlogFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "CreateBlogFragmentFactory")
    @dagger.Provides()
    @MainScope()
    public static final androidx.fragment.app.FragmentFactory provideCreateBlogFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager) {
        return null;
    }
    
    private MainFragmentsModule() {
        super();
    }
}