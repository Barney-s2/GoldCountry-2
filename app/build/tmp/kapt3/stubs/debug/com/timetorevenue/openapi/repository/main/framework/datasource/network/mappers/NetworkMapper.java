package com.timetorevenue.openapi.repository.main.framework.datasource.network.mappers;

import java.lang.System;

/**
 * Maps (BlogPost to BlogNetworkEntity) or (BlogNetworkEntity to BlogPost).
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/mappers/NetworkMapper;", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/EntityMapper;", "Lcom/timetorevenue/openapi/repository/main/framework/datasource/network/model/BlogNetworkEntity;", "Lcom/timetorevenue/openapi/models/BlogPost;", "dateUtil", "Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;", "(Lcom/timetorevenue/openapi/repository/main/business/domain/util/DateUtil;)V", "blogListToEntityList", "", "blogPosts", "entityListToBlogPostList", "entities", "mapFromEntity", "entity", "mapToEntity", "domainModel", "app_debug"})
public abstract class NetworkMapper implements com.timetorevenue.openapi.repository.main.business.domain.util.EntityMapper<com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity, com.timetorevenue.openapi.models.BlogPost> {
    private final com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.models.BlogPost> entityListToBlogPostList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity> blogListToEntityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.timetorevenue.openapi.models.BlogPost> blogPosts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.models.BlogPost mapFromEntity(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.timetorevenue.openapi.repository.main.framework.datasource.network.model.BlogNetworkEntity mapToEntity(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.models.BlogPost domainModel) {
        return null;
    }
    
    public NetworkMapper(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil dateUtil) {
        super();
    }
}