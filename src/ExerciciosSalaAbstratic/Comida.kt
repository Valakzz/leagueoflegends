package ExerciciosPooNovos

import javax.xml.namespace.QName

abstract class Comida(name: String) {

    abstract fun preparar()
}
class Pizza(val nome: String): Comida(nome){
    override fun preparar() {
        println("faz a massa com borda, coloca o recheio depois come")
    }
}
class Sushi(val name: String): Comida(name){
    override fun preparar() {
        println("Cortando seu sushi e colocando molho soyo depois come")
    }
}

fun main() {
    val p1 = Pizza("Calabresa")
    p1.preparar()
     val p2 = Sushi("Sushi com molho Soyo")


}