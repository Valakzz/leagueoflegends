package ExerciciosHeranca

import java.security.Principal

abstract class Habilidade() {
    object InfosP {
        var escudos: Int = 0
        var raios: Int = 0
        var vida: Int = 0

        fun InfomacoesP() = println("Informações Do player \nEscudo:$escudos \nVida: $vida")
    }
      open fun executar(valor: Int) = println()
}
class cura(): Habilidade(){
    override fun executar(valor: Int) {
        println("Você recebeu $valor de cura")
        InfosP.vida += valor
    }
}
class escudo(): Habilidade(){
    override fun executar(valor: Int) {
        println("Voce adicionou  agr seu escudo é $valor")
        InfosP.escudos += valor
    }
}
class raio(): Habilidade(){
    override fun executar(valor: Int) {
        println("Seu escudo tomou agr tem $valor")
        InfosP.escudos -= valor
    }
}

