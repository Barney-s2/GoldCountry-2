package com.timetorevenue.openapi.repository.main.framework.datasource.cache.mappers

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil
import com.timetorevenue.openapi.repository.main.business.domain.util.EntityMapper
import javax.inject.Inject

/**
 * originally stated "Maps Note to NoteCacheEntity or NoterCacheEntity to Note
 * changed to "Maps BlogPost to BlogPost or BlogPost to BlogPost".
 */
class CacheMapper
@Inject
constructor(
    private val dateUtil: DateUtil
): EntityMapper<BlogPost, BlogPost>
{

    fun entityListToBlogPostList(entities: List<BlogPost>): List<BlogPost>{
        val list: ArrayList<BlogPost> = ArrayList()
        for(entity in entities){
            list.add(mapFromEntity(entity))
        }
        return list
    }

    fun blogPostListToEntityList(blogPosts: List<BlogPost>): List<BlogPost>{
        val entities: ArrayList<BlogPost> = ArrayList()
        for(blogPost in blogPosts){
            entities.add(mapToEntity(blogPost))
        }
        return entities
    }

    override fun mapFromEntity(entity: BlogPost): BlogPost {
        return BlogPost(
            pk = entity.pk,
            title = entity.title,
            slug = entity.slug,
            body = entity.body,
            image = entity.image,
            username = entity.username,
            updated_at = entity.updated_at,
            created_at = entity.created_at
        )
    }

    override fun mapToEntity(domainModel: BlogPost): BlogPost {
        return BlogPost(
            pk = domainModel.pk,
            title = domainModel.title,
            slug = domainModel.slug,
            body = domainModel.body,
            image = domainModel.image,
            username = domainModel.username,
            updated_at = domainModel.updated_at,
            created_at = domainModel.created_at
        )
    }
}