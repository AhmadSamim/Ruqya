package com.sheesha.ruqya.data.model

data class Aya(
    val surahName: String,
    val surahNameTranslation: String,
    val ayahNo: Int,
    val english: String,
    val arabic1: String,
    val audio: Audio
)

data class Audio(
    val `1`: Reciter,
    val `2`: Reciter,
    val `3`: Reciter,
    val `4`: Reciter
)

data class Reciter(
    val reciter: String,
    val url: String
)
