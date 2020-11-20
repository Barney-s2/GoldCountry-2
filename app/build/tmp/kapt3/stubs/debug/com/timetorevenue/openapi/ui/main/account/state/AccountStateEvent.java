package com.timetorevenue.openapi.ui.main.account.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent;", "Lcom/timetorevenue/openapi/util/StateEvent;", "()V", "ChangePasswordEvent", "GetAccountPropertiesEvent", "None", "UpdateAccountPropertiesEvent", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$GetAccountPropertiesEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$UpdateAccountPropertiesEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$ChangePasswordEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$None;", "app_debug"})
public abstract class AccountStateEvent implements com.timetorevenue.openapi.util.StateEvent {
    
    private AccountStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$GetAccountPropertiesEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent;", "()V", "errorInfo", "", "toString", "app_debug"})
    public static final class GetAccountPropertiesEvent extends com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GetAccountPropertiesEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$UpdateAccountPropertiesEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent;", "email", "", "username", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getUsername", "component1", "component2", "copy", "equals", "", "other", "", "errorInfo", "hashCode", "", "toString", "app_debug"})
    public static final class UpdateAccountPropertiesEvent extends com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String email = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String username = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUsername() {
            return null;
        }
        
        public UpdateAccountPropertiesEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String username) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent.UpdateAccountPropertiesEvent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String username) {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$ChangePasswordEvent;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent;", "currentPassword", "", "newPassword", "confirmNewPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmNewPassword", "()Ljava/lang/String;", "getCurrentPassword", "getNewPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "", "errorInfo", "hashCode", "", "toString", "app_debug"})
    public static final class ChangePasswordEvent extends com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currentPassword = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String newPassword = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String confirmNewPassword = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNewPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getConfirmNewPassword() {
            return null;
        }
        
        public ChangePasswordEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String currentPassword, @org.jetbrains.annotations.NotNull()
        java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
        java.lang.String confirmNewPassword) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent.ChangePasswordEvent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currentPassword, @org.jetbrains.annotations.NotNull()
        java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
        java.lang.String confirmNewPassword) {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent$None;", "Lcom/timetorevenue/openapi/ui/main/account/state/AccountStateEvent;", "()V", "errorInfo", "", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.ui.main.account.state.AccountStateEvent {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        public None() {
            super();
        }
    }
}