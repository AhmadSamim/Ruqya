package com.sheesha.ruqya.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


import androidx.compose.ui.text.font.Font

import com.sheesha.ruqya.R

// Custom Quranic font - Regular and Bold variants
val QalamQuranicFont = FontFamily(
    Font(R.font.qalam_shiped, FontWeight.Normal), // Regular font
    Font(R.font.qalam_shiped, FontWeight.Bold)      // Bold font
)

// Set of Material typography styles with Amiri Quran applied
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = QalamQuranicFont,
        fontWeight = FontWeight.Bold,  // Regular weight
        fontSize = 32.sp,
        lineHeight = 70.sp,
        letterSpacing = 6.sp
    ),
    titleLarge = TextStyle(
        fontFamily = QalamQuranicFont,
        fontWeight = FontWeight.Bold,  // Bold weight for titles
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = QalamQuranicFont,
        fontWeight = FontWeight.Medium,  // If you have a medium weight
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
