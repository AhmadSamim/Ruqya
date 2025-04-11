package com.sheesha.ruqya.repository

import com.sheesha.ruqya.data.api.QuranApiService
import com.sheesha.ruqya.data.model.Aya
import javax.inject.Inject

class QuranRepository @Inject constructor(
    private val apiService: QuranApiService
) {

    suspend fun fetchSingleAyah(surah: Int, ayah: Int): Aya? {
        return try {
            apiService.getAyah(surah, ayah)
        } catch (e: Exception) {
            null
        }
    }
}
