package com.example.androidtest.navs

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.androidtest.R
import com.example.androidtest.navs.baritems.baritemsImpl.NavBarItems
import com.example.androidtest.navs.routes.NavRoutes
import com.example.androidtest.ui.theme.screens.Contacts
import com.example.androidtest.ui.theme.screens.Favorites
import com.example.androidtest.ui.theme.screens.Home
import com.example.catapp.ui.theme.screens.bmicalc.BMIcalcScreen
import com.example.catapp.ui.theme.screens.calculator.CalculatorScreen
import com.example.catapp.ui.theme.screens.home.HomeScreen
import com.example.catapp.ui.theme.screens.intents.IntentsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    val navController = rememberNavController()

    val  context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "Bottom Navigation Demo")
                },
                colors = TopAppBarDefaults
                    .smallTopAppBarColors(
                        containerColor = Color.Magenta,
                        titleContentColor = Color.White
                    ),
//                navigationIcon = {
//                    Icon(
//                        painter = painterResource(id = R.drawable.baseline_share_24),
//                        contentDescription = null,
//                        Modifier.clickable {
//                            Toast.makeText(context,"works fine",Toast.LENGTH_SHORT).show()
//                        }
//
//                    )
//
//                }


            )
        },
        content = { padding -> 
        
            Column(Modifier.padding(padding)) {
                NavigationHost(navController = navController)
            }    

        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    )
}

@Composable
fun NavigationHost(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = NavRoutes.WELCOME.route
    ){
        composable(NavRoutes.WELCOME.route){
            Home(navController=navController)
        }

        composable(NavRoutes.Home.route){
            navController.navigate(NavRoutes.WELCOME.route){
                popUpTo(NavRoutes.WELCOME.route){
                    inclusive=true
                }
            }
        }
        composable(NavRoutes.CALCULATOR.route){
            CalculatorScreen()
        }
        composable(NavRoutes.INTENTS.route){
            IntentsScreen()
        }
        composable(NavRoutes.BMICALC.route){
            BMIcalcScreen()
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController){
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoutes = backStackEntry?.destination?.route

    NavigationBar {
        NavBarItems.BarItems.forEach { navItem ->

            NavigationBarItem(
                selected = currentRoutes == navItem.route,
                onClick = {
                    navController.navigate(navItem.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState=true
                        }
                        launchSingleTop=true
                        restoreState=true
                    }
                },
                icon = {
                    // Convert the resource ID to an ImageVector
                    val imageVector = ImageVector.vectorResource(id = navItem.image)
                    Icon(
                        imageVector = imageVector,
                        contentDescription = navItem.title,
                        modifier = Modifier
                            .size(30.dp)
                    )
                },
                label = {
                    Text(text = navItem.title, fontSize = 18.sp)
                }
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}