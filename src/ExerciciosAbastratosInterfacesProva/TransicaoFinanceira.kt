package ExerciciosAbastratosInterfacesProva

abstract class TransicaoFinanceira(var valorFinanceiro: Double) {

    abstract fun processar(valor: Double)

    fun detalhesTransicao(){
        println("Seu saldo atual é $valorFinanceiro")
    }
}


class deposito(val valor: Double): TransicaoFinanceira(valor){

    override fun processar(valor: Double) {
        println("Processando seu deposito")
        super.valorFinanceiro += valor
        super.detalhesTransicao()
    }
}

class sacar(val valor: Double): TransicaoFinanceira(valor){
    override fun processar(valor: Double) {
        if (valor > super.valorFinanceiro){
            println("Saldo insuficiente")
        }else{
            super.valorFinanceiro -= valor
            super.detalhesTransicao()
        }
    }
}

fun main() {
    val deposit = deposito(500.00)
    deposit.processar(50.00)
    val saqz = sacar(100.00)
    saqz.processar(100.00)

}