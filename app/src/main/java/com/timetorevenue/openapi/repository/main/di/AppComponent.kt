package com.timetorevenue.openapi.repository.main.di

import com.timetorevenue.openapi.di.AppModule
import com.timetorevenue.openapi.di.main.ProductionModule
import com.timetorevenue.openapi.repository.main.presentation.BaseApplication
import com.timetorevenue.openapi.ui.main.MainActivity
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
        ProductionModule::class
    ]
)
interface AppComponent{

    @Component.Factory
    interface Factory{

        fun create(@BindsInstance app: BaseApplication): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}