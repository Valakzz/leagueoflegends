package ExerciciosHeranca

abstract class  Dispositivos(var marca: String, var modelo: String) {


}

class Celular: Dispositivos{
    var sitem: Any?

    constructor ( marca: String, modelo: String, sistem: Any?):super(marca, modelo){
        this.sitem = sistem
    }
    fun Dadoss() = println("Marca: $marca \nModelo: $modelo \nSistema Operacional: $sitem")

}