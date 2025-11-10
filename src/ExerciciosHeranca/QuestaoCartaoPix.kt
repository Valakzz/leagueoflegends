package ExerciciosHeranca

open class QuestaoCartaoPix {

   open fun realizarPagamento(valor: Double){}


}
class PagmentoCartao: QuestaoCartaoPix(){
    override fun realizarPagamento(valor: Double) {
        println("Pagamento de R$$valor realizado com cartão.")
    }


}
class PagamentoPix: QuestaoCartaoPix(){
    override fun realizarPagamento(valor: Double) {
        println("Pagamento de R$$valor realizado via PIX.")
    }
}

class PagamentoBoleto: QuestaoCartaoPix(){
    override fun realizarPagamento(valor: Double) {
        println("Pagamento de R$$valor realizado via Boleto.")
    }
}