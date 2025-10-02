package Revisao6

fun main() {

    var pedido = Pedido(45434,"Alisson","Livro Alice e pais das maravilhas")

//    var nomenovo = Pedido(NomeC = readln(), DescricaoP = "Novo livro magico de oz")



       do {

           pedido.NomeC = readln()
           pedido.NovoPedido()


       }while (pedido.NomeC == "sair")

    }

//    nomenovo.NovoPedido()
//    var pedido2 = Pedido(readln().toInt(),readln(),readln())


//    pedido2.NovoPedido()

//    var pedido3 = Pedido()
//    pedido3.Novopedido2()

