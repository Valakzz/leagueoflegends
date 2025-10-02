package JogoTrigrinho

class Depositos( var valores: Int) {
    fun Depositados(Novovalor: Int){
        if (Novovalor <= 0){
            println("O valor que você Depositou é invalido")
        }else{
            valores += Novovalor
            println("Olá Usuario você Depositou $Novovalor")
        }

    }


}