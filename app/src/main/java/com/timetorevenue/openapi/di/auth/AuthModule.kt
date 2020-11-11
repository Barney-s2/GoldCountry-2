package com.timetorevenue.openapi.di.auth

import android.content.SharedPreferences
import com.timetorevenue.openapi.api.auth.OpenApiAuthService
import com.timetorevenue.openapi.persistence.AccountPropertiesDao
import com.timetorevenue.openapi.persistence.AuthTokenDao
import com.timetorevenue.openapi.repository.auth.AuthRepository
import com.timetorevenue.openapi.repository.auth.AuthRepositoryImpl
import com.timetorevenue.openapi.session.SessionManager
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.FlowPreview
import retrofit2.Retrofit

@FlowPreview
@Module
object AuthModule{

    @JvmStatic
    @AuthScope
    @Provides
    fun provideOpenApiAuthService(retrofitBuilder: Retrofit.Builder): OpenApiAuthService {
        return retrofitBuilder
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @JvmStatic
    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService,
        preferences: SharedPreferences,
        editor: SharedPreferences.Editor
        ): AuthRepository {
        return AuthRepositoryImpl(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager,
            preferences,
            editor
        )
    }


}









