package com.example.firsttest.sintaxis

fun main(){

    // Aqui inicia el programa

    val nombre = "Erik"
    val apellido = "Nivar"

    //saludarA(fullname) Otra Forma valida
    //despedirA(fullname) Otra Forma valida

    //saludarA(name = "Erik Nivar") Otra Forma valida
    //despedirA(name = "Erik Nivar") Otra Forma valida

    saludarA(lastname = apellido, name = nombre)
    despedirA(apellido, nombre)
}

