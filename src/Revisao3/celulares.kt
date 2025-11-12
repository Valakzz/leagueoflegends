package Revisao3



abstract class  Dispositivos(var marca: String, var modelo: String) {



}

class Celular: Dispositivos{
    var sitem: Any?

    constructor ( marca: String, modelo: String, sistem: Any?):super(marca, modelo){
        this.sitem = sistem
    }
    fun Dadoss() = println("Marca: $marca \nModelo: $modelo \nSistema Operacional: $sitem")

}

fun main(){
    val celular = Celular("Nokia","Tijolao", "Android")
    celular.Dadoss()
}