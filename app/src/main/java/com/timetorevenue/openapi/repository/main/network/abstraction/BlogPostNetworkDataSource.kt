package com.timetorevenue.openapi.repository.main.network.abstraction
//package com.codingwithmitch.cleannotes.business.data.network.abstraction

import com.timetorevenue.openapi.models.BlogPost

interface BlogPostNetworkDataSource {

    suspend fun insertOrUpdateBlogPost(blogPost: BlogPost)

    suspend fun deleteBlogPost(primaryKey: String)

//    suspend fun insertDeletedBlogPost(blogPost: BlogPost)

//    suspend fun insertDeletedBlogPosts(blogPosts: List<BlogPost>)

//    suspend fun deleteDeletedBlogPost(blogPost: BlogPost)

    suspend fun getDeletedBlogPosts(): List<BlogPost>

    suspend fun deleteAllBlogPosts()

    suspend fun searchBlogPost(blogPost: BlogPost): BlogPost?

    suspend fun getAllBlogPosts(): List<BlogPost>

    suspend fun insertOrUpdateBlogPosts(blogPosts: List<BlogPost>)

}