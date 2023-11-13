package com.example.androidtest.ui.theme.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androidtest.R
import com.example.androidtest.navs.routes.NavRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Text(
            text = "Welcome to the Home Page",
            fontSize = 40.sp ,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card (
                    modifier = Modifier
                        .width(165.dp)
                        .height(200.dp)
                    ,
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Magenta
                    ),
                    onClick = {
                        navController.navigate(NavRoutes.CALCULATOR.route)

                    }

                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Icon(
                                painter = painterResource(id = R.drawable.baseline_calculate_24),
                                contentDescription = "My icon",
                                tint = Color.White,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .background(Color.White)
                                .fillMaxWidth()
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Button(onClick = {
                                navController.navigate(NavRoutes.CALCULATOR.route)

                            }, shape = CutCornerShape(10),
                                border = BorderStroke(1.dp, Color.Magenta),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                                Text(text = "Calculator",
                                    color = Color.Black,
                                    fontFamily = FontFamily.Monospace)
                            }
                        }
                    }

                }
                Card (
                    modifier = Modifier
                        .width(165.dp)
                        .height(200.dp)
                    ,
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Blue
                    ),
                    onClick = {
                        navController.navigate(NavRoutes.INTENTS.route)
                    }


                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Icon(
                                painter = painterResource(id = R.drawable.baseline_contact_page_24),
                                contentDescription = "My icon",
                                tint = Color.White,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .background(Color.White)
                                .fillMaxWidth()
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = "Intents",
                                color = Color.Black,
                                fontFamily = FontFamily.Monospace)
                            Button(onClick = {
                                navController.navigate(NavRoutes.INTENTS.route)
                            }, shape = CutCornerShape(10),
                                border = BorderStroke(1.dp, Color.Blue),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                                Text(text = "Intents",
                                    color = Color.Black,
                                    fontFamily = FontFamily.Monospace)
                            }
                        }
                    }

                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card (
                    modifier = Modifier
                        .width(165.dp)
                        .height(200.dp)
                    ,
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Cyan
                    ),
                    onClick = {
                        navController.navigate(NavRoutes.BMICALC.route)
                    }


                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Icon(
                                painter = painterResource(id = R.drawable.baseline_accessibility_new_24),
                                contentDescription = "My icon",
                                tint = Color.White,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .background(Color.White)
                                .fillMaxWidth()
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Button(onClick = {
                                navController.navigate(NavRoutes.BMICALC.route)
                            }, shape = CutCornerShape(10),
                                border = BorderStroke(1.dp, Color.Cyan),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                                Text(text = "BMI Calculator",
                                    color = Color.Black,
                                    fontFamily = FontFamily.Monospace)
                            }
                        }
                    }

                }


            }


        }

    }
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Home,
//            contentDescription = "Home",
//            tint = Color.Blue,
//            modifier = Modifier
//                .size(150.dp)
//                .align(Alignment.Center)
//        )
//
//    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home(rememberNavController())
}