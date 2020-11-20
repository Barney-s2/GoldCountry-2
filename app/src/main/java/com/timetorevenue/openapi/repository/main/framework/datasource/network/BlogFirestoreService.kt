package com.timetorevenue.openapi.repository.main.framework.datasource.network

import com.timetorevenue.openapi.models.BlogPost

interface BlogFirestoreService {

    suspend fun insertOrUpdateBlogPost(blogPost: BlogPost)

    suspend fun insertOrUpdateBlogPosts(blogPosts: List<BlogPost>)

    suspend fun deleteBlogPost(primaryKey: String)

    suspend fun insertDeletedBlogPost(blogPost: BlogPost)

    suspend fun insertDeletedBlogPosts(blogPosts: List<BlogPost>)

    suspend fun deleteDeletedBlogPost(blogPost: BlogPost)

    suspend fun deleteAllBlogPosts()

    suspend fun getDeletedBlogPosts(): List<BlogPost>

    suspend fun searchBlogPost(blogPost: BlogPost): BlogPost?

    suspend fun getAllBlogPosts(): List<BlogPost>


}