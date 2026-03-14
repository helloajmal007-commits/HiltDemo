package com.dubaiza.navigation.di

import com.dubaiza.core.navigation.NavigationService
 import com.dubaiza.navigation.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    fun provideNavigationCommander(navigator: Navigator): NavigationService = navigator
}