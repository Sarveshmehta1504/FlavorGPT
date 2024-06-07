package com.example.flavorgpt.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun FinishScreen(
    navController: NavController
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentSize(Alignment.Center)
                .padding(horizontal = 30.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
            ){
                Spacer(modifier = Modifier.height(10.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        textAlign = TextAlign.Start,
                        text = "Setup Complete",
                        style = TextStyle(
                            fontSize = 20.sp,
                        )
                    )
                    Text(
                        textAlign = TextAlign.Start,
                        text = "3/3",
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
                    text = "You are all set up!",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(0xFF9E9E9E),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp
                    ),
                    text = "Welcome to FlavorGTP, name! "
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp
                    ),
                    text = "Click next to start chatting."
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ){

                        Button(
                            modifier = Modifier
                                .size(81.dp, 33.dp)
                                .heightIn(34.dp)
                                .widthIn(80.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(RoundedCornerShape(8.dp))
                            ,
                            onClick = {
                                navController.navigate(Screen.ChoosePlan.route)
                            },
                            shape = RoundedCornerShape(7.dp),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)

                        ) {
                            Text(
                                text = "Back",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }
                    Button(
                            modifier = Modifier
                                .size(80.dp, 34.dp)
                                .heightIn(34.dp)
                                .widthIn(80.dp),
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
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Center
                                ))
                        }

                }
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun FinishScreenPreview(){
    FinishScreen(rememberNavController())
}