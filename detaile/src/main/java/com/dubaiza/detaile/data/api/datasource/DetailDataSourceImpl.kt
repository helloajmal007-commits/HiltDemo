package com.dubaiza.detaile.data.api.datasource

 import com.dubaiza.detaile.data.api.DetailApi
import com.dubaiza.detaile.data.api.model.ItemDetailResponse
 import com.dubaiza.network.extensions.handleCall
 import javax.inject.Inject

internal class DetailDataSourceImpl @Inject constructor(
    private val api: DetailApi
) : DetailDataSource {

    override suspend fun getDetail(): ItemDetailResponse {
        return handleCall {
            api.getDetail()
        }
    }
}