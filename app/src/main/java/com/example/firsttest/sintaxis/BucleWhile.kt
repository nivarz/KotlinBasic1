package com.example.firsttest.sintaxis

fun main(){

    var listOfFriends = listOf("Niuverys","Erick","Celina","Alia","Kevin","Elian")
    var index = 0

    while ( index < listOfFriends.size ){
        println(listOfFriends[index])
        //index = index + 1
        index += 1
        //index++
    }
}