package com.sheesha.ruqya.ui.theme.views

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sheesha.ruqya.viewmodel.MainViewModel

@Composable
fun RuqyaNavHost(navController: NavHostController, mainViewModel: MainViewModel) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeScreen(navController)
        }

        composable(Screen.Symbolic.route) {
            val verses = mainViewModel.symbolicSihrVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.General.route) {
            val verses = mainViewModel.generalRuqyaFlow.collectAsState().value
            SurahListView(verses)
        }

    }
}
