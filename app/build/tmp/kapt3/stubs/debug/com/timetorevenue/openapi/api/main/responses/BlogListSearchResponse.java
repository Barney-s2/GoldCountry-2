package com.timetorevenue.openapi.api.main.responses;

import java.lang.System;

/**
 * Class for modeling the response when querying https://open-api.xyz/
 * See example response here: https://gist.github.com/mitchtabian/ae03573737067c9269701ea662460205
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/timetorevenue/openapi/api/main/responses/BlogListSearchResponse;", "", "results", "", "Lcom/timetorevenue/openapi/api/main/responses/BlogSearchResponse;", "detail", "", "(Ljava/util/List;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "toList", "Lcom/timetorevenue/openapi/models/BlogPost;", "toString", "app_debug"})
public final class BlogListSearchResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.timetorevenue.openapi.api.main.responses.BlogSearchResponse> results;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "detail")
    private java.lang.String detail;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.models.BlogPost> toList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.api.main.responses.BlogSearchResponse> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.api.main.responses.BlogSearchResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetail() {
        return null;
    }
    
    public final void setDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public BlogListSearchResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.api.main.responses.BlogSearchResponse> results, @org.jetbrains.annotations.NotNull()
    java.lang.String detail) {
        super();
    }
}