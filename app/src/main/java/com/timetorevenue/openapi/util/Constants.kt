package com.timetorevenue.openapi.util
//

class Constants {

    companion object{

        const val BASE_URL = "https://t2r.co/api/"
        const val PASSWORD_RESET_URL: String = "https://t2r.co/password_reset/"


        const val NETWORK_TIMEOUT = 8000L
        const val CACHE_TIMEOUT = 2000L
        const val TESTING_NETWORK_DELAY = 0L // fake network delay for testing
        const val TESTING_CACHE_DELAY = 0L // fake cache delay for testing


        const val PAGINATION_PAGE_SIZE = 10

        const val GALLERY_REQUEST_CODE = 201
        const val PERMISSIONS_REQUEST_READ_STORAGE: Int = 301
        const val CROP_IMAGE_INTENT_CODE: Int = 401
    }
    //FROM package com.codingwithmitch.cleannotes.util
    object  Constants{

        const val TAG = "AppDebug" // Tag for logs
        const val DEBUG = true // enable logging
    }
}