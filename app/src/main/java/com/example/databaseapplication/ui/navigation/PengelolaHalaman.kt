package com.example.databaseapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController

private val Any.route: Any
    get() {
        TODO("Not yet implemented")
    }

@Composable
fun <NavHostController> PengelolaHalaman(
    modifier: Modifier = Modifier,
    navController: androidx.navigation.NavHostController = rememberNavController(),
    DestinasiHome: Any,
    DestinasiInsert: Any
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HomeView(
                navigateToInsert = { navController.navigate(DestinasiInsert.route) }
            )
        }
        composable(DestinasiInsert.route) {
            InsertView(
                navigateBack = { navController.popBackStack() }
            )
            }
        }
}

@Composable
fun InsertView(navigateBack: () -> Boolean) {
    TODO("Not yet implemented")
}

@Composable
fun HomeView(navigateToInsert: () -> Unit) {
    TODO("Not yet implemented")
}

fun composable(route: Any, function: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
