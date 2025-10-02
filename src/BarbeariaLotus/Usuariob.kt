package BarbeariaLotus

class Usuariob(
  private  var nome: String = "",
    var EstiloCab: String = "",
    var horario: Double = 00.00
) {


    fun Cadastro(){

        println("Digite seu nome para se cadastrar")
        this.nome = readln()
        println("Digite o Estilo de cabelo que vc gostaria de usar")
        this.EstiloCab = readln()
        println("Digite o horario que vc gostaria de cortar seu cabelo")
        this.horario = readln().toDouble()



    }

    fun dadosUsuario(){
        println("==========Barberia Lotus=======")
        println("Olá usuario: $nome")
        println("Estilo de cabelo escolhido: $EstiloCab")
        println("Horario escolhido para o corte $horario")
    }


}