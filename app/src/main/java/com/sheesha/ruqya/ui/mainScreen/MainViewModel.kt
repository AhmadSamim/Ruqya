package com.sheesha.ruqya.ui.mainScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqya.data.model.Aya
import com.sheesha.ruqya.data.model.VersesBasedOnCategory.generalRuqya
import com.sheesha.ruqya.data.model.VersesBasedOnCategory.symbolicSihrVerses
import com.sheesha.ruqya.repository.QuranRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: QuranRepository
) : ViewModel() {

    private val _generalRuqyaFlow = MutableStateFlow<List<Aya>>(emptyList())
    val generalRuqyaFlow: StateFlow<List<Aya>> = _generalRuqyaFlow.asStateFlow()

    private val _symbolicSihrVersesFlow = MutableStateFlow<List<Aya>>(emptyList())
    val symbolicSihrVersesFlow: StateFlow<List<Aya>> = _symbolicSihrVersesFlow.asStateFlow()

    init {
        fetchSurahData(generalRuqya, "generalRuqya")
        fetchSurahData(symbolicSihrVerses, "symbolic")
    }

    private fun fetchSurahData(ayahRequests: List<Pair<Int, Int>>, category: String) {
        viewModelScope.launch {
            ayahRequests.forEach { (surah, ayah) ->
                try {
                    val surahResult = repository.fetchSingleAyah(surah, ayah)
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
}
