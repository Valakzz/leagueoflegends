package udemyexercicios.ContaBancaria

import ExeciciosUdemy.contabancaria.account

class Accountv( private val owner: Nameable): printx {

    private var balance: Double = 0.0

    fun deposit(value: Double): Double{
       balance += value
        return balance
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}
interface Nameable{
    val firsName: String
    val lastName: String
    val fullName: String
        get() = "$firsName $lastName"
}

interface printx{
    fun print()
}

class PersonName(override val firsName: String, override val lastName: String): Nameable

fun main() {
// val p1 = Accountv(PersonName("Jericho", "Swain"))
    val p1 = Accountv(object : Nameable{


        override val firsName: String = readln()
        override val lastName: String
            get() = "swain"
    })


    p1.deposit(5000.00)
    p1.print()
}