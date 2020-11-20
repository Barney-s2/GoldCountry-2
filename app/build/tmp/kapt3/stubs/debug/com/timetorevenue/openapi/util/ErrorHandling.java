package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/timetorevenue/openapi/util/ErrorHandling;", "", "()V", "Companion", "app_debug"})
public final class ErrorHandling {
    private static final java.lang.String TAG = "AppDebug";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TO_RESOLVE_HOST = "Unable to resolve host";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TODO_OPERATION_WO_INTERNET = "Can\'t do that operation without an internet connection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_SAVE_ACCOUNT_PROPERTIES = "Error saving account properties.\nTry restarting the app.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_SAVE_AUTH_TOKEN = "Error saving authentication token.\nTry restarting the app.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_SOMETHING_WRONG_WITH_IMAGE = "Something went wrong with the image.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_MUST_SELECT_IMAGE = "You must select an image.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENERIC_AUTH_ERROR = "Error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_PAGE = "Invalid page.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_CHECK_NETWORK_CONNECTION = "Check network connection.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_UNKNOWN = "Unknown error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_CREDENTIALS = "Invalid credentials";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOMETHING_WRONG_WITH_IMAGE = "Something went wrong with the image.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_STATE_EVENT = "Invalid state event";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CANNOT_BE_UNDONE = "This can\'t be undone.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR = "Network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR_TIMEOUT = "Network timeout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CACHE_ERROR_TIMEOUT = "Cache timeout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_ERROR = "Unknown error";
    public static final com.timetorevenue.openapi.util.ErrorHandling.Companion Companion = null;
    
    public ErrorHandling() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/timetorevenue/openapi/util/ErrorHandling$Companion;", "", "()V", "CACHE_ERROR_TIMEOUT", "", "CANNOT_BE_UNDONE", "ERROR_CHECK_NETWORK_CONNECTION", "ERROR_MUST_SELECT_IMAGE", "ERROR_SAVE_ACCOUNT_PROPERTIES", "ERROR_SAVE_AUTH_TOKEN", "ERROR_SOMETHING_WRONG_WITH_IMAGE", "ERROR_UNKNOWN", "GENERIC_AUTH_ERROR", "INVALID_CREDENTIALS", "INVALID_PAGE", "INVALID_STATE_EVENT", "NETWORK_ERROR", "NETWORK_ERROR_TIMEOUT", "SOMETHING_WRONG_WITH_IMAGE", "TAG", "UNABLE_TODO_OPERATION_WO_INTERNET", "UNABLE_TO_RESOLVE_HOST", "UNKNOWN_ERROR", "isNetworkError", "", "msg", "isPaginationDone", "errorResponse", "app_debug"})
    public static final class Companion {
        
        public final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return false;
        }
        
        public final boolean isPaginationDone(@org.jetbrains.annotations.Nullable()
        java.lang.String errorResponse) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}