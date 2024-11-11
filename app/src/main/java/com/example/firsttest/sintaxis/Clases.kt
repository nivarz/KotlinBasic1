package com.example.firsttest.sintaxis

fun main(){

    val erik = Usuario(
        "Erik",
        46,
        "nivarz@gmail.com",
        "dni123456"
    )

    val alia = Usuario(
        "Alia",
        11,
        "alia@gmail.com",
        "dni123456789"
    )

    val elian = Usuario(
        "Elian",
        4,
        "elian@gmail.com",
        "dni126789"
    )

    val kevin = Usuario(
        "Kevin",
        16,
        "kevin@gmail.com",
        "dni56789"
    )

    //Usando el metodo para agregar valores a objetos
    erik.addFriend(alia)
    erik.addFriend(kevin)
    alia.addFriend(kevin)
    alia.addFriend(erik)
    kevin.addFriend(elian)
    kevin.addFriend((erik))
    elian.addFriend(erik)
    elian.addFriend(alia)

    //Metodo para imprimir los valores agregados al objeto de la clase
    erik.getFriends()
    alia.getFriends()
    kevin.getFriends()
    elian.getFriends()

    println(erik.nombre)
    println(erik.edad)
    //println(erik.email)
    //println(erik.dni)

    erik.getEmail("admin")
    erik.getDni("admin")
}