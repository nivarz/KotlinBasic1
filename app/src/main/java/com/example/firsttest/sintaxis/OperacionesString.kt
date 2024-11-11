package com.example.firsttest.sintaxis

fun main() {

    val name = "Erik"
    val lastName = "Nivar"

    //val fullName = name + " " + lastName ; Esta no es la forma correcta de sumar cadena no es lo recomendable

    val fullName = "$name $lastName es mi nombre" // Recomendable colocar el signo de dolar delante de la variable

    println(fullName)

}