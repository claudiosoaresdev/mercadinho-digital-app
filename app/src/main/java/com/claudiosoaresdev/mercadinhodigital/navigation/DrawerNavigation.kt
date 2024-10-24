package com.claudiosoaresdev.mercadinhodigital.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.CoroutineScope

import com.claudiosoaresdev.mercadinhodigital.presentation.home.ui.*
import com.claudiosoaresdev.mercadinhodigital.presentation.secondary.ui.*

@Composable
fun DrawerNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    scope: CoroutineScope,
    openDrawer: () -> Unit,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationRoutes.HOME,
    ) {
        composable(NavigationRoutes.HOME) {
            HomeScreen(
                navController = navController,
                scope = scope,
                openDrawer = openDrawer
            )
        }
        composable(NavigationRoutes.SECONDARY) {
            SecondaryScreen(
                navController = navController
            )
        }
    }
}