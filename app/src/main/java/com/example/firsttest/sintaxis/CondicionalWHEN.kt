package com.example.firsttest.sintaxis

fun main(){

    val name = "Erik Nivar"
    val role = "admin"
    val age = 46

    when {
        age > 60 -> println("$name es un anciano") // " -> " quiere decir que se va a ejecutar lo que esta a la derecha
        age > 30 -> println("$name es un adulto")
        age > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when(role){
        "admin" -> println("Acceso total")
        "user" -> println("Acceso limitado")
        else -> println("Acceso denegado")
    }

}