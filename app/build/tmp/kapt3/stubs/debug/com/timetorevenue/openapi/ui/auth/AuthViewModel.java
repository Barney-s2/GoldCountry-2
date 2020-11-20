package com.timetorevenue.openapi.ui.auth;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\tH\u0014J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/timetorevenue/openapi/ui/auth/AuthViewModel;", "Lcom/timetorevenue/openapi/ui/BaseViewModel;", "Lcom/timetorevenue/openapi/ui/auth/state/AuthViewState;", "authRepository", "Lcom/timetorevenue/openapi/repository/auth/AuthRepository;", "(Lcom/timetorevenue/openapi/repository/auth/AuthRepository;)V", "getAuthRepository", "()Lcom/timetorevenue/openapi/repository/auth/AuthRepository;", "handleNewData", "", "data", "initNewViewState", "onCleared", "setAuthToken", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "setLoginFields", "loginFields", "Lcom/timetorevenue/openapi/ui/auth/state/LoginFields;", "setRegistrationFields", "registrationFields", "Lcom/timetorevenue/openapi/ui/auth/state/RegistrationFields;", "setStateEvent", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "app_debug"})
@com.timetorevenue.openapi.di.auth.AuthScope()
public final class AuthViewModel extends com.timetorevenue.openapi.ui.BaseViewModel<com.timetorevenue.openapi.ui.auth.state.AuthViewState> {
    @org.jetbrains.annotations.NotNull()
    private final com.timetorevenue.openapi.repository.auth.AuthRepository authRepository = null;
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.auth.state.AuthViewState data) {
    }
    
    @java.lang.Override()
    public void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.ui.auth.state.AuthViewState initNewViewState() {
        return null;
    }
    
    public final void setRegistrationFields(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.auth.state.RegistrationFields registrationFields) {
    }
    
    public final void setLoginFields(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.auth.state.LoginFields loginFields) {
    }
    
    public final void setAuthToken(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.auth.AuthRepository getAuthRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.auth.AuthRepository authRepository) {
        super();
    }
}