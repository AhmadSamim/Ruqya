package com.sheesha.ruqya.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory




    object RetrofitInstance {
        private const val BASE_URL = "https://quranapi.pages.dev/"


        val retrofit: Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }



