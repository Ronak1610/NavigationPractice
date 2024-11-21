package com.example.navpratcoce.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navpratcoce.Screens.HOmeScreen
import com.example.navpratcoce.Screens.HUI
import com.example.navpratcoce.Screens.ProfileScreen
import com.example.navpratcoce.Screens.SearchScreen

@Composable
fun Controller ()
{
    val navController = rememberNavController()
  NavGraph(navController)

}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Route.HOme.route)
    {      addHomeScreen(navController,this)
           addProfileScreen(navController,this)
           addLoginScreen(navController,this)
           addSearchScreen(navController,this)
    }

}







fun addHomeScreen(navController: NavHostController,navGraphBuilder: NavGraphBuilder)
{
    navGraphBuilder.composable(Route.HOme.route)
    {
        HOmeScreen(
            navigateToProfile = { navController.navigate(Route.Profile.route) },
            navigateToLogin = { navController.navigate(Route.Login.route) },
            navigateToSearch = { navController.navigate(Route.Search.route) }
        )

    }
}

fun addProfileScreen(navController: NavHostController,navGraphBuilder: NavGraphBuilder)
{
    navGraphBuilder.composable(Route.Profile.route)
    {
        ProfileScreen( navigateToProfile = {navController.navigate(Route.Login.route)},popBackStack = {navController.popBackStack()})
    }
}
fun addLoginScreen(navController: NavHostController,navGraphBuilder: NavGraphBuilder)
{
    navGraphBuilder.composable(Route.Login.route)
    {
        HUI(navigateToSearch = {navController.navigate(Route.Search.route)},   popBackStack = {navController.popBackStack()})
    }
}
fun addSearchScreen(navController: NavHostController,navGraphBuilder: NavGraphBuilder)
{
    navGraphBuilder.composable(Route.Search.route)
    {
        SearchScreen(navigateToHome = {navController.navigate(Route.HOme.route)}, popBackStack = {navController.popBackStack()})
    }
}