package com.example.navigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationexample.model.Routes
import com.example.navigationexample.ui.theme.NavigationExampleTheme
import com.example.navigationexample.ui.theme.Screen1
import com.example.navigationexample.ui.theme.Screen2
import com.example.navigationexample.ui.theme.Screen3
import com.example.navigationexample.ui.theme.Screen4
import com.example.navigationexample.ui.theme.Screen5

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationExampleTheme {
                //Elemento que tiene el control de la paginas a las que vamos a acceder
                val navigationController = rememberNavController()

                NavHost(navController = navigationController,
                    startDestination = Routes.MainScreen.route) {
                    //Los llamas desde el fichero routes
                    composable(Routes.MainScreen.route) { Screen1(navigationController) }
                    composable(Routes.Pantalla2.route) { Screen2(navigationController) }
                    composable(Routes.Pantalla3.route) { Screen3(navigationController) }

                    composable(
                        Routes.PantallaConArgObligatorios.route,
                        arguments = listOf(navArgument("name") { type = NavType.StringType })
                    ) {
                        Screen4(
                            navigationController,
                            it.arguments?.getString("name").orEmpty()
                        )
                    }

                    composable(
                        Routes.PantallaFinal.route,
                        arguments = listOf(navArgument("age") { defaultValue = 25 })
                    ) {
                        Screen5(
                            navigationController,
                            it.arguments?.getInt("age")?:0
                        )
                    }


                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationExampleTheme {

    }
}