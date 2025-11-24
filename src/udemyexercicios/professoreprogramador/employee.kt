package udemyexercicios.professoreprogramador

abstract class employee {

    abstract fun work()
}

open class programmer: employee(){

    override fun work() {
        println("Programmer Work")

    }

}
class KotlinProgrammer: programmer(){
    override fun work() {
        println("Kotlin Working")
    }
}

class teacher: employee(){

    override fun work() {
        println("Teacher Work")

    }

}

fun main() {
    val p = programmer()
    p.work()
    var c: programmer = KotlinProgrammer()
    c.work()
}