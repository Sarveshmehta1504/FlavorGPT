package com.example.flavorgpt

import android.graphics.Paint.Align
import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flavorgpt.ui.theme.Black

@Composable
fun Loading(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ){
        CircularProgressIndicator(
            color = Black,
            strokeWidth = 4.dp,
            strokeCap = StrokeCap.Round
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoadingPreview(){
    Loading()
}