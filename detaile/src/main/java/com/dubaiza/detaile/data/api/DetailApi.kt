package com.dubaiza.detaile.data.api

import com.dubaiza.detaile.data.api.model.ItemDetailResponse
import retrofit2.Response
import retrofit2.http.GET

interface DetailApi {
    @GET("/basaransuleyman/suleyman-basaranoglu-json/main/detail-page")
    suspend fun getDetail(): Response<ItemDetailResponse>
}