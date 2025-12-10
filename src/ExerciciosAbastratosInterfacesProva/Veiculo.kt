package ExerciciosAbastratosInterfacesProva

import udemyexercicios.Comandos.car

interface Veiculo{

    fun frear()
    fun acelerar()
    fun destalhesVeiculoso()


}

class carro(val nomeCarro: String,val  modeloCarro: String): Veiculo{

    override fun acelerar() {
        println("Seu $nomeCarro está acelerrando")
    }

    override fun frear() {
        println("Seu $nomeCarro Freiando")
    }

    override fun destalhesVeiculoso() {
            println("Nome: $nomeCarro")
            println("Modelo: $modeloCarro")

    }



}

class motos(val nomeMoto: String, val modeloMoto: String): Veiculo{

    override fun acelerar() {
        println("Sua $nomeMoto está acelerando")
    }

    override fun frear() {
        println("Seu $nomeMoto Freiando")
    }

    override fun destalhesVeiculoso() {
            println("Nome: $nomeMoto")
            println("Modelo: $modeloMoto")
    }


}

fun main() {

    val car1 = carro("Mustang", "Ford")
    val car2 = carro("Gol quadrado", "Volks")


    val moto1 = motos("xre-190", "Honda")

    val listcarro = mutableListOf(car1, car2, moto1)
    listcarro.forEach {it.destalhesVeiculoso()}
    println("=======================")
    moto1.destalhesVeiculoso()
}