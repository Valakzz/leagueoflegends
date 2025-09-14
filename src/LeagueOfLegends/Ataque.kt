package LeagueOfLegends



class Ataque() {

    val personagemPrip = PersonagemPrincipal()
    val valoresskill = mutableListOf(5,10,35,40,2,5)
    val skilEscolhida = readln().lowercase()

    fun AtaqueAdv(){
            do {
                println("Deseja atacar o inimigo?")
                val ataquep = readln().lowercase()
                if (ataquep == "sim"){
                    println("Essas são suas skills Disponiveis: Q,W,E,R")
                    skilEscolhida
                }else if (skilEscolhida == "q"){
                    Adversarios.vidaInimigo -= valoresskill.random()
                }else if (skilEscolhida == "e"){
                    Adversarios.vidaInimigo -= valoresskill.random()
                }else if (skilEscolhida == "w"){
                    Adversarios.vidaInimigo -= valoresskill.random()
                }else if (skilEscolhida == "r"){
                    Adversarios.vidaInimigo -= valoresskill.random()
                }else if (Adversarios.vidaInimigo == 0){
                    println("Você Derrotou o personagem ${Adversarios.inimigoEsc}")
                    println("=====================================================")
                    println("Deseja sair digite: Sim!")
                }
            }while(ataquep == "não"|| ataquep == "sair")
    }}


