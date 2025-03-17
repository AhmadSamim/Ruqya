package com.sheesha.ruqya.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sheesha.ruqya.model.Audio
import com.sheesha.ruqya.model.Reciter
import com.sheesha.ruqya.model.Surah
import com.sheesha.ruqya.ui.theme.RuqyaTheme
import com.sheesha.ruqya.ui.theme.views.SurahListView


@Composable
fun SurahItem(surah: Surah) {
    var isTranslationVisible by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(bottom = 16.dp)) {
        // Arabic Text
        Text(
            text = surah.arabic1,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodyLarge,

        )

        Row {
            Text(
                text = "${surah.ayahNo}", // Assuming surah has an ayahNumber property
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 4.dp, end = 8.dp)
            )

            Text(
                text = surah.surahName,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }


        Spacer(Modifier.padding(bottom = 8.dp))


        Text(
            text = if (isTranslationVisible) surah.english else "See Translation",
          style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isTranslationVisible = !isTranslationVisible },
            color = Color.Gray
        )
    }
}

