package com.claudiosoaresdev.mercadinhodigital.presentation.home.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.claudiosoaresdev.mercadinhodigital.shared.theme.MercadinhoDigitalTheme

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Bem-vindo ao Mercadinho Digital!")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    MercadinhoDigitalTheme {
        HomeScreen()
    }
}