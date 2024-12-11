package com.example.navigationexample.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationexample.model.Routes.*

@Composable
fun Screen1(navigationController: NavHostController){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Screen1")
        Box(modifier=Modifier
            .size(100.dp)
            .background(Color.Red))
        Button(onClick = {navigationController.navigate(Pantalla2.route)}) {
            Text(text = "Ir a Screen2")
        }
        Button(onClick = {navigationController.navigateUp()}) {
            Text(text = "Volver")
        }
    }
}
@Composable
fun Screen2(navigationController: NavHostController){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Screen2")
        Box(modifier=Modifier
            .size(100.dp)
            .background(Color.Blue))
        Button(onClick = {navigationController.navigate(Pantalla3.route)}) {
            Text(text = "Ir a Screen3")
        }
        Button(onClick = {navigationController.navigateUp()}) {
            Text(text = "Volver")
        }
    }
}
@Composable
fun Screen3(navigationController: NavHostController){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Screen3")
        Box(modifier=Modifier
            .size(100.dp)
            .background(Color.Green))
        Button(onClick = {navigationController.navigate(PantallaConArgObligatorios.createRoute("Hola"))}) {
            Text(text = "Ir a Screen4")
        }
        Button(onClick = {navigationController.navigateUp()}) {
            Text(text = "Volver")
        }
    }
}
@Composable
fun Screen4(navigationController: NavHostController, name: String){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Nombre = $name")
        Box(modifier=Modifier
            .size(100.dp)
            .background(Color.Black))
        Button(onClick = {navigationController.navigate(PantallaFinal.createRoute(38))}) {
            Text(text = "Ir a Screen5")
        }
        Button(onClick = {navigationController.navigateUp()}) {
            Text(text = "Volver")
        }
    }
}

@Composable
fun Screen5(navigationController: NavHostController, age: Int){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Edad = $age")
        Box(modifier=Modifier
            .size(100.dp)
            .background(Color.Magenta))
        Button(onClick = {navigationController.navigate(Pantalla3.route)}) {
            Text(text = "Ir a Screen3")
        }
        Button(onClick = {navigationController.navigateUp()}) {
            Text(text = "Volver")
        }
    }
}