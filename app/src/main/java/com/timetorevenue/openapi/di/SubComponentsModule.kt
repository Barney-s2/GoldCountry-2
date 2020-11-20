package com.timetorevenue.openapi.di

import com.timetorevenue.openapi.di.auth.AuthComponent
import com.timetorevenue.openapi.di.main.MainComponent
import com.timetorevenue.openapi.di.main.ProductionModule
import dagger.Module

@Module(
    subcomponents = [
        AuthComponent::class,
        MainComponent::class,
        ProductionModule::class
    ]
)
class SubComponentsModule