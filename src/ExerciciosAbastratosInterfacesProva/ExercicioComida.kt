package ExerciciosAbastratosInterfacesProva

abstract class Comida( nomeComida: String){

    abstract fun preparar()
    abstract fun comidaPronta()
}

//interface cozinhando{
//
//    fun comidaPronta()
//}

class pizza(val nome: String): Comida(nome){

    override fun preparar() = println("Preparando Sua pizza de ${nome}")

   override fun comidaPronta()  = println("Comida pronta $nome")


}

class sushi(val nome: String): Comida(nome){




    override fun comidaPronta() {
        println("Sua $nome está pronto")
    }
    override fun preparar() = println("Preparando seu ${nome}")


}

fun main() {
    var pedidod1: Comida = pizza("Calabresa")
    pedidod1.preparar()
    pedidod1.comidaPronta()
    pedidod1 = sushi("Atum")
    pedidod1.preparar()
    pedidod1.comidaPronta()
}


