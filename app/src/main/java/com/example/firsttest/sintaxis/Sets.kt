package com.example.firsttest.sintaxis

fun main(){

    val ListOfPokemons = mutableListOf<String>("Pikachu","Charmander","Squirtle")
    ListOfPokemons.add("Balbasaur")
    ListOfPokemons.add("Mew")
    ListOfPokemons.add("Pikachu")

    println("Lista de Pokemons")
    println(ListOfPokemons)

    val setOfPokemons = mutableSetOf<String>("Pikachu","Charmander","Squirtle")
    setOfPokemons.add("Balbasaur")
    setOfPokemons.add("Mew")
    setOfPokemons.add("Pikachu")

    println("Set de Pokemons")
    println(setOfPokemons)
    //println(setOfPokemons[0]) Error, el set contiene valores NO ordenados o indexables

}