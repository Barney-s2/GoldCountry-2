package com.timetorevenue.openapi.ui.main.account

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class UpdateAccountFragmentDirections private constructor() {
    companion object {
        fun actionUpdateAccountFragmentToHome(): NavDirections =
                ActionOnlyNavDirections(R.id.action_updateAccountFragment_to_home)
    }
}
