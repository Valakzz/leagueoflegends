package JogoTrigrinho.LeagueOfLegends

import JogoTrigrinho.Informacoes
import JogoTrigrinho.Jogododado.Jogodado

import JogoTrigrinho.MinigameTigrinho
import java.security.Principal

abstract class Jogododado{
    var dadosF: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5 ,6)
    val ganhorand = arrayListOf(500,1000,2000).random()

}

class JogoDados( var seunumero: Int?):Jogododado(){

    fun dados(){
        while (true){
            if (MinigameTigrinho.valores <= 0){
                Informacoes.valorindevido()
            }else{
                println("Escolha um dado \n Dados Disponiveis:")
                for (i in dadosF){
                    println(i)
                }
            if(seunumero != null) {
                    println("Escolha seu dado")
                    seunumero = readln().toInt()
                    println("Os dados estão sendo jogados")
                   val numeroescolhio = dadosF.random()
                if (seunumero == numeroescolhio){
                    println("Parabéns vc ganhou!\n Seu dado: $seunumero \n Dado da Maquina: $numeroescolhio")
                    MinigameTigrinho.valores += ganhorand
                }else{
                    println("Você perdeu!\n Seu dado: $seunumero \n Dado da Maquina: $numeroescolhio")
                    MinigameTigrinho.valores -= ganhorand
                }

            }
            }
        }
    }


}