package JaguarBank
class Extrato {
    val listaExtrato = mutableListOf<String>()

    fun TodosExtratos(){

        for (e in listaExtrato) {
            println("Seus Extratos são $e")
        }


    }
    fun AdicionarExtrato(A: String){
        listaExtrato.add(A)

    }

}