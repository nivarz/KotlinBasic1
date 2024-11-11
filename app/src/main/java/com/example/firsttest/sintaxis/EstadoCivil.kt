package com.example.firsttest.sintaxis

sealed class EstadoCivil {
    object Soltero : EstadoCivil()
    object Comprometido : EstadoCivil()
    object Casado : EstadoCivil()
    object Divorciado :  EstadoCivil()

}