package com.timetorevenue.openapi.repository.main.business.domain.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "", "()V", "AreYouSureDialog", "Dialog", "None", "SnackBar", "Toast", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$Toast;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$Dialog;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$AreYouSureDialog;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$SnackBar;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$None;", "app_debug"})
public abstract class UIComponentType {
    
    private UIComponentType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$Toast;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "()V", "app_debug"})
    public static final class Toast extends com.timetorevenue.openapi.repository.main.business.domain.state.UIComponentType {
        
        public Toast() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$Dialog;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "()V", "app_debug"})
    public static final class Dialog extends com.timetorevenue.openapi.repository.main.business.domain.state.UIComponentType {
        
        public Dialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$AreYouSureDialog;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "callback", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/AreYouSureCallback;", "(Lcom/timetorevenue/openapi/repository/main/business/domain/state/AreYouSureCallback;)V", "getCallback", "()Lcom/timetorevenue/openapi/repository/main/business/domain/state/AreYouSureCallback;", "app_debug"})
    public static final class AreYouSureDialog extends com.timetorevenue.openapi.repository.main.business.domain.state.UIComponentType {
        @org.jetbrains.annotations.NotNull()
        private final com.timetorevenue.openapi.repository.main.business.domain.state.AreYouSureCallback callback = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.timetorevenue.openapi.repository.main.business.domain.state.AreYouSureCallback getCallback() {
            return null;
        }
        
        public AreYouSureDialog(@org.jetbrains.annotations.NotNull()
        com.timetorevenue.openapi.repository.main.business.domain.state.AreYouSureCallback callback) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$SnackBar;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "undoCallback", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/SnackbarUndoCallback;", "onDismissCallback", "Lcom/timetorevenue/openapi/util/TodoCallback;", "(Lcom/timetorevenue/openapi/repository/main/business/domain/state/SnackbarUndoCallback;Lcom/timetorevenue/openapi/util/TodoCallback;)V", "getOnDismissCallback", "()Lcom/timetorevenue/openapi/util/TodoCallback;", "getUndoCallback", "()Lcom/timetorevenue/openapi/repository/main/business/domain/state/SnackbarUndoCallback;", "app_debug"})
    public static final class SnackBar extends com.timetorevenue.openapi.repository.main.business.domain.state.UIComponentType {
        @org.jetbrains.annotations.Nullable()
        private final com.timetorevenue.openapi.repository.main.business.domain.state.SnackbarUndoCallback undoCallback = null;
        @org.jetbrains.annotations.Nullable()
        private final com.timetorevenue.openapi.util.TodoCallback onDismissCallback = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.timetorevenue.openapi.repository.main.business.domain.state.SnackbarUndoCallback getUndoCallback() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.timetorevenue.openapi.util.TodoCallback getOnDismissCallback() {
            return null;
        }
        
        public SnackBar(@org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.repository.main.business.domain.state.SnackbarUndoCallback undoCallback, @org.jetbrains.annotations.Nullable()
        com.timetorevenue.openapi.util.TodoCallback onDismissCallback) {
            super();
        }
        
        public SnackBar() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType$None;", "Lcom/timetorevenue/openapi/repository/main/business/domain/state/UIComponentType;", "()V", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.repository.main.business.domain.state.UIComponentType {
        
        public None() {
            super();
        }
    }
}