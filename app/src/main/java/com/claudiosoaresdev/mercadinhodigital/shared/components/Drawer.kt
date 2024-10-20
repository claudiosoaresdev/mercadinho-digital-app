package com.claudiosoaresdev.mercadinhodigital.shared.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.claudiosoaresdev.mercadinhodigital.navigation.NavigationRoutes

@Composable
fun Drawer(
    navController: NavController,
) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(280.dp)
            .background(MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            DrawerItem(
                text = "Home",
                onClick = {
                    navController.navigate(NavigationRoutes.HOME)
                }
            )
        }
    }
}
