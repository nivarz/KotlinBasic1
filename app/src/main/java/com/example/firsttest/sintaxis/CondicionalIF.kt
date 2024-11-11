package com.example.firsttest.sintaxis

fun main(){

    val name = "Erik Nivar"
    val role = "guest"
    val age = 16

    if (age > 18) {
            println("$name es mayor de edad")
    }  else if (age > 30){
            println("$name es un adulto")
    }   else if (age > 18){
            println("$name es un adulto joven")
    }   else {
            println("$name es un menor de edad")
    }


    if  (role == "user"){
        println("Tienes acceso a tu perfil")
    }

    if (role == "admin"){
        println("Tienes acceso a todos los contenidos")
    }

    if (role == "guest"){
        println("Solo es un invitado")
    }


}