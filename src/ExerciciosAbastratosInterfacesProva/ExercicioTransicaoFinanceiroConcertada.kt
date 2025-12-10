


object valores{

    var balance: Double = 0.0

}

abstract class TransicaoFinanceira() {

    abstract fun processar(valor: Double)

    fun detalhesTransicao(){
        println("Seu saldo atual é ${valores.balance}")
    }
}


class deposito(): TransicaoFinanceira(){

    override fun processar(valor: Double) {
        println("Processando seu deposito")
        valores.balance += valor
        super.detalhesTransicao()
    }
}

class sacar(): TransicaoFinanceira(){
    override fun processar(valor: Double) {
        if (valor > valores.balance){
            println("Saldo insuficiente")
        }else{
            valores.balance -= valor
            super.detalhesTransicao()
        }
    }
}

fun main() {
    val deposit = deposito()
    deposit.processar(200.00)
    val saqz = sacar()
    saqz.processar(100.00)

}