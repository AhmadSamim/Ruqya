package com.sheesha.ruqya.ui.navigation


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

import androidx.navigation.NavController
import com.sheesha.ruqya.ui.navigation.Screen
import com.sheesha.ruqya.ui.components.CategoryBox








@Composable
fun HomeScreen(navController: NavController) {
    val categories = Screen.entries // Get all enum values

    LazyColumn {
        items(categories) { screen ->
            CategoryBox(screen.route) {
                navController.navigate(screen.route)
            }
        }
    }
}










