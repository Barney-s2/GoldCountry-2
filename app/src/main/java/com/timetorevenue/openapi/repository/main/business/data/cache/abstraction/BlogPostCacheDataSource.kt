package com.timetorevenue.openapi.repository.main.business.data.cache.abstraction

import com.timetorevenue.openapi.models.BlogPost

interface BlogPostCacheDataSource {

    suspend fun insertBlogPost(blogPost: BlogPost): Long

    suspend fun deleteBlogPost(primaryKey: String): Int

    suspend fun deleteBlogPosts(blogPosts: List<BlogPost>): Int

    suspend fun updateBlogPost(primaryKey: String, newTitle: String, newBody: String?, newImage: String): Int

    suspend fun searchBlogPosts(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<BlogPost>

    suspend fun getAllBlogPosts(): List<BlogPost>

    suspend fun searchBlogPostById(id: String): BlogPost?

    suspend fun getNumBlogPosts(): Int

    suspend fun insertBlogPosts(blogPosts: List<BlogPost>): LongArray
}

