package com.claudiosoaresdev.mercadinhodigital.shared.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.claudiosoaresdev.mercadinhodigital.navigation.NavigationRoutes

@Composable
fun DrawerContent(
    navController: NavController?,
    closeDrawer: () -> Unit
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
                label = "Home",
                icon = Icons.Default.Home,
                onClick = {
                    navController?.navigate(NavigationRoutes.HOME)
                    closeDrawer()
                }
            )
            DrawerItem(
                label = "Secondary Screen",
                icon = Icons.Default.Favorite,
                onClick = {
                    navController?.navigate(NavigationRoutes.SECONDARY)
                    closeDrawer()
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DrawerContentPreview () {
    DrawerContent(
        navController = null,
        closeDrawer = {}
    )
}