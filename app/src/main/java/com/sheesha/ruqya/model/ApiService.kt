package com.sheesha.ruqya.model


import retrofit2.http.GET
import retrofit2.http.Path

interface QuranApiService {
    @GET("api/{surah}/{ayah}.json")
    suspend fun getAyah(
        @Path("surah") surahNumber: Int,
        @Path("ayah") ayahNumber: Int
    ): Aya
}