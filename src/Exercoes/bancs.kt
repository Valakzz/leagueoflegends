package udemyexercicios.Exercoes

class bancs {
    var balance = 0.0
        private set

    fun deposit(value: Double){
       if(value < 0){
           throw Invalidovalueexpressao(value)
       }else{
           balance += value
       }
    }

    fun sacar(value: Double){
        if(value < 0){
            throw Invalidovalueexpressao(value)
    }
        if (balance - value < 0){
            throw Saldoinsuficiente(balance)
        }

}



}

fun main() {
    val bank = bancs()
    try {
        bank.deposit(-500.00)
        bank.sacar(600.00)

    }catch (e: Invalidovalueexpressao){
        println("Ops, Invalid value: ${e.message}")
    }catch (e: Saldoinsuficiente){
        println("Obs: voce tentou sacar mais que podia seu saldo é ${e.correntBalancee}")
    }
}