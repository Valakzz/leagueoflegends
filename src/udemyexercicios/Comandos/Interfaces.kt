package udemyexercicios.Comandos

interface Arvoremae{

   fun clonearvore()
}

open class clonagemArvore: Arvoremae{

    override fun clonearvore() {
        println("Arvore clonada com sucesso")
    }

}
class TamanhomudaseArvores(val tipo: String, val Tamanho: Double): clonagemArvore(), Arvoremae{


    override fun clonearvore() {
        super.clonearvore()
        println("Arvore do tipo: $tipo e tamanho $Tamanho")
    }
}


interface a{
    fun a()
}
interface b: a{
    fun b()
}

class juncao: b {
    override fun b() {
        println("Junção B")
    }

    override fun a() {
        println("Junção a")
    }
}

interface motocilic {
    fun motociclist()

}
interface veic: motocilic{
    fun veichuz()
}

fun main() {
//    var a1 = TamanhomudaseArvores("Galho seco", 0.34)
//    a1.clonearvore()
//
//    var nomeCliente = "João"
//    var nomecliente = "Mariazinha"
//    println("$nomeCliente $nomecliente")
//    var a1 = juncao()
//    a1.b()
//    a1.a()
    val veiculo1 = object : veic{
        override fun veichuz() {
            println("Veiculo drivring")
        }

        override fun motociclist() {
           println("Motoclist drivring")
        }
    }
    veiculo1.veichuz()
    veiculo1.motociclist()
}