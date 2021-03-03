package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun GenerateImage(imageId: Int, modifier: Modifier) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun GenerateName(name: String) {
    Text(
        text = name,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun GenerateDetail(detail: String) {
    Text(
        text = detail,
        fontSize = 14.sp,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun GenerateButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Adopt Me, Don't Eat Me!")
    }
}
