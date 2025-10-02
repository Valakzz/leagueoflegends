package estudoopp

class Account(
   val AccountNumber: String,
   val  accountOwner: String) {

    var balance = 0.0
    constructor(): this( "", ""){
        println("voce foi chamado")

    }

    constructor(x1: String, x2: String, balance: Double):this(x1,x2){
        this.balance = balance
    }





    fun depositz(acount: Double){
        balance += acount
    }
    fun  depositz(account: Int){
        balance += account
    }

    fun print(){
        println("Number: ${AccountNumber}t: Owner: $accountOwner: Balance: $balance")

    }

}