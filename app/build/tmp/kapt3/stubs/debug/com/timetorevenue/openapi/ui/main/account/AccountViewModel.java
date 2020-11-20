package com.timetorevenue.openapi.ui.main.account;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\rH\u0014J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/AccountViewModel;", "Lcom/timetorevenue/openapi/ui/BaseViewModel;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountViewState;", "sessionManager", "Lcom/timetorevenue/openapi/session/SessionManager;", "accountRepository", "Lcom/timetorevenue/openapi/repository/main/AccountRepositoryImpl;", "(Lcom/timetorevenue/openapi/session/SessionManager;Lcom/timetorevenue/openapi/repository/main/AccountRepositoryImpl;)V", "getAccountRepository", "()Lcom/timetorevenue/openapi/repository/main/AccountRepositoryImpl;", "getSessionManager", "()Lcom/timetorevenue/openapi/session/SessionManager;", "handleNewData", "", "data", "initNewViewState", "logout", "onCleared", "setAccountPropertiesData", "accountProperties", "Lcom/timetorevenue/openapi/models/AccountProperties;", "setStateEvent", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public final class AccountViewModel extends com.timetorevenue.openapi.ui.BaseViewModel<com.timetorevenue.openapi.ui.main.account.state.AccountViewState> {
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.repository.main.AccountRepositoryImpl accountRepository = null;
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.main.account.state.AccountViewState data) {
    }
    
    @java.lang.Override()
    public void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    public final void setAccountPropertiesData(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AccountProperties accountProperties) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.ui.main.account.state.AccountViewState initNewViewState() {
        return null;
    }
    
    public final void logout() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.session.SessionManager getSessionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.main.AccountRepositoryImpl getAccountRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public AccountViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.AccountRepositoryImpl accountRepository) {
        super();
    }
}