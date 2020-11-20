package com.timetorevenue.openapi.persistence;

import java.lang.System;

@androidx.room.Database(entities = {com.timetorevenue.openapi.models.AuthToken.class, com.timetorevenue.openapi.models.AccountProperties.class, com.timetorevenue.openapi.models.BlogPost.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/timetorevenue/openapi/persistence/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getAccountPropertiesDao", "Lcom/timetorevenue/openapi/persistence/AccountPropertiesDao;", "getAuthTokenDao", "Lcom/timetorevenue/openapi/persistence/AuthTokenDao;", "getBlogPostDao", "Lcom/timetorevenue/openapi/persistence/BlogPostDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "app_db";
    public static final com.timetorevenue.openapi.persistence.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.persistence.AuthTokenDao getAuthTokenDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.persistence.AccountPropertiesDao getAccountPropertiesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.timetorevenue.openapi.persistence.BlogPostDao getBlogPostDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/persistence/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}