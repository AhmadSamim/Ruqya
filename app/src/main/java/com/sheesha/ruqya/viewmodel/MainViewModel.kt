package com.sheesha.ruqya.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqya.model.QuranApiService
import com.sheesha.ruqya.model.RetrofitInstance
import com.sheesha.ruqya.model.Surah
import com.sheesha.ruqya.model.VersesBasedOnCategory.aynAndHasadVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.badDreamsMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.bleedingMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.burningAndPunishments
import com.sheesha.ruqya.model.VersesBasedOnCategory.christianJinnVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.erectileDysfunctionMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.generalRuqya
import com.sheesha.ruqya.model.VersesBasedOnCategory.heartLocksAndKnots
import com.sheesha.ruqya.model.VersesBasedOnCategory.illusionMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.jewishJinnVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.jinnBotheringVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.lethargyMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.loveMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.madnessMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.marriageImpedanceMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.muslimJinnVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.otherJinnVerses
import com.sheesha.ruqya.model.VersesBasedOnCategory.separationMagic
import com.sheesha.ruqya.model.VersesBasedOnCategory.sicknessMagic
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val apiService = RetrofitInstance.retrofit.create(QuranApiService::class.java)

    private val _surahList = MutableStateFlow<List<Surah>>(emptyList())
    val surahList: StateFlow<List<Surah>> = _surahList.asStateFlow()


    // Category flows for Surah list, initialized with empty lists
    private val _generalRuqyaFlow = MutableStateFlow<List<Surah>>(emptyList())
    val generalRuqyaFlow: StateFlow<List<Surah>> = _generalRuqyaFlow.asStateFlow()

    private val _burningAndPunishmentsFlow = MutableStateFlow<List<Surah>>(emptyList())
    val burningAndPunishmentsFlow: StateFlow<List<Surah>> = _burningAndPunishmentsFlow.asStateFlow()

    private val _loveMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val loveMagicFlow: StateFlow<List<Surah>> = _loveMagicFlow.asStateFlow()

    private val _separationMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val separationMagicFlow: StateFlow<List<Surah>> = _separationMagicFlow.asStateFlow()

    private val _madnessMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val madnessMagicFlow: StateFlow<List<Surah>> = _madnessMagicFlow.asStateFlow()

    private val _sicknessMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val sicknessMagicFlow: StateFlow<List<Surah>> = _sicknessMagicFlow.asStateFlow()

    private val _lethargyMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val lethargyMagicFlow: StateFlow<List<Surah>> = _lethargyMagicFlow.asStateFlow()

    private val _badDreamsMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val badDreamsMagicFlow: StateFlow<List<Surah>> = _badDreamsMagicFlow.asStateFlow()

    private val _illusionMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val illusionMagicFlow: StateFlow<List<Surah>> = _illusionMagicFlow.asStateFlow()

    private val _bleedingMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val bleedingMagicFlow: StateFlow<List<Surah>> = _bleedingMagicFlow.asStateFlow()

    private val _marriageImpedanceMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val marriageImpedanceMagicFlow: StateFlow<List<Surah>> = _marriageImpedanceMagicFlow.asStateFlow()

    private val _erectileDysfunctionMagicFlow = MutableStateFlow<List<Surah>>(emptyList())
    val erectileDysfunctionMagicFlow: StateFlow<List<Surah>> = _erectileDysfunctionMagicFlow.asStateFlow()

    private val _jinnBotheringVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val jinnBotheringVersesFlow: StateFlow<List<Surah>> = _jinnBotheringVersesFlow.asStateFlow()

    private val _christianJinnVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val christianJinnVersesFlow: StateFlow<List<Surah>> = _christianJinnVersesFlow.asStateFlow()


    private val _muslimJinnVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val muslimJinnVersesFlow: StateFlow<List<Surah>> = _muslimJinnVersesFlow.asStateFlow()

    private val _jewishJinnVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val jewishJinnVersesFlow: StateFlow<List<Surah>> = _jewishJinnVersesFlow.asStateFlow()

    private val _otherJinnVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val otherJinnVersesFlow: StateFlow<List<Surah>> = _otherJinnVersesFlow.asStateFlow()

    private val _locksAndKnotsFlow = MutableStateFlow<List<Surah>>(emptyList())
    val lockAndKnotsFlow: StateFlow<List<Surah>> = _locksAndKnotsFlow.asStateFlow()


    private val _aynAndHasadVersesFlow = MutableStateFlow<List<Surah>>(emptyList())
    val aynAndHasadVersesFlow: StateFlow<List<Surah>> = _aynAndHasadVersesFlow.asStateFlow()

    init {
        // Call the fetch function for each category and pass its corresponding vals and category name
        fetchSurahData(generalRuqya, "generalRuqya")
        fetchSurahData(burningAndPunishments, "burningAndPunishments")
        fetchSurahData(loveMagic, "loveMagic")
        fetchSurahData(separationMagic, "separationMagic")
        fetchSurahData(madnessMagic, "madnessMagic")
        fetchSurahData(sicknessMagic, "sicknessMagic")
        fetchSurahData(lethargyMagic, "lethargyMagic")
        fetchSurahData(badDreamsMagic, "badDreamsMagic")
        fetchSurahData(illusionMagic, "illusionMagic")
        fetchSurahData(bleedingMagic, "bleedingMagic")
        fetchSurahData(marriageImpedanceMagic, "marriageImpedanceMagic")
        fetchSurahData(erectileDysfunctionMagic, "erectileDysfunctionMagic")
        fetchSurahData(jinnBotheringVerses, "jinnBotheringVerses")
        fetchSurahData(christianJinnVerses, "christianJinnVerses")
        fetchSurahData(muslimJinnVerses, "muslimJinnVerses")
        fetchSurahData(jewishJinnVerses, "jewishJinnVerses")
        fetchSurahData(otherJinnVerses, "otherJinnVerses")
        fetchSurahData(aynAndHasadVerses, "aynAndHasadVerses")
        fetchSurahData(heartLocksAndKnots, "locksAndKnots")
    }


    private fun fetchSurahData(ayahRequests: List<Pair<Int, Int>>, category: String) {
        viewModelScope.launch {
            ayahRequests.forEach { (surah, ayah) ->
                try {
                    val surahResult = fetchSingleAyah(surah, ayah)
                    surahResult?.let {
                        when (category) {
                            "generalRuqya" -> _generalRuqyaFlow.value += it
                            "burningAndPunishments" -> _burningAndPunishmentsFlow.value += it
                            "loveMagic" -> _loveMagicFlow.value += it
                            "separationMagic" -> _separationMagicFlow.value += it
                            "madnessMagic" -> _madnessMagicFlow.value += it
                            "sicknessMagic" -> _sicknessMagicFlow.value += it
                            "lethargyMagic" -> _lethargyMagicFlow.value += it
                            "badDreamsMagic" -> _badDreamsMagicFlow.value += it
                            "illusionMagic" -> _illusionMagicFlow.value += it
                            "bleedingMagic" -> _bleedingMagicFlow.value += it
                            "marriageImpedanceMagic" -> _marriageImpedanceMagicFlow.value += it
                            "erectileDysfunctionMagic" -> _erectileDysfunctionMagicFlow.value += it
                            "jinnBotheringVerses" -> _jinnBotheringVersesFlow.value += it
                            "christianJinnVerses" -> _christianJinnVersesFlow.value += it
                            "muslimJinnVerses" -> _muslimJinnVersesFlow.value += it
                            "jewishJinnVerses" -> _jewishJinnVersesFlow.value += it
                            "otherJinnVerses" -> _otherJinnVersesFlow.value += it
                            "aynAndHasadVerses" -> _aynAndHasadVersesFlow.value += it
                            "locksAndKnots" -> _locksAndKnotsFlow.value += it
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


