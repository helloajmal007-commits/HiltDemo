package com.dubaiza.navigation.graph

import com.dubaiza.navigation.utils.NavigationGraph

object DetailGraph : NavigationGraph {
    override val route: String
        get() = "detailgraph"
    override val startDestination: String
        get() = detailMain.destination(Unit)

    val detailMain = DetailMain
    val detailSearch = DetailSearch
}