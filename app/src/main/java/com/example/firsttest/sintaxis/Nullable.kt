package com.example.firsttest.sintaxis

fun main(){

    var name = "Erik"
    var curso: String? = null

    curso = "Kotlin"

    if (curso == null){
        println("$name no esta estudiando")
    }else {
        println("$name esta estudiando $curso")
    }

    var num1: Int? = null

    var result= num1!! + 5

    println(result)
}
