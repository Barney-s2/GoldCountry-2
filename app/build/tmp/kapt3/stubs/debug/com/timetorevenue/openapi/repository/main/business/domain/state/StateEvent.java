package com.timetorevenue.openapi.repository.main.business.domain.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/StateEvent;", "", "errorInfo", "", "eventName", "shouldDisplayProgressBar", "", "app_debug"})
public abstract interface StateEvent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String errorInfo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String eventName();
    
    public abstract boolean shouldDisplayProgressBar();
}