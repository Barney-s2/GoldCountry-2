package com.timetorevenue.openapi.repository.main.framework.datasource.network.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "blog_post")
data class ABlogCacheEntity(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "pk")
    var pk: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "slug")
    var slug: String,

    @ColumnInfo(name = "body")
    var body: String,

    @ColumnInfo(name = "image")
    val image: String,

    @ColumnInfo(name = "username")
    val username: String,

    @ColumnInfo(name = "updated_at")
    var updated_at: String,

    @ColumnInfo(name = "created_at")
    var created_at: String



){




    companion object{

        fun nullTitleError(): String{
            return "You must enter a title."
        }

        fun nullIdError(): String{
            return "BlogEntity object has a null id. This should not be possible. Check local database."
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ABlogCacheEntity

        if (pk != other.pk) return false
        if (title != other.title) return false
        if (body != other.body) return false
        if (image != other.image) return false
        if (created_at != other.created_at) return false

        return true
    }

    override fun hashCode(): Int {
        var result = pk.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + body.hashCode()
        result = 31 * result + image.hashCode()
        result = 31 * result + updated_at.hashCode()
        result = 31 * result + created_at.hashCode()
        return result
    }
}