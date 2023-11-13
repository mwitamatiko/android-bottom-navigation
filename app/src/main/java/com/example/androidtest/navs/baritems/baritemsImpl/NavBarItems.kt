package com.example.androidtest.navs.baritems.baritemsImpl

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import com.example.androidtest.R
import com.example.androidtest.navs.baritems.BarItem
import com.example.androidtest.navs.routes.NavRoutes

object NavBarItems {
    val BarItems = listOf(
        BarItem(
            title = "Home",
            image = R.drawable.baseline_home_24,
            route = NavRoutes.Home.route
        ),
        BarItem(
            title = "Calculator",
            image = R.drawable.baseline_calculate_24,
            route = NavRoutes.CALCULATOR.route
        ),
        BarItem(
            title = "Intents",
            image = R.drawable.baseline_contact_page_24,
            route = NavRoutes.INTENTS.route
        ),
        BarItem(
            title = "BMI",
            image = R.drawable.baseline_accessibility_new_24,
            route = NavRoutes.BMICALC.route
        )
    )
}