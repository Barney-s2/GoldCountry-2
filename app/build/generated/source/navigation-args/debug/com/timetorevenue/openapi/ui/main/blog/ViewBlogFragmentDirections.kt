package com.timetorevenue.openapi.ui.main.blog

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class ViewBlogFragmentDirections private constructor() {
    companion object {
        fun actionViewBlogFragmentToUpdateBlogFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_viewBlogFragment_to_updateBlogFragment)

        fun actionViewBlogFragmentToHome(): NavDirections =
                ActionOnlyNavDirections(R.id.action_viewBlogFragment_to_home)
    }
}
