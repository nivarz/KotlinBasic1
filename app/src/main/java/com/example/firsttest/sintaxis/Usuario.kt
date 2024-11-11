package com.example.firsttest.sintaxis

class Usuario(
     val nombre: String,
     val edad: Int,
     private val email: String,
     private val dni: String,
     private val friends: MutableList<Usuario> = mutableListOf() //Variable tipo lista modificable

) {
     //Metodo para imprimir las combinaciones de amigos
     fun getFriends(){
          println("Amigos de $nombre")
          friends.forEach{ friend -> println(friend.nombre)}
     }

     //Metodo para agregar amigos
     fun addFriend(friend: Usuario){
          friends.add(friend)
     }
     //Metodos de la clase (funciones) que van a estar dentro del
     //objeto de la clase

     //metodo que valida el rol del usuario para el email
     fun getEmail(role: String){
          if(role == "admin"){
               println(email)
          }
     }

     //Metodos de la clase (funciones) que van a estar dentro del
     //objeto de la clase

     //metodo que valida el rol del usuario para el dni
     fun getDni(role: String){
          if(role == "admin"){
               println(dni)
          }
     }

}