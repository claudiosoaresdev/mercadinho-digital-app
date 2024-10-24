package com.claudiosoaresdev.mercadinhodigital.presentation.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

import com.claudiosoaresdev.mercadinhodigital.shared.components.TopBar

@Composable
fun HomeScreen(
    navController: NavController?,
    scope: CoroutineScope?,
    openDrawer: () -> Unit
) {
    val onMenuClick: () -> Unit = {
        scope?.launch { openDrawer() }
    }

    Scaffold (
        topBar = {
            TopBar(
                title = "Home",
                navigationIcon = Icons.Filled.Menu,
                onNavigationClick = onMenuClick
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center,
            ) {
                Button(onClick = {
                    navController?.navigate("secondary")
                }) {
                    Text("Go to Secondary Screen")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = null,
        scope = null,
        openDrawer = {}
    )
}

