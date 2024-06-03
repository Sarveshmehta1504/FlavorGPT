package com.example.flavorgpt.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.flavorgpt.R
import com.example.flavorgpt.navigation.Screen
import com.example.flavorgpt.ui.theme.LightTransparentWhite
import com.example.flavorgpt.ui.theme.Primary

@OptIn(ExperimentalMaterial3Api::class)
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
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        textAlign = TextAlign.Start,
                        text = "Welcome to FlavorGPT",
                        style = TextStyle(
                            fontSize = 20.sp,
                        )
                    )
                    Text(
                        textAlign = TextAlign.Start,
                        text = "1/3",
                        style = TextStyle(
                            fontSize = 15.sp,
                        )
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    text = "Let's create your profile.",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(0xFF9E9E9E),
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Chat Display Name",
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Black,

                        )
                )
                Spacer(modifier = Modifier.height(5.dp))

                val name = remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    placeholder = {
                        Text(
                            style = TextStyle(
                                fontSize = 13.sp,
                            ),
                            text = "Your Name"
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = Primary,
                        focusedBorderColor = Primary,
                        focusedLabelColor = Primary,
                        containerColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Done
                    ),
                    singleLine = true,
                    maxLines = 1,
                    value = name.value,
                    onValueChange = {
                        if(name.value.length <= 100){
                            name.value = it
                        }
                    }
                )
                val count = name.value.count()
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 4.dp),
                    text = "${count}/100",

                )
                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .heightIn(30.dp),
                    onClick = {
                        navController.navigate(Screen.Home.route)
                    },
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)

                ) {
                    Text(
                        text = "Next",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 20.sp
                        ))
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