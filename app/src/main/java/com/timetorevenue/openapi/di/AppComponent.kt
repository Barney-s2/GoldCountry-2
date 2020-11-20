package com.timetorevenue.openapi.di

import android.app.Application
import com.timetorevenue.openapi.di.auth.AuthComponent
import com.timetorevenue.openapi.di.main.MainComponent
import com.timetorevenue.openapi.di.main.ProductionModule
import com.timetorevenue.openapi.session.SessionManager
import com.timetorevenue.openapi.ui.BaseActivity
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton

@FlowPreview
@ExperimentalCoroutinesApi
@Singleton
@Component(
    modules = [
        AppModule::class,
        SubComponentsModule::class
    ]
)
interface AppComponent  {

    val sessionManager: SessionManager

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(baseActivity: BaseActivity)

    fun authComponent(): AuthComponent.Factory

    fun mainComponent(): MainComponent.Factory

}








