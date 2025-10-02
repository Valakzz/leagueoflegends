package ExercicioAgua

fun main() {
    val p1 = Perso()

    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()
    p1.DriWater()
    p1.andar()
    p1.andar()
   println("A pessoa andou ${ p1.end()}M")
    val p2 = Perso(1000)
    p2.andar()
    p2.DriWater()
    p2.andar()
    p2.andar()
    println("A pessoa andou ${ p2.end()}M")

}

private class Perso(
 private  val InicialDistanciaAgua: Int = 5000

){

private  var distancia = 0
    private var DistanciaAgua = InicialDistanciaAgua
    fun andar(){
        if (DistanciaAgua > 0){
            distancia += 1000
            DistanciaAgua -= 1000
        }

    }

    fun DriWater(){
        DistanciaAgua = InicialDistanciaAgua
    }
    fun end(): Int{
        return distancia
    }

}