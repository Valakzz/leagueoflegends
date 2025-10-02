package jaguarfitnovo

object planosDeTreino{
    var planosDiponiveis = mutableListOf("basic", "gold", "master")
    var planorecebido: String? = null

    fun escolherPlano(){
        println("Digite o plano que deseja escolher")
        planosDiponiveis.forEach { println(it) }
        val escolhar = readln().lowercase()
        if (escolhar in planosDiponiveis){
            planorecebido = escolhar
            println("O plano que voce escolheu é $planorecebido")
        }else{
            println("Plano invalido")
        }

    }
//    fun mostrarplano(){
//        if ( planorecebido == null){
//            println("Você não escolheu um plano ainda")
//        }else{
//            println("Seu plano é $planorecebido")
//        }
//
//    }
}
