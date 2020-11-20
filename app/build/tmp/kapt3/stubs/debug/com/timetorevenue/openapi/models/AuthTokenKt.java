package com.timetorevenue.openapi.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"AUTH_TOKEN_BUNDLE_KEY", "", "app_debug"})
public final class AuthTokenKt {
    
    /**
     * Data class for saving authentication token locally for open-api.xyz
     * NOTES:
     * 1) local 'auth_token' table has foreign key relationship to 'account_properties' table through 'account' field (PK)
     *
     * Docs: https://open-api.xyz/api/
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_TOKEN_BUNDLE_KEY = "com.timetorevenue.openapi.models.AuthToken";
}