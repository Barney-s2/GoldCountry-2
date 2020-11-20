package com.timetorevenue.openapi.di.auth;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/timetorevenue/openapi/di/auth/AuthModule;", "", "()V", "provideAuthRepository", "Lcom/timetorevenue/openapi/repository/auth/AuthRepository;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "authTokenDao", "Lcom/timetorevenue/openapi/persistence/AuthTokenDao;", "accountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "openApiAuthService", "Lcom/timetorevenue/openapi/api/auth/OpenApiAuthService;", "preferences", "Landroid/content/SharedPreferences;", "editor", "Landroid/content/SharedPreferences$Editor;", "provideOpenApiAuthService", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "app_debug"})
@dagger.Module()
public final class AuthModule {
    public static final com.timetorevenue.openapi.di.auth.AuthModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @AuthScope()
    public static final com.timetorevenue.openapi.api.auth.OpenApiAuthService provideOpenApiAuthService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @AuthScope()
    public static final com.timetorevenue.openapi.repository.auth.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AuthTokenDao authTokenDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.auth.OpenApiAuthService openApiAuthService, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor) {
        return null;
    }
    
    private AuthModule() {
        super();
    }
}