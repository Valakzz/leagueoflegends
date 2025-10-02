package JaguarFit

import jaguarfitnovo.SistemaLogin

private class Historico(
    var level: Int = 0,
    var tempo: Int = 0)

class Aluno(
    private var id: Int = 0,
    private var nome: String = "",

    )


{
    companion object{
        var plano1 = Plano("Basico", 50.00, 3);
        var plano2 = Plano("Vip", 75.00, 5);
        var plano3 = Plano("Premium", 95.00, 7);
    }

    private var historico = Historico()
    private val treinos = mutableListOf<String>();


    fun pegarId():Int{
        return id
    }

    fun mostrarDados(){
       // println("---- Dados do Aluno ----");
        println("Nome: ${nome}");
        //plano.mostrarPlano();
    }

    fun adicionarTreino(){
        if (SistemaLogin.login == null && SistemaLogin.senha == null){
            println("Você não fez login aidna")
        }else{
            println("Digite o nome do treino que deseja adicionar")
            val Treino: String = readln()
            treinos.add(Treino)
        }
    }

    fun mostrarTreinos(){
        if(treinos.isEmpty()){
            println("O aluno ${nome} nao possui nenhum treino");
        }else{
            println("-- Treinos do aluno ${nome}")
//            for(treino in treinos){
//                treino.mostrarTreino()
//            }
            treinos.forEach {println(treinos)}
        }
    }
}