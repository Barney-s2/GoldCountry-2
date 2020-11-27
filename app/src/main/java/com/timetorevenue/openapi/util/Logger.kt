package com.timetorevenue.openapi.util
//package com.codingwithmitch.cleannotes.util

import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.timetorevenue.openapi.util.Constants.Constants.DEBUG
import com.timetorevenue.openapi.util.Constants.Constants.TAG

var isUnitTest = false

fun printLogD(className: String?, message: String ) {
    if (DEBUG && !isUnitTest) {
        Log.d(TAG, "$className: $message")
    }
    else if(DEBUG && isUnitTest){
        println("$className: $message")
    }
}

/*
    Priorities: Log.DEBUG, Log. etc....
 */
fun cLog(msg: String?){
    msg?.let {
        if(!DEBUG){
            FirebaseCrashlytics.getInstance().log(it)
        }
    }

}