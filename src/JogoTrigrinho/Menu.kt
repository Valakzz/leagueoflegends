package JogoTrigrinho

import JogoTrigrinho.LeagueOfLegends.painel

fun main() {
    val simbolos = listOf("🍒", "🍋", "🍇", "🔔", "⭐", "💎")
    val tigrinho = MenuPrincipal( simbolos)
    tigrinho.TelaPrincipal()
}
class MenuPrincipal(  val simbolos: List<String>) {
    var gamepapel = MinigamePapelPedraTesoura()
    fun Simboloscassino(){
        if (MinigameTigrinho.valores <= 0){
            Informacoes.valorindevido
        }else{
            val  primeirosimbolo = simbolos.random()
            val  Segundosimbolo = simbolos.random()
            val  Terceirosimbolo = simbolos.random()
            println(" Rodada ${primeirosimbolo} : ${Segundosimbolo} : ${Terceirosimbolo}")
            if (primeirosimbolo == Segundosimbolo && Segundosimbolo == Terceirosimbolo){
                println("Parabéns você GANHOU parceiro \uD83D\uDC2F\uD83D\uDC2F")
                MinigameTigrinho.valores += 5000
            }else{
                println("Não foi dessa vez tente novamente \uD83D\uDC38")
                MinigameTigrinho.valores -= 50
            }
        }
    }

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
                2 -> Simboloscassino()
                3 -> gamepapel.JogarPapelPedraTesoura()
                4 -> println("Olá seu valor depositado é ${MinigameTigrinho.valores}")
                5 -> painel().PainelPrincipal()
            }
        }while (opcao != 0)
    }
}