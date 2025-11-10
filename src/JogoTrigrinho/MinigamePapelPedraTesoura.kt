package JogoTrigrinho

class MinigamePapelPedraTesoura(){
    var pedraPapeLTesoura = arrayListOf("pedra", "papel", "tesoura")
    fun JogarPapelPedraTesoura(){
        while(true){
        var pedrarandom = pedraPapeLTesoura.random()
        val ganhorand = arrayListOf(500,1000,2000).random()
        if (MinigameTigrinho.valores <= 0){
            Informacoes.valorindevido()
            break
        }else{
            println("Olá escolha algum das opções")
            pedraPapeLTesoura.forEach { println(it) }
            val Escolhagame = readln().lowercase()
            if (Escolhagame.toIntOrNull() != null){
                Informacoes.valorindevido()
                break
            }
            if (Escolhagame == pedrarandom ){
                println("Parabéns usuario vc ganhou valor ganho +${ganhorand}")
                MinigameTigrinho.valores += ganhorand

            }else{
                println("Você perdeu sua escolha foi $Escolhagame e a da maquina $pedrarandom valor perdido -$ganhorand ")
                MinigameTigrinho.valores -= ganhorand
            }
        }
        }
    }
}


