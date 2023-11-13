package com.example.androidtest.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtest.R

@Composable
fun Favorites(){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Favorites",
            tint = Color.Blue,
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.Center)
        )

    }
}

@Composable
fun BeautifulCard() {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 200.dp, height = 400.dp)
                .padding(50.dp)
                .clickable(
                    onClick = {
                        Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show()
                    }
                )
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_accessibility_new_24),
                    contentDescription = "person",
                    modifier = Modifier.size(80.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun FavoritesPreview(){
//    Favorites()
    BeautifulCard()
}
