package com.dubaiza.detaile.presentation.uievent

sealed class DetailUIEvent {
    data object Dismiss : DetailUIEvent()
    data object LoadItemDetail : DetailUIEvent()
    data object SearchDetailClick: DetailUIEvent()

}