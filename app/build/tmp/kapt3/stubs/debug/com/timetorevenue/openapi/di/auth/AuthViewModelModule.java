package com.timetorevenue.openapi.di.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/di/auth/AuthViewModelModule;", "", "()V", "bindAuthViewModel", "Landroidx/lifecycle/ViewModel;", "authViewModel", "Lcom/timetorevenue/openapi/ui/auth/AuthViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/timetorevenue/openapi/viewmodels/AuthViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class AuthViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @AuthScope()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.viewmodels.AuthViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @com.timetorevenue.openapi.di.auth.keys.AuthViewModelKey(value = com.timetorevenue.openapi.ui.auth.AuthViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @AuthScope()
    public abstract androidx.lifecycle.ViewModel bindAuthViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.auth.AuthViewModel authViewModel);
    
    public AuthViewModelModule() {
        super();
    }
}