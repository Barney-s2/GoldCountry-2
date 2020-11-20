package com.timetorevenue.openapi.ui.main.account.state;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/account/state/AccountViewState;", "Landroid/os/Parcelable;", "accountProperties", "Lcom/timetorevenue/openapi/models/AccountProperties;", "(Lcom/timetorevenue/openapi/models/AccountProperties;)V", "getAccountProperties", "()Lcom/timetorevenue/openapi/models/AccountProperties;", "setAccountProperties", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class AccountViewState implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private com.timetorevenue.openapi.models.AccountProperties accountProperties;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.timetorevenue.openapi.models.AccountProperties getAccountProperties() {
        return null;
    }
    
    public final void setAccountProperties(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.models.AccountProperties p0) {
    }
    
    public AccountViewState(@org.jetbrains.annotations.Nullable()
    com.timetorevenue.openapi.models.AccountProperties accountProperties) {
        super();
    }
    
    public AccountViewState() {
        super();
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