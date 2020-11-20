package com.timetorevenue.openapi.ui.main.blog

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class UpdateBlogFragmentDirections private constructor() {
    companion object {
        fun actionUpdateBlogFragmentToHome(): NavDirections =
                ActionOnlyNavDirections(R.id.action_updateBlogFragment_to_home)
    }
}
