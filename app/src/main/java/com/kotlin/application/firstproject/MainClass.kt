package com.kotlin.application.firstproject

enum class TipoDocumentoEnum  {

    DNI(1),
    RUC(2),
    CE(3);

    var valor:Int? = null
    constructor (valor:Int) {
        this.valor = valor
    }
}

fun main(args: Array<String>) {
    var documento = TipoDocumentoEnum.DNI
    println(documento)
}



//class Archivo<T> {
//    var nombre: T? = null
//    var ruta: T? = null
//}
//
//fun main(args: Array<String>) {
//    var archivo1 = Archivo<String>()
//    archivo1.nombre = "Sting"
//    archivo1.ruta = "Oeste"
//}


//interface Alumno  {
//    fun guardarAlumno ()
//    fun eliminarAlumno ()
//    fun actualizarAlumno ()
//    fun buscarAlumno ()
//}
//
//class AlumnoImpl (nombre:String) : Alumno{
//    private var nombre = nombre
//    override fun guardarAlumno() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun eliminarAlumno() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun actualizarAlumno() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun buscarAlumno() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    fun getNombre (): String?{
//        return nombre
//    }
//}
//
//fun main(args: Array<String>) {
//    var alumno:Alumno = AlumnoImpl("Sting")
//}



//abstract class Persona {
//    var nonbre:String? = null
//
//    abstract fun correr ()
//    abstract fun saltar ()
//}
//
//class Hombre : Persona(){
//    override fun correr() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun saltar() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//}
//
//open class Auto() {
//    var tipo: String? = null
//    var maximaVelocidad : Int? = null
//    var numeroAsientos : Int? = null
//
//    constructor (tipo :String, maximaVelocidad: Int, numeroAsientos: Int):this(){
//        this.tipo = tipo
//        this.maximaVelocidad = maximaVelocidad
//        this.numeroAsientos = numeroAsientos
//        println ("Tipo: ${this.tipo}")
//        println ("Maxima velocidad: ${this.maximaVelocidad}")
//        println ("Numero de Asientos: ${this.numeroAsientos}")
//    }
//
//    open fun avanzar (){
//        this.maximaVelocidad = this.maximaVelocidad!! + 1
//        println("Se aumento velocidad a: ${this.maximaVelocidad}")
//    }
//
//}
//
//class Sedan : Auto {
//   constructor(tipo :String, maximaVelocidad: Int, numeroAsientos: Int, motor : String)
//           :super(tipo,maximaVelocidad,numeroAsientos){
//       println("El motor es: $motor")
//   }
//}
//
//fun main (args: Array<String>){
//    val auto = Sedan("Sedan",80,5,"Automático")
//    auto.avanzar()
//}

//fun factorial(){
//    println("Ingrese numero: ")
//    var numero:Int = readLine()!!.toString().toInt()
//    var result = 1
//    for (i in 1..numero){
//        result *= i
//    }
//    println("El factorial de $numero es ${result.toLong()}")
//}

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
