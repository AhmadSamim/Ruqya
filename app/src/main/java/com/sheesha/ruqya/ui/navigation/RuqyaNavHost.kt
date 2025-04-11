package com.sheesha.ruqya.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sheesha.ruqya.ui.components.AyahListView
import com.sheesha.ruqya.ui.mainScreen.MainViewModel

@Composable
fun RuqyaNavHost(navController: NavHostController, mainViewModel: MainViewModel) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeScreen(navController)
        }

        composable(Screen.Symbolic.route) {
            val verses = mainViewModel.symbolicSihrVersesFlow.collectAsState().value
            AyahListView(verses)
        }
        composable(Screen.General.route) {
            val verses = mainViewModel.generalRuqyaFlow.collectAsState().value
            AyahListView(verses)
        }

    }
}
