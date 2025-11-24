package udemyexercicios.ExercicioWorker


/**
 * Exercicio:
 * Crie uma classe Worker para repesentar um trabalhador que possui salário base. Um Worker tem um metodo play
 * que retorna o valor total a ser pago pelo seu salario
 *
 *
 * Para calcular o valor total do salário, é preciso multiplicar o salario com base por um multiplicador o qual depende do tipo de trabalhador
 * se for um trabalhador que ganha por hora, o multiplicador é o numero de horas trabalhadas
 * se for um trabalhador freelancer o salario já é acedado com atemão
 *
 *
 *
 *wd
 *
 *
 */

fun main() {
val w1 = Worker.HourlyhWoker(100.00, 160)
    val w2 = Worker.FreeLancerWork(5000.0)
    pay(w1)
    pay(w2)
    println(Worker.totalpay.totalPay)



}
fun pay(worker: Worker){
    Worker.totalpay.totalPay += worker.pay()
}
abstract class Worker(val baseSalary: Double) {

    object totalpay {
        var totalPay = 0.0

    }

    fun pay(): Double{

        return baseSalary * multiplier()
    }

    class HourlyhWoker(hourprice: Double, val hourWork: Int): Worker(hourprice){
        override fun multiplier(): Double {
              return  hourWork.toDouble()
        }
    }

    class FreeLancerWork(TotalSalary: Double): Worker(TotalSalary){
        override fun multiplier(): Double {
         return 1.0
        }
    }
    abstract fun multiplier(): Double
}