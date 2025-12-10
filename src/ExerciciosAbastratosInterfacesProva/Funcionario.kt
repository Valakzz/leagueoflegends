package ExerciciosAbastratosInterfacesProva

abstract class Funcionario(nomeFuncionario: String,var SalarioBase: Double) {
    var senharesolvida = false

    abstract fun calcularBonus()
}

interface Autenticacao{
    fun autenticar( senha: String): Boolean

}

class Gerente(val nomeGerente: String, val SalarioBasee: Double): Funcionario(nomeGerente, SalarioBasee), Autenticacao{

    override fun autenticar(senha: String): Boolean {
       println("Autenticando Usuario")
        super.senharesolvida = true
        return senharesolvida

    }

    override fun calcularBonus() {
        if (senharesolvida == true){
            println("ola $nomeGerente  Calculando Bonus ${super.SalarioBase + SalarioBasee * 0.35}")
        }else{
            println("Você ainda não fez a autenticação")
        }

    }
}

class vendedor(val nomeVedendor: String, var SalarioBasee: Double): Funcionario(nomeVedendor,SalarioBasee){
    override fun calcularBonus() {  println(" Ola ${nomeVedendor}Calculando Bonus ${super.SalarioBase + SalarioBasee * 0.3}")
    }

}

fun main() {
//    val g1 = Gerente("Joselino", 500.0)
//    g1.autenticar("GKSKZKWA")
//    g1.calcularBonus()
    val v1 = vendedor("joela", 500.00)
    v1.calcularBonus()

}