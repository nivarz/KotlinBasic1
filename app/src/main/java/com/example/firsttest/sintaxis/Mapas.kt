package com.example.firsttest.sintaxis

fun main(){

    val mapOfPokemos = mutableMapOf("Pikachu" to "electric", "Charmander" to "fire")

    println(mapOfPokemos["Pikachu"])

    mapOfPokemos.put("squirtle", "water") //Esta es una forma de agregar un valor
    mapOfPokemos["Mew"] = "psychic" //Esta es otra forma de agregar un valor

    println(mapOfPokemos)
}