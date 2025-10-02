package ExeciciosUdemy

import javax.security.auth.login.AccountNotFoundException

fun main() {

    val a1 = Account("134214-1","João")
    val a2 = Account("134141241234566714-1","maria")
    val a3 = Account()
    val a4 = Account("wadawada","dwadada", 4100041.00)



   a1.print()
    a2.print()
    a3.print()
    a4.print()

    a1.Deposit(3400)

}

class ClassesUdemy(
   val min: String,
   val max: String
) {

    fun nex() = (min..max).toString().random()




}

class Account(
    val AccountNumber: String,
    val AccountOwner: String
){
    var balance: Double = 0.0

    constructor(): this(AccountNumber = "", AccountOwner = ""){
        println("Isso é constructor")
    }

    constructor(AccountNumber: String, AccountOwner: String, balance: Double): this(AccountNumber, AccountOwner){
        this.balance = balance

    }

    fun print(){
        println("Number: $AccountNumber Owner: $AccountOwner; Balance: $balance")
    }

    fun Deposit(amount: Double){
        balance += amount

    }

    fun Deposit(amount: Int){
        balance += amount

    }


}