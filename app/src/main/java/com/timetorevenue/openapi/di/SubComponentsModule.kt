package com.timetorevenue.openapi.di

import com.timetorevenue.openapi.di.auth.AuthComponent
import com.timetorevenue.openapi.di.main.MainComponent
import dagger.Module

@Module(
    subcomponents = [
        AuthComponent::class,
        MainComponent::class
    ]
)
class SubComponentsModule