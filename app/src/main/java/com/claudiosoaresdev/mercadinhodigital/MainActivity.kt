package com.claudiosoaresdev.mercadinhodigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

import com.claudiosoaresdev.mercadinhodigital.navigation.DrawerNavigation
import com.claudiosoaresdev.mercadinhodigital.shared.components.DrawerContent
import com.claudiosoaresdev.mercadinhodigital.shared.theme.MercadinhoDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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

    val openDrawer: () -> Unit = {
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
            DrawerNavigation(
                navController = navController,
                scope = scope,
                openDrawer = openDrawer
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview () {
    MercadinhoDigitalApp()
}