package com.sheesha.ruqya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.sheesha.ruqya.ui.mainScreen.MainViewModel
import com.sheesha.ruqya.ui.theme.RuqyaTheme

import com.sheesha.ruqya.ui.theme.views.RuqyaApp


class MainActivity : ComponentActivity() {

     val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            RuqyaTheme {

             RuqyaApp(mainViewModel)


            }
        }
    }
}

