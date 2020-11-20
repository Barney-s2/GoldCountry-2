package com.timetorevenue.openapi.di.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/timetorevenue/openapi/di/main/MainModule;", "", "()V", "provideAccountRepository", "Lcom/timetorevenue/openapi/repository/main/AccountRepository;", "openApiMainService", "Lcom/timetorevenue/openapi/api/main/OpenApiMainService;", "accountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "provideBlogPostDao", "Lcom/timetorevenue/openapi/persistence/BlogPostDao;", "db", "Lcom/timetorevenue/openapi/persistence/AppDatabase;", "provideBlogRepository", "Lcom/timetorevenue/openapi/repository/main/BlogRepositoryImpl;", "blogPostDao", "provideCreateBlogRepository", "Lcom/timetorevenue/openapi/repository/main/CreateBlogRepositoryImpl;", "provideOpenApiMainService", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "app_debug"})
@dagger.Module()
public final class MainModule {
    public static final com.timetorevenue.openapi.di.main.MainModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MainScope()
    public static final com.timetorevenue.openapi.api.main.OpenApiMainService provideOpenApiMainService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MainScope()
    public static final com.timetorevenue.openapi.repository.main.AccountRepository provideAccountRepository(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.main.OpenApiMainService openApiMainService, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MainScope()
    public static final com.timetorevenue.openapi.persistence.BlogPostDao provideBlogPostDao(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MainScope()
    public static final com.timetorevenue.openapi.repository.main.BlogRepositoryImpl provideBlogRepository(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.main.OpenApiMainService openApiMainService, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.BlogPostDao blogPostDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MainScope()
    public static final com.timetorevenue.openapi.repository.main.CreateBlogRepositoryImpl provideCreateBlogRepository(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.main.OpenApiMainService openApiMainService, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.BlogPostDao blogPostDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager) {
        return null;
    }
    
    private MainModule() {
        super();
    }
}