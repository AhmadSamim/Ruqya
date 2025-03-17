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
        composable(Screen.Hassad.route) {
            val verses = mainViewModel.aynAndHasadVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Burning.route) {
            val verses = mainViewModel.burningAndPunishmentsFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.General.route) {
            val verses = mainViewModel.generalRuqyaFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Love.route) {
            val verses = mainViewModel.loveMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Separation.route) {
            val verses = mainViewModel.separationMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Madness.route) {
            val verses = mainViewModel.madnessMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Sickness.route) {
            val verses = mainViewModel.sicknessMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Lethargy.route) {
            val verses = mainViewModel.lethargyMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.BadDreams.route) {
            val verses = mainViewModel.badDreamsMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Illusion.route) {
            val verses = mainViewModel.illusionMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Bleeding.route) {
            val verses = mainViewModel.bleedingMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.Marriage.route) {
            val verses = mainViewModel.marriageImpedanceMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.SexualDysfunction.route) {
            val verses = mainViewModel.erectileDysfunctionMagicFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.JinBotheringVerses.route) {
            val verses = mainViewModel.jinnBotheringVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.CristianJinVerses.route) {
            val verses = mainViewModel.christianJinnVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.JewishJinVerses.route) {
            val verses = mainViewModel.jewishJinnVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.MuslimJinVerses.route) {
            val verses = mainViewModel.muslimJinnVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.OtherJinVerses.route) {
            val verses = mainViewModel.otherJinnVersesFlow.collectAsState().value
            SurahListView(verses)
        }
        composable(Screen.LocksAndKnots.route) {
            val verses = mainViewModel.lockAndKnotsFlow.collectAsState().value
            SurahListView(verses)
        }
    }
}
