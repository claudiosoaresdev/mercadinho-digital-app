package com.claudiosoaresdev.mercadinhodigital.presentation.secondary.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

import com.claudiosoaresdev.mercadinhodigital.shared.components.TopBar

@Composable
fun SecondaryScreen(
    navController: NavController?,
) {
    val goBack: () -> Unit = {
        navController?.popBackStack()
    }

    Scaffold(
        topBar = {
            TopBar(
                title = "Secondary Screen",
                navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onNavigationClick = goBack
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Text("This is the Secondary Screen")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SecondaryScreen(
        navController = null
    )
}