package com.timetorevenue.openapi.network.abstraction
//package com.codingwithmitch.cleannotes.framework.datasource.network.abstraction

import com.timetorevenue.openapi.models.BlogPost

interface BlogPostFirestoreService {


    suspend fun insertOrUpdateBlogPost(blogPost: BlogPost)

    suspend fun insertOrUpdateBlogPosts(notes: List<BlogPost>)

    suspend fun deleteBlogPost(primaryKey: String)

    suspend fun insertDeletedBlogPost(blogPost: BlogPost)

    suspend fun insertDeletedBlogPosts(notes: List<BlogPost>)

    suspend fun deleteDeletedBlogPost(blogPost: BlogPost)

    suspend fun deleteAllBlogPosts()

    suspend fun getDeletedBlogPosts(): List<BlogPost>

    suspend fun searchBlogPost(blogPost: BlogPost): BlogPost?

    suspend fun getAllBlogPosts(): List<BlogPost>


}
