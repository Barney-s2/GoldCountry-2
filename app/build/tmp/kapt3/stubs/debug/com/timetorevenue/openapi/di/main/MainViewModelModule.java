package com.timetorevenue.openapi.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/timetorevenue/openapi/di/main/MainViewModelModule;", "", "()V", "bindAccountViewModel", "Landroidx/lifecycle/ViewModel;", "accoutViewModel", "Lcom/timetorevenue/openapi/ui/main/account/AccountViewModel;", "bindBlogViewModel", "blogViewModel", "Lcom/timetorevenue/openapi/ui/main/blog/viewmodel/BlogViewModel;", "bindCreateBlogViewModel", "createBlogViewModel", "Lcom/timetorevenue/openapi/ui/main/create_blog/CreateBlogViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/timetorevenue/openapi/viewmodels/MainViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class MainViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.viewmodels.MainViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @com.timetorevenue.openapi.di.auth.keys.MainViewModelKey(value = com.timetorevenue.openapi.ui.main.account.AccountViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAccountViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.account.AccountViewModel accoutViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.timetorevenue.openapi.di.auth.keys.MainViewModelKey(value = com.timetorevenue.openapi.ui.main.blog.viewmodel.BlogViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBlogViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.blog.viewmodel.BlogViewModel blogViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.timetorevenue.openapi.di.auth.keys.MainViewModelKey(value = com.timetorevenue.openapi.ui.main.create_blog.CreateBlogViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindCreateBlogViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.create_blog.CreateBlogViewModel createBlogViewModel);
    
    public MainViewModelModule() {
        super();
    }
}