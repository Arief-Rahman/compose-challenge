package com.example.androiddevchallenge

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate

@Composable
fun Home(liveStocks: List<LiveStock>, navController: NavController) {
    LazyColumn(Modifier.fillMaxWidth()) {
        items(liveStocks) { liveStock ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .clickable { navController.navigate("detail/${liveStock.id}/") },
                verticalAlignment = Alignment.CenterVertically
            ) {

                Spacer(modifier = Modifier.width(8.dp))
                GenerateImage(
                    imageId = liveStock.imageId,
                    modifier = Modifier
                        .height(120.dp)
                        .width(120.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                )

                Spacer(modifier = Modifier.width(8.dp))
                GenerateName(name = liveStock.name)
            }
        }
    }
}
