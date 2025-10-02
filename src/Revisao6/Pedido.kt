package Revisao6

class Pedido(
    var codigoP: Int = 0,
    var NomeC: String = "",
    var DescricaoP: String = ""

) {

    fun NovoPedido(){
        println("=============")
        println("Nome do Pedido: $NomeC")
        println("Código do pedido: $codigoP")
        println("Descrição do pedido $DescricaoP")
        println("=============")

    }

    fun Novopedido2(){
        println("Digite seu nome")

        val novo = Pedido(NomeC = readln())
        println("Digite o código do produto")
       novo.codigoP =  readln().toInt()
        println("digite a descrição do pedido")
         novo.DescricaoP  = readln()

        println("=============")
        println("Nome do Pedido: ${novo.NomeC}")
        println("Código do pedido: ${novo.codigoP}")
        println("Descrição do pedido ${novo.DescricaoP}")
        println("=============")


    }

}