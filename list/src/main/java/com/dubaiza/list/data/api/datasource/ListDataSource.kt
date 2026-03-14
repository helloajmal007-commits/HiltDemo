package com.example.list.data.api.datasource

import com.dubaiza.list.data.api.model.ListResponse
interface ListDataSource {
    suspend fun getList(): ListResponse
}