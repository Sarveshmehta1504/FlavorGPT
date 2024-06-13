package com.example.flavorgpt.Screen

import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flavorgpt.R

@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            val coffeeDrinks = arrayOf(
                "Americano", "Cappuccino", "Espresso", "Latte", "Mocha"
            )
            var expanded by remember { mutableStateOf(false) }
            var selectedText by remember { mutableStateOf(coffeeDrinks[0]) }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp)
            ) {
                DropdownMenu(expanded = expanded, onDismissRequest = { /*TODO*/ }) {
                    
                }
            }
        },
        bottomBar = {

        }
    ){padding ->
        Surface (
            modifier = Modifier.padding(padding)
        ){
            Box(
                contentAlignment = Alignment.Center
            ){
                Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}