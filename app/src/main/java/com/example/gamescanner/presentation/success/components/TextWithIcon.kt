package com.example.gamescanner.presentation.success.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TextWithIcon (icon:Int, iconDesc:String, text:String, fontFamily: FontFamily) {

    Row (
    ){
        Icon(painter = painterResource(id = icon),
            contentDescription = iconDesc)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal)
    }

}