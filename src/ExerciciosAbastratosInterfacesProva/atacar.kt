package ExerciciosAbastratosInterfacesProva

import java.security.Principal


interface AtaqueMistico{
    fun AtaqueMistico()
}
interface AtaqueFisicos{
    fun ataqueFisico()
}


abstract class boss(nome: String, vida: Int){


    fun mover() = println("Boss se movendo")

}

class Freya(nome: String, vida: Int): boss(nome, vida), AtaqueMistico{
    override fun AtaqueMistico() {
        println("Chuva de laminas")
    }

}
class MaeMiranda(nome: String, vida: Int): boss(nome,vida), AtaqueFisicos{
    override fun ataqueFisico() {
        println("Jogando leon na parede")
    }
}

fun main() {
    val boss1 = MaeMiranda("Mãe Miranda", 500)
    boss1.ataqueFisico()
    boss1.mover()
    println("================")
    val boss2 = Freya("Freya", 500)
    boss2.AtaqueMistico()
    boss2.mover()

}