package com.timetorevenue.openapi.di.main


import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.timetorevenue.openapi.persistence.AppDatabase
import com.timetorevenue.openapi.repository.main.datasource.preferences.PreferenceKeys
import com.timetorevenue.openapi.BaseApplication
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton


/*
    Dependencies in this class have test fakes for ui tests. See "TestModule.kt" in
    androidTest dir
 */
@ExperimentalCoroutinesApi
@FlowPreview
@Module
object ProductionModule {


    @JvmStatic
    @Singleton
    @Provides
    fun provideBlogPostDb(app: BaseApplication): AppDatabase {
        return Room
            .databaseBuilder(app, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }


    @JvmStatic
    @Singleton
    @Provides
    fun provideSharedPreferences(
        application: BaseApplication
    ): SharedPreferences {
        return application
            .getSharedPreferences(
                PreferenceKeys.BLOG_PREFERENCES,
                Context.MODE_PRIVATE
            )
    }
}



