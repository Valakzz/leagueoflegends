package Revisao3

open class Robozinho(var nome: String?) {

    open fun falarAlgo() = println("Oi eu sou o robozinho: ${nome}")
}

class RoboAlerta(nome: String, var bateria: Int): Robozinho(nome){
    override fun falarAlgo() {
        super.falarAlgo()
        println("E minha bateria está em $bateria%")
    }
}

fun main() {

    var robo1 = Robozinho("M3gan")
    robo1.falarAlgo()
    robo1 = RoboAlerta("M3gan 3.0", 59)
    robo1.falarAlgo()
}




