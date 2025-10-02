package jaguarfitnovo.Instrutor

import jaguarfitnovo.SistemaLogin
import jaguarfitnovo.Treinoss
import jaguarfitnovo.Treinoss.Companion.treinosAdc

class Menuinstrutor(
   private var Nomeint: String? = null,
   private var senhaInt: Int? = null

) {

    companion object{
        var info = informacoesInstrutor()
    }
    fun menuInstrutor(){
        do {
            println("Bem vindo ao jaguarFit = Area Instrutor")
            println("1: Faça seu login")
            println("2: Suas informações")
            println("3: Gostaria de adicionar um treino para um aluno")
            println("4: Mostre o treino do aluno")
            println("6: saia do aplicativo")
            val  op = readln().toInt()
                 when(op){

                     1 -> criarinstrutor()
                     2 -> mostrardados()
                     3  -> adicionarTreino()
                     4 -> mostrartreinos()
                     5 -> removerTreino()
                 }
        }while (op != 0)
    }
    fun setinfo(){
        println("Digite o nome do usuario")
       Nomeint = readln()
        senhaInt = readln().toInt()
    }
    fun mostrardados(){

            println("==========================")
            println("Dados Instrutor")
            println("Nome: $Nomeint")
            println("Senha: $senhaInt")
            println("==========================")
        }

    fun criarinstrutor(){
        println("Digite o nome que deseja cadastrar")
        Nomeint = readln()
        println("Digite sua senha ")
        senhaInt = readln().toInt()




    }



    fun adicionarTreino(){
        if ((Nomeint.isNullOrEmpty()|| senhaInt == null)){
            println("Você não fez logi nainda")
            return
        }
        else if (SistemaLogin.login.isNullOrEmpty() || SistemaLogin.senha == null){
                println("Você não tem nenhum aluno adicionado ainda")
                return
            }else{
            println("Digite o treino que voce gostaria de colocar para o aluno")
            val a = readln()
            val b = readln().toInt()
            val treinoscolocar = Treinoss(a,b)
            treinosAdc.add(treinoscolocar)
            println("Treinos colocados:")
            println("Treino colocado para o aluno ${SistemaLogin.login}")

            }
        }

    fun removerTreino(){
        if ((Nomeint.isNullOrEmpty()|| senhaInt == null)){
            println("Você não fez logi nainda")
            return
        }
        else if (SistemaLogin.login.isNullOrEmpty() || SistemaLogin.senha == null){
            println("Você não tem nenhum aluno adicionado ainda")
            return
        }else{
            println("Digite o treino que voce gostaria de retirar para o aluno")
            val asa = readln()
            println("Tempo do treino")
            val ba = readln().toInt()
            val treinoscoloca1r = treinosAdc.find { it.nomeTreino == asa && it.tempoTreino == ba }
            if (treinoscoloca1r in treinosAdc){
                treinosAdc.remove(treinoscoloca1r)
                println("Treino removido:")
                println("Treino removido para o aluno ${SistemaLogin.login}")
            }else{
                println("Treino não colocado")
            }

        }
    }



    fun mostrartreinos(){
        treinosAdc.forEach { it.mostrarTreino()
    }

}}
