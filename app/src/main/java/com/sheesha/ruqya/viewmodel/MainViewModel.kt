package com.sheesha.ruqya.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqya.model.QuranApiService
import com.sheesha.ruqya.model.RetrofitInstance
import com.sheesha.ruqya.model.Surah
import com.sheesha.ruqya.model.VersesBasedOnCategory.generalRuqya
import com.sheesha.ruqya.model.VersesBasedOnCategory.symbolicSihrVerses
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val apiService = RetrofitInstance.retrofit.create(QuranApiService::class.java)




    private val _generalRuqyaFlow = MutableStateFlow<List<Surah>>(emptyList())
    val generalRuqyaFlow: StateFlow<List<Surah>> = _generalRuqyaFlow.asStateFlow()

    private val _symbolicSihrVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val  symbolicSihrVersesFlow: StateFlow<List<Surah>> = _symbolicSihrVersesFlow.asStateFlow()


    init {
        // Call the fetch function for each category and pass its corresponding vals and category name
        fetchSurahData(generalRuqya, "generalRuqya")
        fetchSurahData(symbolicSihrVerses, "symbolic")

    }


    private fun fetchSurahData(ayahRequests: List<Pair<Int, Int>>, category: String) {
        viewModelScope.launch {
            ayahRequests.forEach { (surah, ayah) ->
                try {
                    val surahResult = fetchSingleAyah(surah, ayah)
                    surahResult?.let {
                        when (category) {
                            "generalRuqya" -> _generalRuqyaFlow.value += it
                            "symbolic" -> _symbolicSihrVersesFlow.value += it
                            else -> {
                                Log.e("fetchSurahData", "Unknown category: $category")
                            }
                        }
                    }
                } catch (_: Exception) {
                    // Handle exception if needed
                }
            }
        }
    }

    private suspend fun fetchSingleAyah(surah: Int, ayah: Int): Surah? {
        return try {
            apiService.getSurah(surah, ayah)
        } catch (e: Exception) {
            null
        }
    }
}


