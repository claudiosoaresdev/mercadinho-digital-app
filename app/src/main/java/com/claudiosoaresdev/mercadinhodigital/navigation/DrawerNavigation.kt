package com.claudiosoaresdev.mercadinhodigital.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.claudiosoaresdev.mercadinhodigital.presentation.home.ui.*

@Composable
fun DrawerNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.HOME
    ) {
        composable(NavigationRoutes.HOME) { HomeScreen() }
    }
}