package Revisao3

open class Luz(var marca: String, var ligado: Boolean){
    fun mostrarMarca() = println("Lampada da marca $marca")
     open fun mostrarCor() = println("Lampada ligada cor branca")
}

class Luminaria(marca: String, ligado: Boolean): Luz(marca, ligado){

    fun ligar(){ super.ligado = true }
    fun desligado(){ this.ligado = false }

    override fun mostrarCor() {
        if (super.ligado == true){
         println("Lampada ligada")
        }else{
            println("Lampada Desligada")
        }
    }

}