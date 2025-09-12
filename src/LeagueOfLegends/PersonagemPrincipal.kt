package LeagueOfLegends

class PersonagemPrincipal(
    var nome: String = "",
    var vida: Int = 100
) {

    fun PersonagemAdiversario(){
        println("Gostaria de adicionar um personagem Digite: Sim")
        val personagemEscolhido = readln().lowercase()
        if (personagemEscolhido == "sim"){
            Adversarios.inimigoEsc =  Adversarios.campeoes.random()
            println("O personagem que entrou na arena é ${Adversarios.inimigoEsc} e a vida dele é ${Adversarios.vida}")
        }else{
            println("Nenhum inimigo Entrou na arena ainda")
        }
    }

    fun personagemIscolhido(){

        if(Adversarios.inimigoEsc == null){
            println("Voce não escolheu um inimigo ainda")
    }else{
            println("Digite o nome do personagem que você quer")
            this.nome = readln()
            println("================================================================")
            println("Personagem Escolhido: ${nome} e sua vida é $vida")
            println("================================================================")
        }



    }

    fun mostrarPersonagem(){
        println("================================================================")
        println(" Olá, seu personagem escolhido é ${nome} e a vida é ${vida}.")
        println("================================================================")
    }


}