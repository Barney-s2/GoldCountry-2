package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/util/MessageType;", "", "()V", "Error", "Info", "None", "Success", "Lcom/timetorevenue/openapi/util/MessageType$Success;", "Lcom/timetorevenue/openapi/util/MessageType$Error;", "Lcom/timetorevenue/openapi/util/MessageType$Info;", "Lcom/timetorevenue/openapi/util/MessageType$None;", "app_debug"})
public abstract class MessageType {
    
    private MessageType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/MessageType$Success;", "Lcom/timetorevenue/openapi/util/MessageType;", "()V", "app_debug"})
    public static final class Success extends com.timetorevenue.openapi.util.MessageType {
        
        public Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/MessageType$Error;", "Lcom/timetorevenue/openapi/util/MessageType;", "()V", "app_debug"})
    public static final class Error extends com.timetorevenue.openapi.util.MessageType {
        
        public Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/MessageType$Info;", "Lcom/timetorevenue/openapi/util/MessageType;", "()V", "app_debug"})
    public static final class Info extends com.timetorevenue.openapi.util.MessageType {
        
        public Info() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/MessageType$None;", "Lcom/timetorevenue/openapi/util/MessageType;", "()V", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.util.MessageType {
        
        public None() {
            super();
        }
    }
}