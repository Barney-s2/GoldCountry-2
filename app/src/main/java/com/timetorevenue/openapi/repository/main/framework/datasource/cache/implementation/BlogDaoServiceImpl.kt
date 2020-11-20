package com.timetorevenue.openapi.repository.main.framework.datasource.cache.implementation


import com.timetorevenue.openapi.models.BlogPost
import com.timetorevenue.openapi.persistence.BlogPostDao
import com.timetorevenue.openapi.persistence.returnOrderedQuery
import com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil
import com.timetorevenue.openapi.repository.main.framework.datasource.cache.abstraction.BlogPostDaoService
import com.timetorevenue.openapi.repository.main.business.util.mappers.CacheMapper//tbd
import com.timetorevenue.openapi.repository.main.framework.datasource.cache.mappers.CacheMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BlogDaoServiceImpl
@Inject
constructor(
    private val blogPostDao: BlogPostDao,
    private val noteMapper: CacheMapper,
    private val dateUtil: DateUtil
): BlogPostDaoService {

    override suspend fun insertBlogPost(blogPost: BlogPost): Long {
        return blogPostDao.insertBlogPost(noteMapper.mapToEntity(blogPost))
    }

    override suspend fun insertBlogPosts(blogPosts: List<BlogPost>): LongArray {
        return blogPostDao.insertBlogPosts(
            noteMapper.blogPostListToEntityList(blogPosts)
        )
    }

    override suspend fun searchBlogPostById(id: String): BlogPost? {
        return blogPostDao.searchBlogPostById(id)?.let { blogPost ->
            blogPostMapper.mapFromEntity(blogPost)
        }
    }

    override suspend fun updateNote(
        primaryKey: String,
        title: String,
        body: String?,
        timestamp: String?
    ): Int {
        return if(timestamp != null){
            blogPostDao.updateBlogPost(
                primaryKey = primaryKey,
                title = title,
                body = body,
                updated_at = timestamp
            )
        }
        else{
            blogPostDao.updateBlogPost(
                primaryKey = primaryKey,
                title = title,
                body = body,
                updated_at = dateUtil.getCurrentTimestamp()
            )
        }
    }

    override suspend fun deleteBlogPost(primaryKey: String): Int {
        return blogPostDao.deleteBlogPost(primaryKey)
    }

    override suspend fun deleteBlogPosts(blogPosts: List<BlogPost>): Int {
        val ids = blogPosts.mapIndexed {index, value -> value.id}
        return blogPostDao.deleteBlogPosts(ids)
    }

    override suspend fun searchBlogPosts(): List<BlogPost> {
        return BlogMapper.entityListToBlogPostList(
            blogPostDao.searchBlogPosts()
        )
    }

    override suspend fun getAllBlogPosts(): List<BlogPost> {
        return noteMapper.entityListToNoteList(blogPostDao.getAllBlogPosts())
    }

    override suspend fun searchBlogPostsOrderByDateDESC(
        query: String,
        page: Int,
        pageSize: Int
    ): List<BlogPost> {
        return noteMapper.entityListToBlogPostList(
            blogPostDao.searchBlogPostsOrderByDateDESC(
                query = query,
                page = page,
                pageSize = pageSize
            )
        )
    }

    override suspend fun searchBlogPostsOrderByDateASC(
        query: String,
        page: Int,
        pageSize: Int
    ): List<BlogPost> {
        return noteMapper.entityListToNoteList(
            blogPostDao.searchBlogPostsOrderByDateASC(
                query = query,
                page = page,
                pageSize = pageSize
            )
        )
    }

    override suspend fun searchBlogPostsOrderByTitleDESC(
        query: String,
        page: Int,
        pageSize: Int
    ): List<BlogPost> {
        return noteMapper.entityListToNoteList(
            blogPostDao.searchBlogPostsOrderByTitleDESC(
                query = query,
                page = page,
                pageSize = pageSize
            )
        )
    }

    override suspend fun searchNotesOrderByTitleASC(
        query: String,
        page: Int,
        pageSize: Int
    ): List<BlogPost> {
        return noteMapper.entityListToNoteList(
            blogPostDao.searchBlogPostsOrderByTitleASC(
                query = query,
                page = page,
                pageSize = pageSize
            )
        )
    }

    override suspend fun getNumBlogPosts(): Int {
        return blogPostDao.getNumBlogPosts()
    }

    override suspend fun returnOrderedQuery(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<BlogPost> {
        return noteMapper.entityListToNoteList(
            blogPostDao.returnOrderedQuery(
                query = query,
                page = page,
                filterAndOrder = filterAndOrder
            )
        )
    }
}