package com.example.catapp.ui.theme.screens.bmicalc

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BMIcalcScreen(){


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(15.dp)
        ){
            Text(text = "BMI Calculator",
                fontSize = 40.sp ,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                color = Color.Magenta,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center)
            FontWeight.Bold
        }

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var firstNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = firstNumber, onValueChange = {firstNumber = it},
                label = { Text(text = "Enter your weight(kg)",fontSize = 20.sp)},
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 30.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            var secondNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = secondNumber, onValueChange = {secondNumber = it},
                label = { Text(text = "Enter your height(m)",fontSize = 20.sp)},
                modifier = Modifier.fillMaxWidth(0.9f),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            var result by remember {
                mutableStateOf("0")
            }
            Button(onClick = {
                val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                val num2 = secondNumber.toDoubleOrNull() ?: 1.0

                if (num2 != 0.0) {
                    val resultValue = (num1 / (num2 * num2))
                    result = "%.2f".format(resultValue)
                } else {
                    result = "Cannot divide by zero"
                }
            },
                border = BorderStroke(1.dp, Color.Magenta),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Text(text = "CALCULATE BMI", color = Color.Black,fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "result: $result",fontSize = 20.sp)
            if (result<= 19.toString() ){
                Text(text = "You are underweight",fontSize = 20.sp)
            }else if (result<= 25.toString()){
                Text(text = "You are normal weight",fontSize = 20.sp)
            }else if (result<= (25..30).toString()) {
                Text(text = "You are overweight",fontSize = 20.sp)
            } else if (result<= (30..40).toString()) {
                Text(text = "You are obese",fontSize = 20.sp)
            } else{
                Text(text = "Try Again",fontSize = 20.sp)
            }



        }
    }

}
@Preview(showBackground = true)
@Composable
fun BMIcalcScreenPreview(){

        BMIcalcScreen()

}