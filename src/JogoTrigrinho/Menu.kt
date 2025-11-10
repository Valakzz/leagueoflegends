package JogoTrigrinho

import JogoTrigrinho.JogoTrigri.Tigri
import JogoTrigrinho.LeagueOfLegends.painel

fun main() {
    val tigrinho = MenuPrincipal()

    tigrinho.TelaPrincipal()
}
class MenuPrincipal() {
    val tigi = Tigri()
    var gamepapel = MinigamePapelPedraTesoura()


    fun TelaPrincipal(){
        var opcao: Int
        var deposit = MinigameTigrinho()
        do {
            println("-------------------------------------------------------")
            println(" --- Bem vindo ao cassino dos baianos \uD83C\uDDEA\uD83C\uDDE8 --- ")
            println("1. Digite o valor que deseja depositar ");
            println("2. Minigame Tigrinho \uD83C\uDF40 ");
            println("3. Minigame Pedra, Papel, Tesoura ");
            println("4. Gostaria de Olhar seu Deposito ")
            println("5. Minigame LeagueOfLegends ")
            println("6. Gastar tudo no dado")
             
            println("0. Sair \uD83D\uDC38");
            print("Digite uma opcao: \uD83D\uDC40 ");
            opcao = readln().toInt();

            when(opcao){
                0 -> println(" Você está saindo do Cassino \uD83D\uDE43 \uD83D\uDE43 ")
                1 ->{
                    println("Digite o valor que deseja depositar")
                   deposit.Depositados(readln().toInt())
                }
                2 -> tigi.Simboloscassino()
                3 -> gamepapel.JogarPapelPedraTesoura()
                4 -> println("Olá seu valor depositado é ${MinigameTigrinho.valores}")
                5 -> painel().PainelPrincipal()
            }
        }while (opcao != 0)
    }
}