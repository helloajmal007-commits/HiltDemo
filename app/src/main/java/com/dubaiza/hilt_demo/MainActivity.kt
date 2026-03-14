package com.dubaiza.hilt_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dubaiza.hilt_demo.ui.theme.HiltDemoTheme
import com.dubaiza.detaile.presentation.DetailScreen
import com.dubaiza.detaile.presentation.DetailSearchScreen
import com.example.home.presentation.HomeScreen
import com.example.list.presentation.ListScreen
import com.dubaiza.navigation.AppNavigation
import com.dubaiza.navigation.Navigator
import com.dubaiza.navigation.graph.DetailScreens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            HiltDemoTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    AppNavigation(
                        navigator = navigator,
                        homeScreen = {
                            HomeScreen()
                        },
                        listScreen = {
                            ListScreen()
                        },
                        detailScreen = {// We can get args with "it" if we need
                            DetailScreen()
                        },
                        detailScreenWithGraph = DetailScreens(
                            detailMain = { DetailScreen() },
                            detailSearch = { DetailSearchScreen() }
                        )
                    )

                    /* Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! App",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HiltDemoTheme {

        Greeting("Android")
    }
}