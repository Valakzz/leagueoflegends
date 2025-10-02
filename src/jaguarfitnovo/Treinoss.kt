package jaguarfitnovo

class Treinoss(
    var nomeTreino: String? = null,
    var tempoTreino: Int? = null



) {

    companion object{
        var treinosAdc = mutableListOf<Treinoss>()
    }

    fun montartreino(){
        if (SistemaLogin.login == null || SistemaLogin.senha == null){
            println("Você não fez um login ainda")
        }else{
            println("Digite o treino que vc gostaria de colocar e os minutos")
            val n = readln()
            println("Digite quantos minutos de treino")
            val y = readln().toInt()
            var treinos = Treinoss(n, y)
            treinosAdc.add(treinos)
        }

    }

    fun listatreino(){

        treinosAdc.forEach { it.mostrarTreino() }
    }

    fun mostrarTreino(){
        if (tempoTreino == null || nomeTreino == null){
            println("Voce não adicionou um treino ainda")
        }else{
            println("Seus treinos são $nomeTreino e o tempo: $tempoTreino")
        }

    }

}