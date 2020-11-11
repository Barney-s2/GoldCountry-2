package com.timetorevenue.openapi.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

import com.timetorevenue.openapi.repository.main.datasource.network.BlogNetworkDataSource
import com.timetorevenue.openapi.business.domain.model.NoteFactory
import com.timetorevenue.openapi.repository.main.business.util.DateUtil
import com.timetorevenue.openapi.persistence.BlogPostDao
import com.timetorevenue.openapi.repository.main.datasource.network.BlogNetworkDataSourceImpl
import com.timetorevenue.openapi.repository.main.datasource.cache.mappers.CacheMapper
import com.timetorevenue.openapi.repository.main.datasource.network.BlogFirestoreServiceImpl
import com.timetorevenue.openapi.business.data.network.implementation.NoteNetworkDataSourceImpl
import com.timetorevenue.openapi.business.interactors.common.DeleteNote
import com.timetorevenue.openapi.business.interactors.notedetail.NoteDetailInteractors
import com.timetorevenue.openapi.business.interactors.notedetail.UpdateNote
import com.timetorevenue.openapi.business.interactors.notelist.*
import com.timetorevenue.openapi.business.interactors.splash.SyncDeletedNotes
import com.timetorevenue.openapi.business.interactors.splash.SyncNotes
import com.timetorevenue.openapi.repository.main.datasource.cache.abstraction.BlogDaoService
import com.timetorevenue.openapi.repository.main.datasource.cache.implementation.BlogDaoServiceImpl
import com.timetorevenue.openapi.repository.main.datasource.network.BlogFirestoreService
import com.timetorevenue.openapi.repository.main.datasource.network.mappers.NetworkMapper
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Singleton

import androidx.room.Room
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.timetorevenue.openapi.R
import com.timetorevenue.openapi.persistence.AccountPropertiesDao
import com.timetorevenue.openapi.persistence.AppDatabase
import com.timetorevenue.openapi.persistence.AppDatabase.Companion.DATABASE_NAME
import com.timetorevenue.openapi.persistence.AuthTokenDao
import com.timetorevenue.openapi.util.Constants
import com.timetorevenue.openapi.util.PreferenceKeys
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@ExperimentalCoroutinesApi
@FlowPreview
@Module
object AppModule{

    @JvmStatic
    @Singleton
    @Provides
    fun provideSharedPreferences(
        application: Application
    ): SharedPreferences {
        return application
            .getSharedPreferences(
                PreferenceKeys.APP_PREFERENCES,
                Context.MODE_PRIVATE
            )
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideSharedPrefsEditor(
        sharedPreferences: SharedPreferences
    ): SharedPreferences.Editor {
        return sharedPreferences.edit()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideRetrofitBuilder(gsonBuilder:  Gson): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gsonBuilder))
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideAppDb(app: Application): AppDatabase {
        return Room
            .databaseBuilder(app, AppDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration() // get correct db version if schema changed
            .build()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideAuthTokenDao(db: AppDatabase): AuthTokenDao {
        return db.getAuthTokenDao()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideAccountPropertiesDao(db: AppDatabase): AccountPropertiesDao {
        return db.getAccountPropertiesDao()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions {
        return RequestOptions
            .placeholderOf(R.drawable.default_image)
            .error(R.drawable.default_image)
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

}