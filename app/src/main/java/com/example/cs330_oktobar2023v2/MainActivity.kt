package com.example.cs330_oktobar2023v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cs330_oktobar2023v2.presentation.AllPlayScreen
import com.example.cs330_oktobar2023v2.ui.theme.CS330Oktobar2023V2
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CS330Oktobar2023V2 {
                var navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Screen.AllPlayScreen.route
                    )
                    {
                        composable(
                            route = Screen.AllPlayScreen.route
                        ) {
                            AllPlayScreen(navController = navController)
                        }
//                        composable(
//                            route = Screen.AddNewFilm.route
//                        ){
//                            NewFilmScreen(navController = navController)
//                        }
//                        composable(
//                            route = Screen.FilmDetailScreen.route + "/{filmId}"
//                        ){
//                            FilmDetailScreen(navController = navController)
//                        }
                    }
                }
            }
        }
    }

}