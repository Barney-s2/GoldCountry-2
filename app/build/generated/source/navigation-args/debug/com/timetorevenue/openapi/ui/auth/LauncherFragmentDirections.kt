package com.timetorevenue.openapi.ui.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.timetorevenue.openapi.R

class LauncherFragmentDirections private constructor() {
    companion object {
        fun actionLauncherFragmentToForgotPasswordFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_launcherFragment_to_forgotPasswordFragment)

        fun actionLauncherFragmentToLoginFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_launcherFragment_to_loginFragment)

        fun actionLauncherFragmentToRegisterFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_launcherFragment_to_registerFragment)
    }
}
