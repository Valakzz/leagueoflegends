package jaguarfitnovo

import JaguarFit.Aluno
import JaguarFit.Plano
import jaguarfitnovo.Instrutor.Menuinstrutor

class SistemaLogin {

    companion object{
        var login: String? = null
            private set
        var senha: String? = null
            private set


        var plano1 = Plano("Basico", 50.00, 3);
        var plano2 = Plano("Vip", 75.00, 5);
        var plano3 = Plano("Premium", 95.00, 7);
    }

    fun loginUsuario(){
        println("Digite  usuario que deseja colocar")
        login = readln()
        println("Digite a senha que deseja colocar")
        senha = readln()
        println("===============================")
        println("Obrigado por se cadastra seu usuario é $login e sua senha é $senha")
    }

    fun mostrarLogin(){
        if (login == null && senha == null){
            println("Você não fez o login ainda")
        }else{
            if (planosDeTreino.planorecebido == null ){
                planosDeTreino.planorecebido = "Nenhum plano escolhido"
            }
            println("===============================")
            println("Olá suas informações são")
            println("Nome: $login")
            println("Senha: $senha")
            println("Plano: ${planosDeTreino.planorecebido}")

        }

    }

    fun menuLogin(){
        do {
            println("Bem vindo ao jaguarFit essa são as opções disponivéis")
            println("1: Faça seu login")
            println("2: Suas informações")
            println("3: Escolha um plano")
            println("4: Gostaria de adicionar um treino")
            println("5: Mostre seu treino")
            println("6: Area instrutor")
            println("0: saia do aplicativo")
            val opcao = readln().toInt()


            when(opcao){
                1 -> loginUsuario()
                2 -> mostrarLogin()
                3 -> planosDeTreino.escolherPlano()
                4 -> treinozinhos.montartreino()
                5 -> treinozinhos.listatreino()
                6 -> instrutoc.menuInstrutor()
            }

        }while (opcao != 0)
    }




        val treinozinhos = Treinoss()
    val instrutoc = Menuinstrutor()



}