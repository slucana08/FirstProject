package com.kotlin.application.firstproject

fun main (args: Array<String>){
    factorial()
}

fun factorial(){
    println("Ingrese numero: ")
    var numero:Int = readLine()!!.toInt()
    var result = 1
    for (i in 1..numero){
        result *= i
    }
    println("El factorial de $numero es $result")
}

//fun main (args: Array<String>) {
//    println("Ingrese numero de 3 cifras: ")
//    val num : CharArray = readLine()!!.toString().toCharArray()
//    if (num.size != 3) println("Numero incorrecto")
//    else {
//        var a = num[0].toString().toInt()
//        var b = num[1].toString().toInt()
//        var c = num[2].toString().toInt()
//
//        if (a==b) printNumIgual(a,b,c)
//        else if(a==c) printNumIgual(a,c,b)
//        else if(b==c) printNumIgual(b,c,a)
//        else if(a>b && a>c) printNumMayor(a,b,c)
//        else if(b>a && b>c) printNumMayor(b,a,c)
//        else if(c>a && c>b) printNumMayor(c,a,b)
//        else println("$a$b$c")
//    }
//}
//
//fun printNumIgual (a:Int,b:Int,c:Int){
//    println("${if (b>c) "$a$b$c" else "$c$b$a"}")
//}
//
//fun printNumMayor (a:Int,b:Int,c:Int){
//    println("${if (b>c) "$a$b$c" else "$a$c$b"}")
//}



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
