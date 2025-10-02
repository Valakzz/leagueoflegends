package JogoTrigrinho

fun main() {



    val simbolos = listOf("🍒", "🍋", "🍇", "🔔", "⭐", "💎")
    val tigrinho = MenuPrincipal( simbolos)
    tigrinho.TelaPrincipal()

}
class MenuPrincipal(  val simbolos: List<String>) {

    val depositos = Depositos(0)
    fun Simboloscassino(){

        if (depositos.valores <= 0){

            println("Você não depositou um valor valido")
        }else{
            val  primeirosimbolo = simbolos.random()
            val  Segundosimbolo = simbolos.random()
            val  Terceirosimbolo = simbolos.random()
            println(" Rodada ${primeirosimbolo} : ${Segundosimbolo} : ${Terceirosimbolo}")
            if (primeirosimbolo == Segundosimbolo && Segundosimbolo == Terceirosimbolo){
                println("Parabéns você GANHOU parceiro \uD83D\uDC2F\uD83D\uDC2F")
                depositos.valores += 5000
            }else{
                println("Não foi dessa vez tente novamente \uD83D\uDC38")
                depositos.valores -= 50

            }

        }


    }

    fun TelaPrincipal(){

        var opcao: Int

        do {
            println("-------------------------------------------------------")
            println(" --- Bem vindo ao cassino dos baianos \uD83C\uDDEA\uD83C\uDDE8 --- ")
            println("1. Digite o valor que deseja depositar ");
            println("2. Começar o jogo \uD83C\uDF40 ");
            println("3. Gostaria de Olhar seu Deposito ");

            println("0. Sair \uD83D\uDC38");
            print("Digite uma opcao: \uD83D\uDC40 ");
            opcao = readln().toInt();

            when(opcao){
                2 -> Simboloscassino()
                0 -> println(" Você está saindo do Cassino \uD83D\uDE43 \uD83D\uDE43 ")

                1 ->{
                    println("Digite o valor que deseja depositar")
                    depositos.Depositados(readln().toInt())
                }
                3 -> println("Olá seu valor depositado é ${depositos.valores}")
            }
        }while (opcao != 0)
    }
}