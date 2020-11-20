package com.timetorevenue.openapi.repository.auth;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J<\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u0012"}, d2 = {"Lcom/timetorevenue/openapi/repository/auth/AuthRepository;", "", "attemptLogin", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/auth/state/AuthViewState;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "email", "", "password", "attemptRegistration", "username", "confirmPassword", "checkPreviousAuthUser", "returnNoTokenFound", "saveAuthenticatedUserToPrefs", "", "app_debug"})
@com.timetorevenue.openapi.di.auth.AuthScope()
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> attemptLogin(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> attemptRegistration(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState>> checkPreviousAuthUser(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    public abstract void saveAuthenticatedUserToPrefs(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.auth.state.AuthViewState> returnNoTokenFound(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
}