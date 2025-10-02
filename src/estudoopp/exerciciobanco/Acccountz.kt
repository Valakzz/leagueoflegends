package estudoopp.exerciciobanco
class Acccountz(balance: Int = 0) {
    init {
//        if (balance < 0){
//            println("Digite um numero valido")
//        }
        require(balance >= 0){
        }
    }
    var balance: Int = balance
        private set
    fun deposito(amount: Int){

        require(amount >=0)
        println("Digite o valor que gostaria de depositar")
        balance += amount
    }

    fun scar(amount: Int){
        require(amount >=0)
        println("Digite o valor que gostaria de depositar")

        if (amount > balance){
            println("Vc n tem mais saldo suficiente para sacar")
        }else{
            println("valor retirado foi $amount")
            balance -= amount
        }
    }
    fun dados(){
        println("O valor depositado da conta é $balance")
    }
    fun dadosnovos(){
        println("O valor da cont $balance")
    }
}