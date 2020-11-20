package com.timetorevenue.openapi.repository.main.business.domain.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "(Ljava/text/SimpleDateFormat;)V", "convertFirebaseTimestampToStringData", "", "timestamp", "Lcom/google/firebase/Timestamp;", "convertStringDateToFirebaseTimestamp", "date", "getCurrentTimestamp", "removeTimeFromDateString", "sd", "app_debug"})
@javax.inject.Singleton()
public final class DateUtil {
    private final java.text.SimpleDateFormat dateFormat = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeTimeFromDateString(@org.jetbrains.annotations.NotNull()
    java.lang.String sd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertFirebaseTimestampToStringData(@org.jetbrains.annotations.NotNull()
    com.google.firebase.Timestamp timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.Timestamp convertStringDateToFirebaseTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentTimestamp() {
        return null;
    }
    
    @javax.inject.Inject()
    public DateUtil(@org.jetbrains.annotations.NotNull()
    java.text.SimpleDateFormat dateFormat) {
        super();
    }
}