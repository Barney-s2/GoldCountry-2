package com.timetorevenue.openapi.repository.main.datasource.network.mappers

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.business.util.DateUtil
import com.timetorevenue.openapi.repository.main.business.util.EntityMapper
import com.timetorevenue.openapi.repository.main.datasource.network.model.BlogNetworkEntity

/**
 * Maps (BlogPost to BlogNetworkEntity) or (BlogNetworkEntity to BlogPost).
 */
abstract class NetworkMapper
//@Inject
constructor(
    private val dateUtil: DateUtil
): EntityMapper<BlogNetworkEntity, BlogPost>
{

    fun entityListToBlogPostList(entities: List<BlogNetworkEntity>): List<BlogPost>{
        val list: ArrayList<BlogPost> = ArrayList()
        for(entity in entities){
            list.add(mapFromEntity(entity))
        }
        return list
    }

    fun blogListToEntityList(blogPosts: List<BlogPost>): List<BlogNetworkEntity>{
        val entities: ArrayList<BlogNetworkEntity> = ArrayList()
        for(blogPost in blogPosts){
            entities.add(mapToEntity(blogPost))
        }
        return entities
    }

    override fun mapFromEntity(entity: BlogNetworkEntity): BlogPost {
        return BlogPost(
            pk = entity.pk.toInt(),
            title = entity.title,
            slug = entity.slug,
            body = entity.body,
            image = entity.image,
            username = entity.username,
            updated_at = dateUtil.convertFirebaseTimestampToStringData(entity.updated_at),
            created_at = dateUtil.convertFirebaseTimestampToStringData(entity.created_at)


        )
    }

    override fun mapToEntity(domainModel: BlogPost): BlogNetworkEntity {
        return BlogNetworkEntity(
            pk = domainModel.pk.toString(),
            title = domainModel.title,
            slug = domainModel.slug,
            body = domainModel.body,
            image = domainModel.image,
            username = domainModel.username,
            updated_at = dateUtil.convertStringDateToFirebaseTimestamp(domainModel.updated_at),
            created_at = dateUtil.convertStringDateToFirebaseTimestamp(domainModel.created_at)


        )
    }




}