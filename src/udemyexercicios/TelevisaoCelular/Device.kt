package udemyexercicios.TelevisaoCelular

abstract class Device {
    var ison = false

    fun on(){ ison = true}
    fun off(){ ison = false}
}
class tv: Device()
class cell: Device()

fun main() {
//    val tv = tv()
//    val cell = cell()
//    tv.on()
//    println(tv.ison)
//    println(cell.ison)
var op = 4
val resultado = mapOf(
    1 to  "Domingo",
    2 to  "Segunda",
    3 to  "Terça",
    4 to  "Quarta",

)
    println(resultado.getOrDefault(op, "Numero invalido"))
}
