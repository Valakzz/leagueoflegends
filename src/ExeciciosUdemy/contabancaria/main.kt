package ExeciciosUdemy.contabancaria

fun main() {
    val account = account(100.0)

    account.deposit(10000.00)
    account.sacar(5000.00)

    println(account.balance)
}