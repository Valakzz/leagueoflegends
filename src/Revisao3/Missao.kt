package Revisao3

open class Missao {
    open fun executar() = println()
}

class missaocoleta: Missao(){
    override fun executar() {
        println("Coletou 10 ervas Magicas")

    }
}
    class missaoDerrotaChefe: Missao(){
        override fun executar() {
            println("Derrotou o chefe da caverna")
        }
    }
    class MissaoEntrefa: Missao(){
        override fun executar() {
            println("levou a carta até o castelo")
        }
    }

fun main() {
    var TodasMissao = Missao()


    println("""
     Painel do joguinho
     ===================
     1. Missao de coleta
     2. Missao de derrotar Boss
     3. Missao de Entregar Carta
       """.trimIndent())
    var op = readln().toInt()
    when(op){
        1-> TodasMissao = missaocoleta()
        2 -> TodasMissao = missaoDerrotaChefe()
        3 -> TodasMissao = MissaoEntrefa()
        else -> TodasMissao = Missao()
    }
    TodasMissao.executar()

}


