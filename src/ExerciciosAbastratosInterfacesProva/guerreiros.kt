package ExerciciosAbastratosInterfacesProva

interface Atacar{
    fun atacar()
}
interface Defesar{
    fun defender()
}

abstract class Personagem(nome: String,){
    abstract fun status()
}

class Guerreiro(val nome: String): Personagem(nome), Atacar{
    override fun atacar() {
        println("Ataque fisico")

    }

    override fun status() {
      println("Guerreiro $nome Invocado")
    }
}

class Mago(val nome: String): Personagem(nome), Atacar{
    override fun atacar() {
        println("Ataque Magico")

    }

    override fun status() {

        println("Mago $nome invocado")
    }
}

fun main() {
    val g1 = Guerreiro("Darius")
    g1.status()
    g1.atacar()
}