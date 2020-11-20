package com.timetorevenue.openapi.api.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J9\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJE\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J9\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/timetorevenue/openapi/api/main/OpenApiMainService;", "", "createBlog", "Lcom/timetorevenue/openapi/api/main/responses/BlogCreateUpdateResponse;", "authorization", "", "title", "Lokhttp3/RequestBody;", "body", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogPost", "Lcom/timetorevenue/openapi/api/GenericResponse;", "slug", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountProperties", "Lcom/timetorevenue/openapi/models/AccountProperties;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAuthorOfBlogPost", "saveAccountProperties", "email", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchListBlogPosts", "Lcom/timetorevenue/openapi/api/main/responses/BlogListSearchResponse;", "query", "ordering", "page", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBlog", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePassword", "currentPassword", "newPassword", "confirmNewPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@com.timetorevenue.openapi.di.main.MainScope()
public abstract interface OpenApiMainService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "account/properties")
    public abstract java.lang.Object getAccountProperties(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.models.AccountProperties> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.PUT(value = "account/properties/update")
    public abstract java.lang.Object saveAccountProperties(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.GenericResponse> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.PUT(value = "account/change_password/")
    public abstract java.lang.Object updatePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "old_password")
    java.lang.String currentPassword, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "new_password")
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "confirm_new_password")
    java.lang.String confirmNewPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.GenericResponse> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "blog/list")
    public abstract java.lang.Object searchListBlogPosts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ordering")
    java.lang.String ordering, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.main.responses.BlogListSearchResponse> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "blog/{slug}/is_author")
    public abstract java.lang.Object isAuthorOfBlogPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.GenericResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "blog/{slug}/delete")
    public abstract java.lang.Object deleteBlogPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.GenericResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "blog/{slug}/update")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updateBlog(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "title")
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "body")
    okhttp3.RequestBody body, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.main.responses.BlogCreateUpdateResponse> p5);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "blog/create")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object createBlog(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "title")
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "body")
    okhttp3.RequestBody body, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.timetorevenue.openapi.api.main.responses.BlogCreateUpdateResponse> p4);
}