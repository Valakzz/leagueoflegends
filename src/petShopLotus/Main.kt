package petShopLotus

fun main() {


    val telaprinci = TelaPrinci()
    telaprinci.telaPrincipal()












}

class TelaPrinci(){
    val cadastro = CadrastaUsuario()

    fun telaPrincipal(){
        var op: Int
        do {
            println("""
        Bem vindo ao Painel de registro do Petshop Lotus🐶
        =================================================
        1. Area do Cliente
        2. Area do Administratrivo Petshop
        3. Usuarios Cliente
    """.trimIndent())
            op = readln().toInt()



            when (op){
                1 ->{cadastro.cadrastroUsUARIO()}
                3 ->{
                    listaUsuarios.listaUsuarios() }
            }
        }while (op != 5)}}