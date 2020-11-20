package com.timetorevenue.openapi.ui.main.blog

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class BlogFragmentDirections private constructor() {
    companion object {
        fun actionBlogFragmentToViewBlogFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_blogFragment_to_viewBlogFragment)
    }
}
