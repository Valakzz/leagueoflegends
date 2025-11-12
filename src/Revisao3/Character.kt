package Revisao3

open class Character(var nome: String){ open fun attack(){ println("Você esta atancando") }
}
class Warrior(nome: String, var SwprdDamage: Int): Character(nome){
    override fun attack() { println("Você está atacando com a espada") }
}
class Arche(name: String, arcDamage: Int): Character(name){ override fun attack() { println("Atacando com flechas")}}

fun main() {
    var personagem1 = Character("")


    println("Escolha um personagem: \n 1 - Warrior \n 2 - Arche")
    val opcao = readln().toInt()
    println("Escolha um nome para o personagem")
    val nome = readln()
    when(opcao){
        1 -> personagem1 = Warrior(nome, 500)
        2 -> personagem1 = Arche(nome, 300)
        else -> personagem1 = Character(nome)
    }
    personagem1.attack()
}