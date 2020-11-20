package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/util/UIComponentType;", "", "()V", "AreYouSureDialog", "Dialog", "None", "Toast", "Lcom/timetorevenue/openapi/util/UIComponentType$Toast;", "Lcom/timetorevenue/openapi/util/UIComponentType$Dialog;", "Lcom/timetorevenue/openapi/util/UIComponentType$AreYouSureDialog;", "Lcom/timetorevenue/openapi/util/UIComponentType$None;", "app_debug"})
public abstract class UIComponentType {
    
    private UIComponentType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/UIComponentType$Toast;", "Lcom/timetorevenue/openapi/util/UIComponentType;", "()V", "app_debug"})
    public static final class Toast extends com.timetorevenue.openapi.util.UIComponentType {
        
        public Toast() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/UIComponentType$Dialog;", "Lcom/timetorevenue/openapi/util/UIComponentType;", "()V", "app_debug"})
    public static final class Dialog extends com.timetorevenue.openapi.util.UIComponentType {
        
        public Dialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/util/UIComponentType$AreYouSureDialog;", "Lcom/timetorevenue/openapi/util/UIComponentType;", "callback", "Lcom/timetorevenue/openapi/ui/AreYouSureCallback;", "(Lcom/timetorevenue/openapi/ui/AreYouSureCallback;)V", "getCallback", "()Lcom/timetorevenue/openapi/ui/AreYouSureCallback;", "app_debug"})
    public static final class AreYouSureDialog extends com.timetorevenue.openapi.util.UIComponentType {
        @org.jetbrains.annotations.NotNull()
        private final com.timetorevenue.openapi.ui.AreYouSureCallback callback = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.timetorevenue.openapi.ui.AreYouSureCallback getCallback() {
            return null;
        }
        
        public AreYouSureDialog(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.ui.AreYouSureCallback callback) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/util/UIComponentType$None;", "Lcom/timetorevenue/openapi/util/UIComponentType;", "()V", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.util.UIComponentType {
        
        public None() {
            super();
        }
    }
}