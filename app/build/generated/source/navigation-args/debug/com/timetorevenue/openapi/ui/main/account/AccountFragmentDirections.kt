package com.timetorevenue.openapi.ui.main.account

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class AccountFragmentDirections private constructor() {
    companion object {
        fun actionAccountFragmentToChangePasswordFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_accountFragment_to_changePasswordFragment)

        fun actionAccountFragmentToUpdateAccountFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_accountFragment_to_updateAccountFragment)
    }
}
