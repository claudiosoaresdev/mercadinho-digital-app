package com.claudiosoaresdev.mercadinhodigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.claudiosoaresdev.mercadinhodigital.navigation.DrawerNavigation
import com.claudiosoaresdev.mercadinhodigital.shared.components.DrawerContent
import com.claudiosoaresdev.mercadinhodigital.shared.components.TopBar
import com.claudiosoaresdev.mercadinhodigital.shared.theme.MercadinhoDigitalTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MercadinhoDigitalApp()
        }
    }
}

@Composable
fun MercadinhoDigitalApp () {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val onMenuClick: () -> Unit = {
        scope.launch { drawerState.open() }
    }

    MercadinhoDigitalTheme {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                DrawerContent(
                    navController = navController
                ) {
                    scope.launch {
                        drawerState.close()
                    }
                }
            }
        ) {
            Scaffold(
                topBar = {
                    TopBar(
                        title = "Mercadinho Digital",
                        navigationIcon = Icons.Filled.Menu,
                        onNavigationClick = onMenuClick
                    )
                },
                content = { paddingValues ->
                    Box(modifier = Modifier.padding(paddingValues)) {
                        DrawerNavigation(navController = navController)
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview () {
    MercadinhoDigitalApp()
}