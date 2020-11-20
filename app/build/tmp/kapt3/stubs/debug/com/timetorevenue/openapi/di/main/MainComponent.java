package com.timetorevenue.openapi.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/di/main/MainComponent;", "", "inject", "", "mainActivity", "Lcom/timetorevenue/openapi/ui/main/MainActivity;", "Factory", "app_debug"})
@dagger.Subcomponent(modules = {com.timetorevenue.openapi.di.main.MainModule.class, com.timetorevenue.openapi.di.main.MainViewModelModule.class, com.timetorevenue.openapi.di.main.MainFragmentsModule.class})
@MainScope()
public abstract interface MainComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.MainActivity mainActivity);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/timetorevenue/openapi/di/main/MainComponent$Factory;", "", "create", "Lcom/timetorevenue/openapi/di/main/MainComponent;", "app_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.timetorevenue.openapi.di.main.MainComponent create();
    }
}