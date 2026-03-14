package com.dubaiza.detaile.presentation.state

import androidx.compose.runtime.Immutable
import com.example.detail.domain.model.ItemDetail

@Immutable
data class DetailUIState(
    val itemData: ItemDetail?,
    val isLoading: Boolean = false,
    val error: Throwable? = null
)