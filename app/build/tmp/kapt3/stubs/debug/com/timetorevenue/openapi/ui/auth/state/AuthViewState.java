package com.timetorevenue.openapi.ui.auth.state;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aH\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/timetorevenue/openapi/ui/auth/state/AuthViewState;", "Landroid/os/Parcelable;", "registrationFields", "Lcom/timetorevenue/openapi/ui/auth/state/RegistrationFields;", "loginFields", "Lcom/timetorevenue/openapi/ui/auth/state/LoginFields;", "authToken", "Lcom/timetorevenue/openapi/models/AuthToken;", "(Lcom/timetorevenue/openapi/ui/auth/state/RegistrationFields;Lcom/timetorevenue/openapi/ui/auth/state/LoginFields;Lcom/timetorevenue/openapi/models/AuthToken;)V", "getAuthToken", "()Lcom/timetorevenue/openapi/models/AuthToken;", "setAuthToken", "(Lcom/timetorevenue/openapi/models/AuthToken;)V", "getLoginFields", "()Lcom/timetorevenue/openapi/ui/auth/state/LoginFields;", "setLoginFields", "(Lcom/timetorevenue/openapi/ui/auth/state/LoginFields;)V", "getRegistrationFields", "()Lcom/timetorevenue/openapi/ui/auth/state/RegistrationFields;", "setRegistrationFields", "(Lcom/timetorevenue/openapi/ui/auth/state/RegistrationFields;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class AuthViewState implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.ui.auth.state.RegistrationFields registrationFields;
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.ui.auth.state.LoginFields loginFields;
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.models.AuthToken authToken;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.ui.auth.state.RegistrationFields getRegistrationFields() {
        return null;
    }
    
    public final void setRegistrationFields(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.RegistrationFields p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.ui.auth.state.LoginFields getLoginFields() {
        return null;
    }
    
    public final void setLoginFields(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.LoginFields p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.models.AuthToken getAuthToken() {
        return null;
    }
    
    public final void setAuthToken(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.models.AuthToken p0) {
    }
    
    public AuthViewState(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.RegistrationFields registrationFields, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.LoginFields loginFields, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.models.AuthToken authToken) {
        super();
    }
    
    public AuthViewState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.ui.auth.state.RegistrationFields component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.ui.auth.state.LoginFields component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.models.AuthToken component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.ui.auth.state.AuthViewState copy(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.RegistrationFields registrationFields, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.ui.auth.state.LoginFields loginFields, @org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.models.AuthToken authToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}