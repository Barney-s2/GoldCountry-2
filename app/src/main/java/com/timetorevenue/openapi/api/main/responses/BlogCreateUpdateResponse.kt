package com.timetorevenue.openapi.api.main.responses

import com.timetorevenue.openapi.models.BlogPost
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class BlogCreateUpdateResponse(

    @SerializedName("response")
    @Expose
    var response: String,

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

    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("updated_at")
    @Expose
    var updated_at: String,

    @SerializedName("created_at")
    @Expose
    var created_at: String





){
    fun toBlogPost(): BlogPost {
        return BlogPost(
            pk = pk,
            title = title,
            slug = slug,
            body = body,
            image = image,
            username = username,
            updated_at = updated_at,
            created_at = created_at

        )
    }


}













