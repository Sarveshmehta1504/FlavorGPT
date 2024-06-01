package com.example.flavorgpt.navigation

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Login: Screen(route = "login_Screen")
    object SignUp: Screen(route = "sign_up_Screen")

}