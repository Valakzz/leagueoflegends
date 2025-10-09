package JogoTrigrinho.LeagueOfLegends
class Ataque() {
    val valoresskill = mutableListOf(5,10,35,40,2,5)

    fun AtaqueAdv(){
            do {

                 if(Adversarios.inimigoEsc == null){
                        println("Voce não escolheu um inimigo ainda")
                     break
                 }
                println("Essas são suas skills Disponiveis: Q,W,E,R")
                val skilEscolhida = readln().lowercase()
                val dano = valoresskill.random()


                 if (skilEscolhida == "q") {
                     Adversarios.vidaInimigo -= dano
                     println("Você causou $dano na ${Adversarios.inimigoEsc}")
                     println("Vida restante do adiversario: ${Adversarios.vidaInimigo}")
                 }else if (skilEscolhida == "w") {
                     Adversarios.vidaInimigo -= dano
                     println("Você causou $dano na ${Adversarios.inimigoEsc}")
                     println("Vida restante do adiversario: ${Adversarios.vidaInimigo}")

                 }else if (skilEscolhida == "e") {
                     Adversarios.vidaInimigo -= dano
                     println("Você causou $dano na ${Adversarios.inimigoEsc}")
                     println("Vida restante do adiversario: ${Adversarios.vidaInimigo}")

                 }else if (skilEscolhida == "r") {
                     Adversarios.vidaInimigo -= dano
                     println("Você causou $dano na ${Adversarios.inimigoEsc}")
                     println("Vida restante do adiversario: ${Adversarios.vidaInimigo}")
                 }
                if (Adversarios.vidaInimigo == 0 ){
                    println("==================================================")
                    println("Você derrotou o inimigo ${Adversarios.inimigoEsc}")
                    println("==================================================")
                    break
                }
            }while(skilEscolhida != "sair")
        println("Você saiu da batalha")
        Adversarios.sempersonagem()
        Adversarios.vidaInimigo = 100
    }
}


