package com.claudiosoaresdev.mercadinhodigital.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.claudiosoaresdev.mercadinhodigital.presentation.home.ui.*

@Composable
fun DrawerNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.HOME,
        modifier = modifier
    ) {
        composable(NavigationRoutes.HOME) { HomeScreen() }
    }
}