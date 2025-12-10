package udemyexercicios.Comandos

abstract class shape{
   open  val vortez = 0
}

class square: shape(){
    override val vortez: Int
        get() = 5

}
class Triangle(override var vortez: Int = 5): shape()

fun main() {
    val a1 = square()
    println(a1.vortez)
    val a2 = Triangle()
    println(a2.vortez)
}