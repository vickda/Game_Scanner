package com.example.gamescanner.presentation.SingleComposableComponents.greenButtonMedium.headerScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.gamescanner.R

@Composable
fun HeaderScreen(onCloseButtonClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxHeight(0.08f)
            .fillMaxWidth()
            .clickable { onCloseButtonClick() },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Head with Logo & Close button
        Image(
            painter = painterResource(id = R.drawable.only_logo),
            contentDescription = "S34T Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth(0.39f)
        )
    }
}
