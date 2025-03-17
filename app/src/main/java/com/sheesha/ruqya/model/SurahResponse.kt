package com.sheesha.ruqya.model

data class Surah(
    val surahName: String,
    val surahNameTranslation: String,
    val ayahNo: Int,
    val english: String,
    val arabic1: String,
    val audio: Audio
)

data class Audio(
    val `1`: Reciter,
    val `2`: Reciter
)

data class Reciter(
    val reciter: String,
    val url: String
)
