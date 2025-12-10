package udemyexercicios.Comandos

object Factory{
    var totalcarros = 0

    fun newcarry():car{
        totalcarros++
        return car()
    }
}

class car

fun main() {

//    val car1 = Factory.newcarry()
//    val car12 = Factory.newcarry()
//    val car13 = Factory.newcarry()
//    println(Factory.totalcarros)

    val r1 = rentangle(5, 3)

    println(r1.width)
    println(r1.sunfarce)


}


class rentangle(widt: Int, height: Int){
    var width: Int = widt



        private set(value){
            if (value >= 18 ){
                field = value
                println("Você é de maior")
            }else{
                field = value
                println("Você é de menor")
            }
        }
             var height: Int = height
            private set(value){
                field = value
            }

    val sunfarce get()= width * height
}
