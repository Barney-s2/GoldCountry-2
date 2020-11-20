package com.timetorevenue.openapi.api.auth.network_responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/timetorevenue/openapi/api/auth/network_responses/LoginResponse;", "", "response", "", "errorMessage", "token", "pk", "", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getErrorMessage", "setErrorMessage", "getPk", "()I", "setPk", "(I)V", "getResponse", "setResponse", "getToken", "setToken", "toString", "app_debug"})
public final class LoginResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "response")
    private java.lang.String response;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "error_message")
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "pk")
    private int pk;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPk() {
        return 0;
    }
    
    public final void setPk(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public LoginResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String response, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int pk, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        super();
    }
}