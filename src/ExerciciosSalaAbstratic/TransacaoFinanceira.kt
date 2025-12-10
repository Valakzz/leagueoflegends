package ExerciciosSalaAbstratic



object Valores{
    private var valores = 0.0
    fun Depositosz(valor: Double){
        valores += valor
    }
    fun valoresDaConta() = println("Valor atual ${valores}")
    fun Saques(valor: Double){
        if (valores >= 0 && valores >= valor){
            valores -= valor
        }else{
            println("Valores insuficiente")
        }
    }
}


    abstract class TransacaoFinanceira() {
        abstract fun processar(value: Double)
        abstract fun concretoDetalhes()
    }
    class Deposito(): TransacaoFinanceira(){
        override fun processar(valoes: Double) {
            println("Processando seu deposito")
            Valores.Depositosz(valoes)


        }

        override fun concretoDetalhes() {
            Valores.valoresDaConta()
        }

    }
    class saque(): TransacaoFinanceira(){
        override fun processar( value: Double) {
            println("Saquando seu valor")
            Valores.Saques(value)

        }

        override fun concretoDetalhes() {
            Valores.valoresDaConta()
        }

    }



fun main() {
    val p1 = Deposito()
    p1.processar(500.00)
    p1.concretoDetalhes()


    val saq = saque()

    saq.processar(20.00)
    saq.concretoDetalhes()




}