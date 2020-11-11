package com.timetorevenue.openapi.ui

import com.timetorevenue.openapi.util.Response
import com.timetorevenue.openapi.util.StateMessageCallback

interface UICommunicationListener {

    fun onResponseReceived(
        response: Response,
        stateMessageCallback: StateMessageCallback
    )

    fun displayProgressBar(isLoading: Boolean)

    fun expandAppBar()

    fun hideSoftKeyboard()

    fun isStoragePermissionGranted(): Boolean
}