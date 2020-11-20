package com.timetorevenue.openapi.models

import com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class BlogPostFactory
@Inject
constructor(
    private val dateUtil: DateUtil
) {

    fun createSingleBlogPost(
        id: String? = null,
        title: String,
        slug: String? = null,
        body: String? = null,
        image: String? = null,
        username: String? = null


    ): BlogPost {
        return BlogPost(
            id = id ?: UUID.randomUUID().toString(),
            title = title,
            slug = slug ?: "",
            body = body ?: "",
            image = image ?: "",
            username = username ?: "",
            created_at = dateUtil.getCurrentTimestamp(),
            updated_at = dateUtil.getCurrentTimestamp()
        )
    }

    fun createBlogPostList(numBlogPosts: Int): List<BlogPost> {
        val list: ArrayList<BlogPost> = ArrayList()
        for(i in 0 until numBlogPosts){ // exclusive on upper bound
            list.add(
                createSingleBlogPost(
                    id = UUID.randomUUID().toString(),
                    title = UUID.randomUUID().toString(),
                    body = UUID.randomUUID().toString(),
                    image = UUID.randomUUID().toString()
                )
            )
        }
        return list
    }


}