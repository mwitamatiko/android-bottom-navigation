package com.example.androidtest.navs.routes

sealed class NavRoutes(val route: String){
    object WELCOME: NavRoutes("welcome")
    object Home: NavRoutes("home")
    object Contacts: NavRoutes("contacts")
    object Favorites: NavRoutes("favorites")
    object BMICALC: NavRoutes("BMICalc")
    object CALCULATOR: NavRoutes("Calculator")
    object INTENTS: NavRoutes("Intents")
}


//const val ROUTE_HOME = "home"
//const val ROUTE_BMICALC = "BMICalc"
//const val ROUTE_CALCULATOR = "Calculator"
//const val ROUTE_INTENTS = "Intents"