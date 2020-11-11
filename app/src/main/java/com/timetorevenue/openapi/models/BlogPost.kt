package com.timetorevenue.openapi.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/**
 * (BJS) equivalent to cleannotes.framework.datasource.cache.model.NoteCacheEntity
 *
 * Local data class for modeling: https://open-api.xyz/ blog objects
see example: https://gist.github.com/mitchtabian/93f287bd1370e7a1ad3c9588b0b22e3d
 * Docs: https://open-api.xyz/api/
 */

@Parcelize
@Entity(tableName = "blog_post")
data class BlogPost(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "pK")
    var pk: Int,

    //@ColumnInfo(name = "title")
    var title: String,

    //@ColumnInfo(name = "slug")
    var slug: String,

    //@ColumnInfo(name = "body")
    var body: String,

    //@ColumnInfo(name = "image")
    var image: String,

    //@ColumnInfo(name = "date_updated")
    var updated_at: String,

    //@columnInfo(name = "created_at")
    var created_at: String,

    //@columnInfo(name = "username")
    var username: String


) : Parcelable {

    override fun toString(): String {
        return "BlogPost(" +
                "pk=$pk, " +
                "title='$title', " +
                "slug='$slug', " +
                "image='$image', " +
                "date_updated=$updated_at, " +
                "created_at:$created_at, " +
                "username='$username')"
    }






    companion object{

        val DATABASE_NAME: String = "blog_post"

        fun nullTitleError(): String{
            return "You must enter a title."
        }

        fun nullIdError(): String{
            return "NoteEntity object has a null id. This should not be possible. Check local database."
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BlogPost

        if (pk != other.pk) return false
        if (title != other.title) return false
        if (slug != other.slug) return false
        if (body != other.body) return false
        if (image != other.image) return false
        if (username !=other.username) return false
        if (created_at != other.created_at) return false

        return true
    }

    override fun hashCode(): Int {
        var result = pk.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + slug.hashCode()
        result = 31 * result + body.hashCode()
        result = 31 * result + image.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + updated_at.hashCode()
        result = 31 * result + created_at.hashCode()
        return result
    }
}


