package com.timetorevenue.openapi.repository.main.framework.datasource.network.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0004H\u00c6\u0003J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0004H\u00c6\u0003J\t\u0010%\u001a\u00020\u0004H\u00c6\u0003J\t\u0010&\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0004H\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u000bH\u00c6\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011\u00a8\u00062"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/model/BlogNetworkEntity;", "", "()V", "pk", "", "title", "slug", "body", "image", "username", "updated_at", "Lcom/google/firebase/Timestamp;", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;Lcom/google/firebase/Timestamp;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getCreated_at", "()Lcom/google/firebase/Timestamp;", "setCreated_at", "(Lcom/google/firebase/Timestamp;)V", "getImage", "setImage", "getPk", "setPk", "getSlug", "setSlug", "getTitle", "setTitle", "getUpdated_at", "setUpdated_at", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class BlogNetworkEntity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pk;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String slug;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String image;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.Timestamp updated_at;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.Timestamp created_at;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATED_AT_FIELD = "updated_at";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE_FIELD = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SLUG_FIELD = "slug";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BODY_FIELD = "body";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_FIELD = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERNAME_FIELD = "username";
    public static final com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity.Companion Companion = null;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPk() {
        return null;
    }
    
    public final void setPk(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.Timestamp getUpdated_at() {
        return null;
    }
    
    public final void setUpdated_at(@org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.Timestamp getCreated_at() {
        return null;
    }
    
    public final void setCreated_at(@org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp p0) {
    }
    
    public BlogNetworkEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String pk, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp updated_at, @org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp created_at) {
        super();
    }
    
    public BlogNetworkEntity() {
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.Timestamp component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.Timestamp component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String pk, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp updated_at, @org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp created_at) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/model/BlogNetworkEntity$Companion;", "", "()V", "BODY_FIELD", "", "IMAGE_FIELD", "SLUG_FIELD", "TITLE_FIELD", "UPDATED_AT_FIELD", "USERNAME_FIELD", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}