package Revisao3

open class Midia(var titulo: String?, var autor: String?){

    open fun info(){
        if (titulo == null && autor == null){
            println("Nenhum tituto ou autor foi escolhido")
        }else{
            println("""
        Titulo: $titulo
        Autor: $autor
    """.trimIndent())
        }

    }
}
class Livro: Midia{
    var numerop: Int
    constructor(titulo: String, autor: String, numeroPaginas: Int):super(titulo,autor){
        this.numerop = numeroPaginas
    }
    override fun info() {
        super.info()
        println("Numero de Paginas: $numerop")
    }
}
class filme: Midia{
    var numerop: Double
    constructor(titulo: String, autor: String, duracao: Double):super(titulo,autor){
        this.numerop = duracao
    }

    override fun info() {
        super.info()
        println("Duração do filme: $numerop")
    }

}
class musica: Midia{
    var numerop: Int
    constructor(titulo: String, autor: String, duracao: Int):super(titulo,autor){
        this.numerop = duracao
    }
    override fun info() { super.info()
        println("Duração da musica: $numerop") }
}

fun main() {

    var livro = Midia(null,null)
    livro.info()
   livro = filme("As Cronicas de Narnia","Sla",2.45)
    livro.info()
    livro = musica("Cherry", "Lana Del Rel", 58)
    livro.info()
}