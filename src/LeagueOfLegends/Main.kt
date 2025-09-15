package LeagueOfLegends

fun main() {



    val personagem = PersonagemPrincipal()
    val inimigos = PersonagemPrincipal()
    val ataquezi = Ataque()



    do {
        println("Bem=vindo Ao league Of Lengends")
        println("=================================")
        println("1. Escolha seu personagem")
        println("2:Mostrar informações personagem adivsersario")
        println("3: Aperte para ser escolhido um Adversario Aleatorio")
        println("4: Mostrar Informações do adversario")
        println("5: Ataque o inimigo")
        println("0: Saia do jogo")
        val opcao = readln().toInt()


        when(opcao){
            1 -> personagem.personagemIscolhido()
            2 -> personagem.mostrarPersonagem()
            3 -> inimigos.PersonagemAdiversario()
            4 ->personagem.mostrarPersonagemInimigo()
            5 ->ataquezi.AtaqueAdv()
        }
    }while (opcao != 0)


}