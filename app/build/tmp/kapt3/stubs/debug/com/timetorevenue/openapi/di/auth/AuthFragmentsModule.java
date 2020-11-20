package com.timetorevenue.openapi.di.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/di/auth/AuthFragmentsModule;", "", "()V", "provideFragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
@dagger.Module()
public final class AuthFragmentsModule {
    public static final com.timetorevenue.openapi.di.auth.AuthFragmentsModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @AuthScope()
    public static final androidx.fragment.app.FragmentFactory provideFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        return null;
    }
    
    private AuthFragmentsModule() {
        super();
    }
}