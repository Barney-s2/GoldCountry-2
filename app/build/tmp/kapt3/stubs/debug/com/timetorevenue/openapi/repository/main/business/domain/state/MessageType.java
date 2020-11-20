package com.timetorevenue.openapi.repository.main.business.domain.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType;", "", "()V", "Error", "Info", "None", "Success", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Success;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Error;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Info;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$None;", "app_debug"})
public abstract class MessageType {
    
    private MessageType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Success;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType;", "()V", "app_debug"})
    public static final class Success extends com.timetorevenue.openapi.repository.main.business.domain.state.MessageType {
        
        public Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Error;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType;", "()V", "app_debug"})
    public static final class Error extends com.timetorevenue.openapi.repository.main.business.domain.state.MessageType {
        
        public Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$Info;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType;", "()V", "app_debug"})
    public static final class Info extends com.timetorevenue.openapi.repository.main.business.domain.state.MessageType {
        
        public Info() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType$None;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/MessageType;", "()V", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.repository.main.business.domain.state.MessageType {
        
        public None() {
            super();
        }
    }
}