package Revisao3

open class Servidor(var nome: String) {
    open fun Welcome(){
        println("Bem vindo: $nome")
    }
}

class Instituicao( nomes: String, var intituicao: String): Servidor(nomes){
    override fun Welcome() {
        super.Welcome()
        println("Sua Instituição: $intituicao")
    }

}

fun main() {
    val servidor1 = Instituicao("Joselino", "IFCE")
    servidor1.Welcome()

}