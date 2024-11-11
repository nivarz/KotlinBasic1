package com.example.firsttest.sintaxis

fun main(){

    val erik = Person("Erik","Nivar", EstadoCivil.Soltero)
    val kevin = Person("Kevin","Vladimir", EstadoCivil.Comprometido)
    val elian = Person("Elian","Martinez", EstadoCivil.Soltero)

    if (erik.estadoCivil == elian.estadoCivil){
        println("Tienen el mismo estado civil")
    }else{
        println("No tienen el mismo estado civil")
    }

}