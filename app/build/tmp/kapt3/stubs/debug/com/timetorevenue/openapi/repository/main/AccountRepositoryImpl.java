package com.timetorevenue.openapi.repository.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J4\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J<\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/timetorevenue/openapi/repository/main/AccountRepositoryImpl;", "Lcom/timetorevenue/openapi/repository/main/AccountRepository;", "openApiMainService", "Lcom/timetorevenue/openapi/api/main/OpenApiMainService;", "accountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "(Lcom/timetorevenue/openapi/api/main/OpenApiMainService;Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;Lcom/timetorevenue/openapi/session/SessionManager;)V", "TAG", "", "getAccountPropertiesDao", "()Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "getOpenApiMainService", "()Lcom/timetorevenue/openapi/api/main/OpenApiMainService;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "getAccountProperties", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountViewState;", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "saveAccountProperties", "email", "username", "updatePassword", "currentPassword", "newPassword", "confirmNewPassword", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public final class AccountRepositoryImpl implements com.timetorevenue.openapi.repository.main.AccountRepository {
    private final java.lang.String TAG = "AppDebug";
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.api.main.OpenApiMainService openApiMainService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.session.SessionManager sessionManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> getAccountProperties(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> saveAccountProperties(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> updatePassword(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmNewPassword, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.api.main.OpenApiMainService getOpenApiMainService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.persistence.AccountPropertiesDao getAccountPropertiesDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.session.SessionManager getSessionManager() {
        return null;
    }
    
    @javax.inject.Inject()
    public AccountRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.api.main.OpenApiMainService openApiMainService, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.persistence.AccountPropertiesDao accountPropertiesDao, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager) {
        super();
    }
}