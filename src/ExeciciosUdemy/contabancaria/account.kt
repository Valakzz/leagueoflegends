package ExeciciosUdemy.contabancaria

class account(balance: Double = 0.0) {

  var balance: Double = balance
      private set

    init {
        require(balance >= 0)
    }



    fun deposit(Amount: Double){
        require(Amount >= 0)
        balance += Amount
    }
    fun sacar(Amount: Double){
        require(Amount >= 0)
        balance -= Amount
    }
}