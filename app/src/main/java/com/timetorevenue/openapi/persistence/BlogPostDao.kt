package com.timetorevenue.openapi.persistence

import androidx.room.*
import com.timetorevenue.openapi.models.BlogPost
//import com.timetorevenue.openapi.repository.main.datasource.network.model.BlogCacheEntity
//import com.timetorevenue.openapi.util.Constants.Companion.PAGINATION_PAGE_SIZE

const val BLOG_ORDER_ASC: String = ""
const val BLOG_ORDER_DESC: String = "-"
const val BLOG_FILTER_TITLE = "title"
const val BLOG_FILTER_DATE_CREATED = "created_at"

const val ORDER_BY_ASC_DATE_UPDATED = BLOG_ORDER_ASC + BLOG_FILTER_DATE_CREATED
const val ORDER_BY_DESC_DATE_UPDATED = BLOG_ORDER_DESC + BLOG_FILTER_DATE_CREATED
const val ORDER_BY_ASC_TITLE = BLOG_ORDER_ASC + BLOG_FILTER_TITLE
const val ORDER_BY_DESC_TITLE = BLOG_ORDER_DESC + BLOG_FILTER_TITLE

const val BLOG_PAGINATION_PAGE_SIZE = 30

@Dao
interface BlogPostDao {

    @Insert
    suspend fun insertBlogPost(blogPost: BlogPost): Long

    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    //suspend fun insert(blogPost: BlogPost): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBlogPosts(blogPosts: List<BlogPost>): LongArray

    @Query("SELECT * FROM blog_post Where pk = :pk")
    suspend fun searchBlogPostById(pk: String): BlogPost?

    @Query("DELETE FROM blog_post WHERE pk IN (:pks)")
    suspend fun deleteBlogPosts(pks: List<String>): Int

    @Query("DELETE FROM blog_post")
    suspend fun deleteAllBlogPosts()

    @Query("SELECT * FROM blog_post")
    suspend fun getAllBlogPosts(): List<BlogPost>


    @Query("""
        UPDATE blog_post 
        SET 
        title = :title,
        body = :body,
        image = :image,
        updated_at = :updated_at
        WHERE pk = :pk
        """)

    suspend fun updateBlogPost(
        pk: String,
        title: String,
        body: String,
        image: String,
        updated_at: String
    ): Int

    @Query("DELETE FROM blog_post WHERE pk = :primaryKey")
    suspend fun deleteBlogPost(primaryKey: BlogPost): Int

    @Query("SELECT * FROM blog_post")
    suspend fun searchBlogPosts(): List<BlogPost>

    @Query("""
        SELECT * FROM blog_post 
        WHERE title LIKE '%' || :query || '%' 
        OR body LIKE '%' || :query || '%' 
        ORDER BY updated_at DESC LIMIT (:page * :pageSize)
        """)
    suspend fun searchBlogPostsOrderByDateDESC(
        query: String,
        page: Int,
        pageSize: Int = BLOG_PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    @Query("""
        SELECT * FROM blog_post 
        WHERE title LIKE '%' || :query || '%' 
        OR body LIKE '%' || :query || '%' 
        ORDER BY updated_at ASC LIMIT (:page * :pageSize)
        """)
    suspend fun searchBlogPostsOrderByDateASC(
        query: String,
        page: Int,
        pageSize: Int = BLOG_PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    @Query("""
        SELECT * FROM blog_post 
        WHERE title LIKE '%' || :query || '%' 
        OR body LIKE '%' || :query || '%' 
        ORDER BY title DESC LIMIT (:page * :pageSize)
        """)
    suspend fun searchBlogPostsOrderByTitleDESC(
        query: String,
        page: Int,
        pageSize: Int = BLOG_PAGINATION_PAGE_SIZE
    ): List<BlogPost>

    @Query("""
        SELECT * FROM blog_post 
        WHERE title LIKE '%' || :query || '%' 
        OR body LIKE '%' || :query || '%' 
        ORDER BY title ASC LIMIT (:page * :pageSize)
        """)
    suspend fun searchBlogPostsOrderByTitleASC(
        query: String,
        page: Int,
        pageSize: Int = BLOG_PAGINATION_PAGE_SIZE
    ): List<BlogPost>


    @Query("SELECT COUNT(*) FROM blog_post")
    suspend fun getNumBlogPost(): Int

    fun insert(blogPost: BlogPost)


}


suspend fun BlogPostDao.returnOrderedQuery(
    query: String,
    filterAndOrder: String,
    page: Int
): List<BlogPost> {

    when{

        filterAndOrder.contains(ORDER_BY_DESC_DATE_UPDATED) ->{
            return searchBlogPostsOrderByDateDESC(
                query = query,
                page = page)
        }

        filterAndOrder.contains(ORDER_BY_ASC_DATE_UPDATED) ->{
            return searchBlogPostsOrderByDateASC(
                query = query,
                page = page)
        }

        filterAndOrder.contains(ORDER_BY_DESC_TITLE) ->{
            return searchBlogPostsOrderByTitleDESC(
                query = query,
                page = page)
        }

        filterAndOrder.contains(ORDER_BY_ASC_TITLE) ->{
            return searchBlogPostsOrderByTitleASC(
                query = query,
                page = page)
        }
        else ->
            return searchBlogPostsOrderByDateDESC(
                query = query,
                page = page
            )
    }
}






