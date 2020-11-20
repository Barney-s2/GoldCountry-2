package com.timetorevenue.openapi.repository.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J4\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&J<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u0012"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/AccountRepository;", "", "getAccountProperties", "Lkotlinx/coroutines/flow/Flow;", "Lcom/timetorevenue/openapi/util/DataState;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountViewState;", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "stateEvent", "Lcom/timetorevenue/openapi/util/StateEvent;", "saveAccountProperties", "email", "", "username", "updatePassword", "currentPassword", "newPassword", "confirmNewPassword", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public abstract interface AccountRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> getAccountProperties(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> saveAccountProperties(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.timetorevenue.openapi.util.DataState<com.timetorevenue.openapi.ui.main.account.state.AccountViewState>> updatePassword(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.AuthToken authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmNewPassword, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.StateEvent stateEvent);
}