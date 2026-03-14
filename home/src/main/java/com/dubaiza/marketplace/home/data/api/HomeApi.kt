package com.dubaiza.marketplace.home.data.api

import com.dubaiza.marketplace.home.data.api.model.HomeResponse
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {

    @GET("/basaransuleyman/suleyman-basaranoglu-json/main/home")
    suspend fun getHome(): Response<HomeResponse>

}