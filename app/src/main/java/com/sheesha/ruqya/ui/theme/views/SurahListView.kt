package com.sheesha.ruqya.ui.theme.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sheesha.ruqya.model.Aya
import com.sheesha.ruqya.ui.theme.components.SurahItem

@Composable
fun SurahListView(ayaList: List<Aya>) {
    if (ayaList.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Loading",
                    modifier = Modifier.size(80.dp),
                    tint = Color.Blue
                )

                Text(
                    text = "Loading...",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    } else {
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(ayaList) { surah ->
                SurahItem(aya = surah)
            }
        }
    }
}

