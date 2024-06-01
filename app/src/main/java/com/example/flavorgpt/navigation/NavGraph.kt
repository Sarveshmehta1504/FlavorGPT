package com.example.flavorgpt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.flavorgpt.Screen.HomeScreen
import com.example.flavorgpt.Screen.LoginScreen
import com.example.flavorgpt.Screen.SignUpScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = Screen.SignUp.route){
        composable(route = Screen.Home.route){
            HomeScreen()
        }
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screen.SignUp.route){
            SignUpScreen(navController)
        }
    }
}