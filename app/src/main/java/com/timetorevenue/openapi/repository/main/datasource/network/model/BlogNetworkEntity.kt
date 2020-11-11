package com.timetorevenue.openapi.repository.main.datasource.network.model

import com.google.firebase.Timestamp


data class BlogNetworkEntity(

    var pk: String,

    var title: String,

    var slug: String,

    var body: String,

    var image: String,

    var username: String,

    var updated_at: Timestamp,

    var created_at: Timestamp

){




    // no arg constructor for firestore
    constructor(): this(
        "",
        "",
        "",
        "",
        "",
        "",
        Timestamp.now(),
        Timestamp.now()
    )



    companion object{

        const val UPDATED_AT_FIELD = "updated_at"
        const val TITLE_FIELD = "title"
        const val SLUG_FIELD = "slug"
        const val BODY_FIELD = "body"
        const val IMAGE_FIELD = "image"
        const val USERNAME_FIELD = "username"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BlogNetworkEntity

        if (pk != other.pk) return false
        if (title != other.title) return false
        if (slug != other.slug) return false
        if (body != other.body) return false
        if (image != other.image) return false
        if (username != other.username) return false
        if (updated_at !=other.updated_at) return false
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