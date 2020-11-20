package com.timetorevenue.openapi.ui.main.account

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class ChangePasswordFragmentDirections private constructor() {
    companion object {
        fun actionChangePasswordFragmentToHome(): NavDirections =
                ActionOnlyNavDirections(R.id.action_changePasswordFragment_to_home)
    }
}
