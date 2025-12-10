package petShopLotus

abstract class Usuario(
   protected val nome: String? = null ,
   protected val senha: String? = null
) {

    fun infoUsuarios(): String{

            return "Nome: ${this.nome}nome e Senha: ${this.senha}"

    }


}

class UsuarioCastratos(nome: String, senha: String): Usuario(nome, senha)
class CadrastaUsuario(){


    fun cadrastroUsUARIO(): Usuario{
        println("Digite o usuario que deseja colocar")
        val nomeUsuario = readln()
        println("Digite a senha que deseja colocar")
        val senhaUsuario = readln()
        val novoUsuario = UsuarioCastratos(nomeUsuario, senhaUsuario)
        listaUsuarios.adicionarUsuario(novoUsuario)
        println("Usuario: $nomeUsuario senha: $senhaUsuario Registrado com sucesso ")
        return UsuarioCastratos(nomeUsuario, senhaUsuario)


    }

}





object listaUsuarios{
    val list = mutableListOf<Usuario>()

    fun listaUsuarios(){
        if (list.isEmpty()){
            println("Nenhum Usuario cadastrado")
        }else{
            list.forEach { println(it.infoUsuarios()) }
        }
    }

    fun adicionarUsuario(usuario: Usuario){
        list.add(usuario)
    }

}
