package testes

fun main() {
    println(Testclass.varus(1,5))
}

class Testclass {

    val x = 5


    companion object{
        fun varus(a: Int, b: Int) = a + b

    }
}