package JogoTrigrinho.Jogododado

import JogoTrigrinho.Informacoes
import JogoTrigrinho.MinigameTigrinho

class Jogodado {

    companion object dados{
        val numerosDados = arrayListOf(1,2,3,4,5,6)
    }

    fun PainelDado(){

        if (MinigameTigrinho.valores <= 0){
            Informacoes.valorindevido()
        }

    }
}