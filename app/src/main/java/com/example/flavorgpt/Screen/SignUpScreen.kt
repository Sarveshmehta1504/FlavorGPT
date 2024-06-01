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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.flavorgpt.R
import com.example.flavorgpt.navigation.Screen
import com.example.flavorgpt.ui.theme.GrayColor
import com.example.flavorgpt.ui.theme.LightTransparentWhite
import com.example.flavorgpt.ui.theme.Primary
import com.example.flavorgpt.ui.theme.Purple80
import com.example.flavorgpt.ui.theme.TextColor

@Composable
fun SignUpScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = LightTransparentWhite
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
                    .align(Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterHorizontally),
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo"
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier.wrapContentHeight(Alignment.CenterVertically),
                    textAlign = TextAlign.Center,
                    text = "FlavorGPT",
                    style = TextStyle(
                        fontSize = 35.sp,
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(labelValue: String) {
    val textValue = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        placeholder = {
            Text(text = labelValue)
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
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        }
    )
}

@Composable
fun GoogleButton(value: String, navController: NavController) {
    Button(
        onClick = {
            navController.navigate(Screen.Home.route)
        },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(30.dp)
            .padding(top = 7.dp, bottom = 7.dp),
        colors = ButtonDefaults.buttonColors(Purple80),
        shape = RoundedCornerShape(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(30.dp),
            contentAlignment = Alignment.Center
        ) {
            Row {
                Image(
                    modifier = Modifier
                        .heightIn(23.dp)
                        .widthIn(23.dp),
                    painter = painterResource(id = R.drawable.devicon_google),
                    contentDescription = "image description",
                    contentScale = ContentScale.None
                )
                Text(
                    modifier = Modifier
                        .widthIn(175.dp)
                        .padding(start = 6.dp, top = 2.dp),
                    text = value,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF040404),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }

    }
}

@Composable
fun DividerTextComponent(value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            thickness = 1.dp,
            color = GrayColor
        )
        Text(
            modifier = Modifier.padding(8.dp),
            text = value,
            fontSize = 14.sp,
            color = TextColor
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            thickness = 1.dp,
            color = GrayColor
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen(rememberNavController())
}
