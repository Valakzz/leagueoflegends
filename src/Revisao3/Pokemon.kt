package Revisao3

open class Pokemon(var tipo: String?, var faseEv: String?) {
    open fun Evoluir(){
       if (tipo == null && faseEv == null){
           println("Nenhum pokemon adicionado")
       }else{
           println("Pokemon do tipo $tipo está evoluindo")
           println("o pokemon está evoluindo para a próxima fase.")
           println("O mesmo evoluiu para $faseEv")
       }
    }
}
class Pikachu(  tipos: String, faseEv: String, var itensidadeChoque: Int): Pokemon(tipos, faseEv){
    override fun Evoluir() {
      println("O pikachu achou uma pedra do trovão e está evoluindo para $faseEv")
        println("Nova fase: $faseEv")
        println("Novo poder desbloqueado:Itensidade do trovão a mesma da $itensidadeChoque de dano" + "")

    }
}

fun main() {
    var pokemon = Pokemon(null,null,)
    pokemon.Evoluir()
    pokemon = Pikachu("Fogo", "Fase 1", 90)
    pokemon.Evoluir()


}