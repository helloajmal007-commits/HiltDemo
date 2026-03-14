package com.dubaiza.marketplace.home.data.api.datasource

 import com.dubaiza.marketplace.home.data.api.HomeApi
import com.dubaiza.marketplace.home.data.api.model.HomeResponse
import com.dubaiza.network.extensions.handleCall
import javax.inject.Inject

internal class HomeDataSourceImpl @Inject constructor(
    private val api: HomeApi
) : HomeDataSource {
    override suspend fun getHome(): HomeResponse {
        return handleCall {
            api.getHome()
        }
    }

}