package estudoopp

fun main() {

    val x1 = Account("13423-1","Joao")
    val x2 = Account("421331-1", "Maria")
    val x3 = Account()
    val x4 = Account("421412414-1","joao")
   val x5 = Account("34321412412", "valenia", 5021.0)

    x1.depositz(2000.00)
    x2.depositz(150.00)
    x3.depositz(1000)


    x1.print()
    x2.print()
    x3.print()
    x4.print()
    x5.print()
}