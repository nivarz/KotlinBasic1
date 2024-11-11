package com.example.firsttest.sintaxis

fun main(){

        val friends = listOf("Alia","Elian","Kevin")

        // Esto es un funcion LAMBDA, Si al parametro que es lo que esta despues de la llave
        // no se le asigna un nombre por defecto el coloca "it : String"
    /*
        friends.forEach{
            println(it)
        }

        // Otra forma de funcion LAMBDA en este caso el nombre del parametro es "name ->"
        // Lo que esta entre llaves vienen siendo la funcion
        friends.forEach{name ->
            println(name)
         }
    */
    //Esta funcion lo primero que pide es el nombre en este caso, despues
    mylambda("Erik", "Vladimir") {fullname ->
        println("Hola $fullname")
    }

}
// La funcion lambda es la siguiente:  saludar: (fullname: String) -> Unit
fun mylambda( name:String, secondname:String, saludar: (fullname: String) -> Unit){

    println("Estoy entrando a la funcion lambda")
    saludar("$name $secondname Nivar") // Esto es una funcion
    println("Estoy saliendo de la funcion lambda")




}