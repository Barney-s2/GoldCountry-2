package com.timetorevenue.openapi.repository.main.datasource.preferences


class PreferenceKeys {

    companion object{

        // Shared Preference Files:
        const val BLOG_PREFERENCES: String = "com.timetorevenue.openapi.blogPosts"

        // Shared Preference Keys
        val BLOG_FILTER: String = "${BLOG_PREFERENCES}.BLOG_FILTER"
        val BLOG_ORDER: String = "${BLOG_PREFERENCES}.BLOG_ORDER"

    }
}