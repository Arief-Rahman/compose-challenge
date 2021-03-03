package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Detail(liveStockId: Int) {
    val liveStock = Fake.liveStocks[liveStockId]
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(8.dp))
        GenerateImage(
            imageId = liveStock.imageId, modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))
        GenerateName(name = liveStock.name)

        Spacer(modifier = Modifier.height(8.dp))
        GenerateDetail(detail = "Adopt this childhood livestock into your pet, make your dreams come true!")

        Spacer(modifier = Modifier.height(8.dp))
        GenerateButton()
    }
}
