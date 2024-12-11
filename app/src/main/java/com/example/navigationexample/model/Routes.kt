package com.example.navigationexample.model

sealed class Routes(val route:String){
    //Declaras las pantallas dentro del fichero
    object MainScreen:Routes("Screen1")
    object Pantalla2:Routes("Screen2")
    object Pantalla3:Routes("Screen3")
    object PantallaConArgObligatorios:Routes("Screen4/{name}") {
        fun createRoute(name:String) = "screen4/$name"
    }
    object PantallaFinal:Routes("PantallaFinal?name={name}"){
        fun createRoute(age:Int)="PantallaFinal?age=$age"
    }
}