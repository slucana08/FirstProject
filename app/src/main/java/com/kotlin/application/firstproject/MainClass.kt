package com.kotlin.application.firstproject

fun main (args: Array<String>) {
    println("Ingrese numero de 3 cifras: ")
    val num : CharArray = readLine()!!.toString().toCharArray()
    if (num.size != 3) println("Numero incorrecto")
    else {
        val organizado = num.sortedDescending()
        for (i in 0..organizado.size - 1) {
            print(organizado[i])
        }
    }
}


//fun main (args : Array<String>) {
//    var contador = 0
//    for (x in 1..10){
//        contador = 0
//        for (y in 1..x){
//            if (x%y != 0) continue
//            contador++
//        }
//        if (contador == 2)
//            println("$x es primo")
//    }
//}
