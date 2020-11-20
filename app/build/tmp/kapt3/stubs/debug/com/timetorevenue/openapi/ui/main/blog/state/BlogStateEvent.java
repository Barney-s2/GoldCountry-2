package com.timetorevenue.openapi.ui.main.blog.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "Lcom/timetorevenue/openapi/util/StateEvent;", "()V", "BlogSearchEvent", "CheckAuthorOfBlogPost", "DeleteBlogPostEvent", "None", "UpdateBlogPostEvent", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$BlogSearchEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$CheckAuthorOfBlogPost;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$DeleteBlogPostEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$UpdateBlogPostEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$None;", "app_debug"})
public abstract class BlogStateEvent implements com.timetorevenue.openapi.util.StateEvent {
    
    private BlogStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$BlogSearchEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "clearLayoutManagerState", "", "(Z)V", "getClearLayoutManagerState", "()Z", "errorInfo", "", "toString", "app_debug"})
    public static final class BlogSearchEvent extends com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent {
        private final boolean clearLayoutManagerState = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public final boolean getClearLayoutManagerState() {
            return false;
        }
        
        public BlogSearchEvent(boolean clearLayoutManagerState) {
            super();
        }
        
        public BlogSearchEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$CheckAuthorOfBlogPost;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "()V", "errorInfo", "", "toString", "app_debug"})
    public static final class CheckAuthorOfBlogPost extends com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CheckAuthorOfBlogPost() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$DeleteBlogPostEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "()V", "errorInfo", "", "toString", "app_debug"})
    public static final class DeleteBlogPostEvent extends com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteBlogPostEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$UpdateBlogPostEvent;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "title", "", "body", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;)V", "getBody", "()Ljava/lang/String;", "getImage", "()Lokhttp3/MultipartBody$Part;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "errorInfo", "hashCode", "", "toString", "app_debug"})
    public static final class UpdateBlogPostEvent extends com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String body = null;
        @org.jetbrains.annotations.Nullable()
        private final okhttp3.MultipartBody.Part image = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.MultipartBody.Part getImage() {
            return null;
        }
        
        public UpdateBlogPostEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.Nullable()
        okhttp3.MultipartBody.Part image) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.MultipartBody.Part component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent.UpdateBlogPostEvent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.Nullable()
        okhttp3.MultipartBody.Part image) {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent$None;", "Lcom/timetorevenue/openapi/ui/main/blog/state/BlogStateEvent;", "()V", "errorInfo", "", "app_debug"})
    public static final class None extends com.timetorevenue.openapi.ui.main.blog.state.BlogStateEvent {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String errorInfo() {
            return null;
        }
        
        public None() {
            super();
        }
    }
}