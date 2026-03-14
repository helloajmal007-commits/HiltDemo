package com.dubaiza.marketplace.home.data.api.datasource

import com.dubaiza.marketplace.home.data.api.model.HomeResponse

interface HomeDataSource {
    suspend fun getHome(): HomeResponse
}