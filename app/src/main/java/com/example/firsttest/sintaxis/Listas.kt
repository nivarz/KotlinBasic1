package com.example.firsttest.sintaxis

fun main() {

    var friends = listOf<String>("Jose", "Maria","Pedro")
    var ages = listOf<Int>(20, 25, 30)

    /*
    println(friends)
    println(friends[0])
    println(ages)
    println(ages[0])
    */

    //println(friends.first())
    //println(friends.last())
    //println(friends.size)

    //GET

    //println(friends[0])
    //println(friends.get(0))

    val newFriends = mutableListOf("Jose","Maria","Peter")

    newFriends.set(0, "Erik")

    println(newFriends[0])

    newFriends.add("Mariela") //Agrega un nuevo dato a la lista mutable
    println(newFriends)


}