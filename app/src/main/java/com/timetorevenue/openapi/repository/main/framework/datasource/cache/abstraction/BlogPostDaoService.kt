package com.timetorevenue.openapi.repository.main.framework.datasource.cache.abstraction

import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.util.Constants.Companion.PAGINATION_PAGE_SIZE


interface BlogPostDaoService {

    suspend fun insertBlogPost(blogPost: BlogPost): Long

    suspend fun insertBlogPosts(blogPosts: List<BlogPost>): LongArray

    suspend fun searchBlogPostById(id: String): BlogPost?

    suspend fun updateBlogPost(
        primaryKey: String,
        title: String,
        image: String?,
        body: String?

    ): Int

    suspend fun deleteBlogPost(pk: String): Int

    suspend fun deleteBlogPosts(notes: List<BlogPost>): Int

    suspend fun searchBlogPosts(): List<BlogPost>

    suspend fun getAllBlogPosts(): List<BlogPost>

    suspend fun searchBlogPostsOrderByDateDESC(
        query: String,
        page: Int,
        pageSize: Int = PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    suspend fun searchBlogPostsOrderByDateASC(
        query: String,
        page: Int,
        pageSize: Int = PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    suspend fun searchBlogPostsOrderByTitleDESC(
        query: String,
        page: Int,
        pageSize: Int = PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    suspend fun searchBlogPostsOrderByTitleASC(
        query: String,
        page: Int,
        pageSize: Int = PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    suspend fun getNumBlogPosts(): Int

    suspend fun returnOrderedQuery(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<BlogPost>
}
