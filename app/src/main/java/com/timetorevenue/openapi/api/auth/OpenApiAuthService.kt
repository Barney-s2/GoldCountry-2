package com.timetorevenue.openapi.api.auth

import com.timetorevenue.openapi.api.auth.network_responses.LoginResponse
import com.timetorevenue.openapi.api.auth.network_responses.RegistrationResponse
import com.timetorevenue.openapi.di.auth.AuthScope
import retrofit2.http.*

@AuthScope
interface OpenApiAuthService {

    @POST("account/login")
    @FormUrlEncoded
    suspend fun login(
        @Field("username") email: String,
        @Field("password") password: String
    ): LoginResponse

    @POST("account/register")
    @FormUrlEncoded
    suspend fun register(
        @Field("email") email: String,
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("password2") password2: String
    ): RegistrationResponse

}
