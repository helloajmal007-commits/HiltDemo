package com.dubaiza.detaile.data.api.datasource

import com.dubaiza.detaile.data.api.model.ItemDetailResponse

interface DetailDataSource {
    suspend fun getDetail(): ItemDetailResponse
}


