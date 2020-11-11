package com.timetorevenue.openapi.api.main.responses

import com.timetorevenue.openapi.models.BlogPost
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.timetorevenue.openapi.util.DateUtils

class BlogSearchResponse(

    @SerializedName("pk")
    @Expose
    var pk: Int,

    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("slug")
    @Expose
    var slug: String,

    @SerializedName("body")
    @Expose
    var body: String,

    @SerializedName("image")
    @Expose
    var image: String,

    @SerializedName("date_updated")
    @Expose
    var date_updated: String,

    @SerializedName("created_at")
    @Expose
    var created_at: String,

    @SerializedName("username")
    @Expose
    var username: String


) {
    fun toBlogPost(): BlogPost{
        return BlogPost(
            pk = pk,
            title = title,
            slug = slug,
            body = body,
            image = image,
            updated_at = date_updated,
            created_at = created_at,
            username = username
        )
    }

    override fun toString(): String {
        return "BlogSearchResponse(pk=$pk," +
               "title='$title', slug='$slug'," +
                "image='$image'," +
                "date_updated='$date_updated'," +
                "created_at='$created_at'," +
                "username='$username')"
    }
}















