package com.timetorevenue.openapi.repository.auth;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ,\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J<\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u0010H\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\u0010H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006,"}, d2 = {"Lcom/timetorevenue/openapi/repository/auth/AuthRepositoryImpl;", "Lcom/timetorevenue/openapi/repository/auth/AuthRepository;", "authTokenDao", "Lcom/timetorevenue/openapi/persistence/AuthTokenDao;", "accountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "openApiAuthService", "Lcom/timetorevenue/openapi/api/auth/OpenApiAuthService;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "sharedPreferences", "Landroid/content/SharedPreferences;", "sharedPrefsEditor", "Landroid/content/SharedPreferences$Editor;", "(Lcom/timetorevenue/openapi/persistence/AuthTokenDao;Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;Lcom/timetorevenue/openapi/api/auth/OpenApiAuthService;Lcom/timetorevenue/openapi/session/SessionManager;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;)V", "TAG", "", "getAccountPropertiesDao", "()Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "getAuthTokenDao", "()Lcom/timetorevenue/openapi/persistence/AuthTokenDao;", "getOpenApiAuthService", "()Lcom/timetorevenue/openapi/api/auth/OpenApiAuthService;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getSharedPrefsEditor", "()Landroid/content/SharedPreferences$Editor;", "attemptLogin", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/auth/state/AuthViewState;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "email", "password", "attemptRegistration", "username", "confirmPassword", "checkPreviousAuthUser", "returnNoTokenFound", "saveAuthenticatedUserToPrefs", "", "app_debug"})
@com.timetorevenue.openapi.di.auth.AuthScope()
public final class AuthRepositoryImpl implements com.timetorevenue.openapi.repository.auth.AuthRepository {
    private final java.lang.String TAG = "AppDebug";
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.persistence.AuthTokenDao authTokenDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.api.auth.OpenApiAuthService openApiAuthService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences.Editor sharedPrefsEditor = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> attemptLogin(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> attemptRegistration(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> checkPreviousAuthUser(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @java.lang.Override()
    public void saveAuthenticatedUserToPrefs(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState> returnNoTokenFound(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.persistence.AuthTokenDao getAuthTokenDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.persistence.AccountPropertiesDao getAccountPropertiesDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.api.auth.OpenApiAuthService getOpenApiAuthService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.session.SessionManager getSessionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getSharedPrefsEditor() {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AuthTokenDao authTokenDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.auth.OpenApiAuthService openApiAuthService, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor sharedPrefsEditor) {
        super();
    }
}