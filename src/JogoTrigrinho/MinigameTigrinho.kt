package JogoTrigrinho

 open class MinigameTigrinho() {
    companion object{
        var valores: Int = 0
    }
    fun Depositados(Novovalor: Int = 0){
        if (Novovalor <= 0){
            Informacoes.valorindevido()
        }else{
            valores += Novovalor
            println("Olá Usuario você Depositou $Novovalor")
        }

    }


}