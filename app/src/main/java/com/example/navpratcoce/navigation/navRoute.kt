package com.example.navpratcoce.navigation

sealed class Route (val route:String) {
    object HOme : Route("HOme")
    object Profile : Route("Profile")
    object Login : Route("Login")
    object Search : Route("Search")





    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }

    }
    fun withArgsFormat(vararg args: String): String
    {
        return buildString {
            append(route)
            args.forEach {
                arg ->
                append("/$arg")
            }
        }
    }
}