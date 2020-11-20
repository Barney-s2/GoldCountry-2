package com.timetorevenue.openapi.repository.main.framework.datasource.cache.mappers;

import java.lang.System;

/**
 * originally stated "Maps Note to NoteCacheEntity or NoterCacheEntity to Note
 * changed to "Maps BlogPost to BlogPost or BlogPost to BlogPost".
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/cache/mappers/CacheMapper;", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/EntityMapper;", "Lcom/timetorevenue/openapi/models/BlogPost;", "dateUtil", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;", "(Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;)V", "blogPostListToEntityList", "", "blogPosts", "entityListToBlogPostList", "entities", "mapFromEntity", "entity", "mapToEntity", "domainModel", "app_debug"})
public final class CacheMapper implements com.timetorevenue.openapi.repository.main.business.domain.util.EntityMapper<com.timetorevenue.openapi.models.BlogPost, com.timetorevenue.openapi.models.BlogPost> {
    private final com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.models.BlogPost> entityListToBlogPostList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPostListToEntityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.models.BlogPost mapFromEntity(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.models.BlogPost mapToEntity(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost domainModel) {
        return null;
    }
    
    @javax.inject.Inject()
    public CacheMapper(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil) {
        super();
    }
}