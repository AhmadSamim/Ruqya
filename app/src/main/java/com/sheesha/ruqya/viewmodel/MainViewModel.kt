package com.sheesha.ruqya.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqya.model.QuranApiService
import com.sheesha.ruqya.model.RetrofitInstance
import com.sheesha.ruqya.model.Aya
import com.sheesha.ruqya.model.VersesBasedOnCategory.generalRuqya
import com.sheesha.ruqya.model.VersesBasedOnCategory.symbolicSihrVerses
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val apiService = RetrofitInstance.retrofit.create(QuranApiService::class.java)




    private val _generalRuqyaFlow = MutableStateFlow<List<Aya>>(emptyList())
    val generalRuqyaFlow: StateFlow<List<Aya>> = _generalRuqyaFlow.asStateFlow()

    private val _symbolicSihrVersesFlow = MutableStateFlow<List<Aya>>(emptyList())
    val  symbolicSihrVersesFlow: StateFlow<List<Aya>> = _symbolicSihrVersesFlow.asStateFlow()


    init {
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

    private suspend fun fetchSingleAyah(surah: Int, ayah: Int): Aya? {
        return try {
            apiService.getAyah(surah, ayah)
        } catch (e: Exception) {
            null
        }
    }







}


