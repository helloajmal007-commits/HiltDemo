package com.dubaiza.list.data.api.datasource

import com.dubaiza.list.data.api.model.ListResponse
import javax.inject.Inject
import com.dubaiza.list.data.api.ListApi
import com.dubaiza.network.extensions.handleCall
import com.example.list.data.api.datasource.ListDataSource

internal class ListDataSourceImpl @Inject constructor(
    private val api: ListApi
) : ListDataSource {
    override suspend fun getList(): ListResponse {
        return handleCall {
            api.getList()
        }
    }
}