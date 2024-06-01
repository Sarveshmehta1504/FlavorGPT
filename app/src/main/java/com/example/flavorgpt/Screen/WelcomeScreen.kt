package com.example.flavorgpt.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.flavorgpt.R
import com.example.flavorgpt.navigation.Screen
import com.example.flavorgpt.ui.theme.LightTransparentWhite

@Composable
fun WelcomeScreen(
    navController: NavController
){
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = LightTransparentWhite
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            modifier = Modifier.padding(horizontal = 30.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
                    textAlign = TextAlign.Start,
                    text = "Welcome to FlavorGPT",
                    style = TextStyle(
                        fontSize = 20.sp,
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    textAlign = TextAlign.Center,
                    text = "More than 30 AI models in one place.\n" +
                            "Featuring GPT-4o, Claude 3, Gemini Pro, and LLaMa 3.",
                    style = TextStyle(
                        fontSize = 13.sp
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                GoogleButton(value = "Continue with Google", navController)
                Spacer(modifier = Modifier.height(20.dp))
                DividerTextComponent(value = "Or")
                Spacer(modifier = Modifier.height(20.dp))
                MyTextField(labelValue = "sama@openai.com")
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .heightIn(30.dp)
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    onClick = {
                        navController.navigate(Screen.Home.route)
                    },
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)

                ) {
                    Icon(
                        tint = Color.Black,
                        imageVector = Icons.Outlined.Email,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(text = "Continue with email", style = TextStyle(color = Color.Black))
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreenPreview(){
    WelcomeScreen(rememberNavController())
}