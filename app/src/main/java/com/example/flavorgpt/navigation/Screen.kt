package com.example.flavorgpt.navigation

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Login: Screen(route = "login_Screen")
    object SignUp: Screen(route = "sign_up_Screen")
    object Welcome: Screen(route = "welcome_screen")
    object ChoosePlan: Screen(route = "choose_plane_screen")
    object Finish: Screen(route = "finish_screen")
}