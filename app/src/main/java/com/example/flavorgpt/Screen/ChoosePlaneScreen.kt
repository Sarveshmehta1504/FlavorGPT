package com.example.flavorgpt.Screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.flavorgpt.navigation.Screen
import com.example.flavorgpt.ui.theme.LightTransparentWhite

@Composable
fun ChoosePlaneScreen(
    navController: NavController,
){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
        ) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
                    .verticalScroll(rememberScrollState()),
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
                        text = "Choose your plan",
                        style = TextStyle(
                            fontSize = 20.sp,
                        )
                    )
                    Text(
                        textAlign = TextAlign.Start,
                        text = "2/3",
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
                    text = "Pro plan gives unlimited access to over 20 AI models.",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(0xFF9E9E9E),
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    val options = listOf(
                        "Yearly",
                        "Monthly"
                    )
                    var selectedOption by remember {
                        mutableStateOf("")
                    }
                    val onSelectionChange = { text: String ->
                        selectedOption = text
                    }
                    var visible by remember { mutableStateOf(true) }

                    options.forEach{text ->
                        Row{
                            Box(
                                modifier = Modifier
                                    .padding(start = 3.dp, end = 7.dp)
                                    .size(70.dp, 40.dp)
                                    .clickable {
                                        onSelectionChange(text)
                                    }
                                    .clip(RoundedCornerShape(9.dp))
                                    .background(
                                        if (text == selectedOption) {
                                            LightTransparentWhite
                                        } else {
                                            Color.White
                                        }
                                    ),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    modifier = Modifier.padding(5.dp),
                                    text = text,
                                    style = TextStyle(
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.Center
                                    ),
                                )
                            }
                        }
                    }
                }

                VerticalDivider(
                    modifier = Modifier
                        .height(300.dp)
                        .heightIn(300.dp, 700.dp)
                        .align(Alignment.CenterHorizontally),
                    color = Color.LightGray,
                    thickness = 1.dp
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


                Spacer(modifier = Modifier.height(10.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ){
                    Row{
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
                                navController.navigate(Screen.Home.route)
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
                    }
                    Row{

                        Button(
                            modifier = Modifier
                                .size(77.dp, 33.dp)
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
                                navController.navigate(Screen.Home.route)
                            },
                            shape = RoundedCornerShape(7.dp),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)

                        ) {
                            Text(
                                text = "Skip",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                        Spacer(modifier = Modifier.width(5.dp))
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
}

@Preview(showSystemUi = true)
@Composable
fun ChoosePlanScreenPreview(){
    ChoosePlaneScreen(rememberNavController())
}