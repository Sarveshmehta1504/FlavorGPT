package com.example.flavorgpt.Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreen(
    navController: NavController
){

}

@Preview(showSystemUi = true)
@Composable
fun LoginPreviewScreen(){
    LoginScreen(navController = rememberNavController())
}