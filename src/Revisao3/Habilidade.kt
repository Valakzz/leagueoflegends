package Revisao3


abstract class Habilidade() {
    open fun executar() = println("habilidades em andamento")
}

class cura(var cura: Int): Habilidade(){
    override fun executar() {
        super.executar()
        println("Sua cura é ${cura}")
    }
}
class raio( var raiod: Int): Habilidade(){
    override fun executar() {
        super.executar()
        println("Seu raio é ${raiod}")
    }

}

class escudo( var escudo: Int): Habilidade(){
    override fun executar() {
        super.executar()
        println("Seu escudo é $escudo")
    }


}



fun main() {


   val cura = Revisao3.cura(44)
    cura.executar()
    val raio = raio(100)
        raio.executar()
    val escudo = escudo(5)
    escudo.executar()
}