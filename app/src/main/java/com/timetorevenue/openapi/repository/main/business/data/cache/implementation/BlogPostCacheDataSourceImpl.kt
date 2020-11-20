package com.timetorevenue.openapi.repository.main.business.data.cache.implementation

import com.timetorevenue.openapi.repository.main.business.data.cache.abstraction.BlogPostCacheDataSource
import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.repository.main.framework.datasource.cache.abstraction.BlogPostDaoService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BlogPostCacheDataSourceImpl
@Inject
constructor(
    private val blogDaoService: BlogPostDaoService
): BlogPostCacheDataSource {

    override suspend fun insertBlogPost(blogPost: BlogPost): Long {
        return BlogPostDaoService.insertBlogPost(blogPost)
    }
// TODO: 11/19/2020 ( revisit & compaire why 2 versions of insertBlogPost exist) persistance and BlogPostCacheDataSourceImpl

    override suspend fun deleteBlogPost(primaryKey: String): Int {
        return blogDaoService.deleteBlogPost(primaryKey)
    }

    override suspend fun deleteBlogPosts(blogPosts: List<BlogPost>): Int {
        return blogDaoService.deleteBlogPosts(blogPosts)
    }

    override suspend fun updateBlogPost(
        primaryKey: String,
        newTitle: String,
        newBody: String?,
        newImage: String
    ): Int {
        return blogDaoService.updateBlogPost(primaryKey, newTitle, newBody, newImage)
    }

    override suspend fun searchBlogPosts(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<BlogPost> {
        TODO("Check filterAndOrder and make query")
    }

    override suspend fun getAllBlogPosts(): List<BlogPost> {
        return blogDaoService.getAllBlogPosts()
    }

    override suspend fun searchBlogPostById(id: String): BlogPost? {
        return blogDaoService.searchBlogPostById(id)
    }

    override suspend fun getNumBlogPosts(): Int {
        return blogDaoService.getNumBlogPosts()
    }

    override suspend fun insertBlogPosts(blogPosts: List<BlogPost>): LongArray{
        return blogDaoService.insertBlogPosts(blogPosts)
    }
}