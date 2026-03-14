package com.dubaiza.list.data.api

import com.dubaiza.list.data.api.model.ListResponse
import retrofit2.Response
import retrofit2.http.GET

interface ListApi {

    @GET("/basaransuleyman/suleyman-basaranoglu-json/main/list-page-paging-first")
    suspend fun getList() : Response<ListResponse>

}