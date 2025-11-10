package Testaleatorio

fun main() {
   val co1 =  coresw("redd")

    co1.resultado()
}

class  coresw(var seletor: String){

    companion object{
        var red = "Vermelho"
        var white = "branco"
        var blue  = "azul"
    }

    fun resultado(){

        val cor1 = when(seletor){
            "red" -> red
            "white" -> white
            "blue" -> blue
        else -> "cor invalida"

        }
        println(cor1)
    }


}