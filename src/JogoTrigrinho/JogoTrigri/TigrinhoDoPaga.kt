package JogoTrigrinho.JogoTrigri

import JogoTrigrinho.Informacoes
import JogoTrigrinho.MinigameTigrinho

class Tigri{
    companion object{
        val simbolos = listOf("\uD83D\uDC2F", "🍋", "🍇", "🔔", "⭐", "💎")
        val ganhos = arrayListOf(100, 500, 5000, 250)
    }
    fun Simboloscassino(){
        while (true){
            if (MinigameTigrinho.valores <= 0){
                Informacoes.valorindevido()
               break
            }else{
                val  primeirosimbolo = simbolos.random()
                val  Segundosimbolo = simbolos.random()
                val  Terceirosimbolo = simbolos.random()
                println(" Rodada ${{ primeirosimbolo}} : ${Segundosimbolo} : ${Terceirosimbolo}")
                if (primeirosimbolo == Segundosimbolo && Segundosimbolo == Terceirosimbolo){
                    println("Parabéns você GANHOU parceiro \uD83D\uDC2F\uD83D\uDC2F")
                    MinigameTigrinho.valores += ganhos.random()
                }else{
                    println("Não foi dessa vez tente novamente \uD83D\uDC38")
                    MinigameTigrinho.valores -= ganhos.random()
                }
            }
        }
    }
}