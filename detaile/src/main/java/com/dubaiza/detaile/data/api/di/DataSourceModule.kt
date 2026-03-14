package com.dubaiza.detaile.data.api.di

import com.dubaiza.detaile.data.api.DetailApi
import com.dubaiza.detaile.data.api.datasource.DetailDataSource
import com.dubaiza.detaile.data.api.datasource.DetailDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun provideHomeApi(retrofit: Retrofit): DetailApi {
        return retrofit.create(DetailApi::class.java)
    }

    @Singleton
    @Provides
    internal fun provideInitialResponseDataSource(apiService: DetailApi): DetailDataSource {
        return DetailDataSourceImpl(apiService)
    }

}