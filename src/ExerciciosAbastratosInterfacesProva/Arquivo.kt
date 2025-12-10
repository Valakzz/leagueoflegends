package ExerciciosAbastratosInterfacesProva

abstract class Arquivo(val nomeAquivo: String) {

    abstract fun abrir ()
    fun mostrarinfo() = println("nome do arquivo é $nomeAquivo")
}

class ArquivoTexto(nome: String): Arquivo(nome){
    override fun abrir() {
        println("Abrindo seu arquivo")
    }

}

class ArquivoImagem(nome: String): Arquivo(nome){
    override fun abrir() {
        println("Abrindo seu arquivo")
    }

}

fun main() {
    val arquivo1 = ArquivoTexto("Box da alice")
    arquivo1.abrir()
    arquivo1.mostrarinfo()
    val arquivo2 = ArquivoImagem("Print personagem novo lol")
    arquivo2.abrir()
    arquivo2.mostrarinfo()
}