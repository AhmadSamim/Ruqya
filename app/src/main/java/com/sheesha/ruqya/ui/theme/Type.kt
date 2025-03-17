package com.sheesha.ruqya.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


import androidx.compose.ui.text.font.Font

import com.sheesha.ruqya.R

// Custom Quranic font - Regular and Bold variants
val AmiriQuranFont = FontFamily(
    Font(R.font.amiri_regular, FontWeight.Normal), // Regular font
    Font(R.font.amiri_bold, FontWeight.Bold)      // Bold font
)

// Set of Material typography styles with Amiri Quran applied
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = AmiriQuranFont,
        fontWeight = FontWeight.Bold,  // Regular weight
        fontSize = 24.sp,
        lineHeight = 50.sp,
        letterSpacing = 2.sp
    ),
    titleLarge = TextStyle(
        fontFamily = AmiriQuranFont,
        fontWeight = FontWeight.Bold,  // Bold weight for titles
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = AmiriQuranFont,
        fontWeight = FontWeight.Medium,  // If you have a medium weight
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
