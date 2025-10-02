package ExeciciosUdemy

import javax.swing.text.StyledEditorKit
import kotlin.random.Random

fun main(){

    
}

fun VerificadorIdade(){
    println("Digite seu Nome")
    var nome = readln()
    println("Digite sua idade")
    val idade = readln().toInt()
    println("Digite seu peso")
    val peso = readln().toDouble()

    println("Olá $nome sua idade é $idade e seu peso é $peso")

}

fun DecimalParaIntn() {
//    println("Digite o valor")
//    val numero = readln().toDouble().toInt()
//    print(numero)
//

}

fun ValorMultiplicado(){

    /**
    Escreva um programa que receba um numero e multiplique por ele mesmo e imprima o resultado
        Entretando se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes de ser multiplicado

    **/
     println("Digite o numero que deseja ")
    var Numero = readln().toInt()
    if (Numero > 10){
        Numero = 10
        Numero *= Numero
        println("O multiplicador do numero é $Numero")
    }else{
        println("O multiplicador de Numero é $Numero")
    }

    }

fun ClasificacaoIdade(){
/*
Faça um programa que com base na idade de uma pessoa classificar a pessoa nos grupos abaixoa
criança 0 a 12 anos
Adolecente 13 a 17
Adulto 18 a 65
Idoso 65+
 */
    val idade = readln().toInt()
//    if (Idade >= 0 && Idade <= 12 ){
//        println("Olá $Idade você é uma criança")
//    }else if (Idade >= 13 && Idade <= 17){
//        println("Olá $Idade você é um adolecente")
//    }else if (Idade >= 18 && Idade <= 65){
//        println("Olá $Idade Você é um adulto")
//    }else if (Idade < 0){
//        println("Idade invalida")
//    }else{
//        println("Olá $Idade você é um idoso")
//    }
    when(idade) {
//        idade >= 0 && idade <= 12 -> println("Você é uma criança")
//        idade >= 12 && idade <= 18 -> println("Você é um adolescente ")
       in 18..65 -> println("Você É um adulto")
    }
}

fun calculadora(){

    println("Digite primeiro numero")
    val v1 = readln().toDouble()

    println("Digite a operação que deseja ")
    val op = readln()[0]

    println("Digite Segundo numero")
    val v2 = readln().toDouble()

  val r =   when(op){

      '+' -> v1 + v2
        '*' -> v1 * v2
        '-' -> v1 - v2
       '/' -> v1 / v2
        else -> "Opção invalid "
    }
    println(r)

}

fun tabuada(){
    val n1 = readln().toInt()
    val multiplicacao = readln().toInt()
    var i = 1
    while (i <= multiplicacao){
        println("$n1 x $i ${n1 * i++}")

    }
}

fun NomeAleatorio(){
    val secret = Random.nextInt(0,100)

    var n = 0

    while(true){
        print("> ")
        n = readln().toInt()
        when{
            n > secret -> println("O numero é menor")
            n < secret -> println("O numero é maior")
            else -> { println("Parabéns você achou o Numero é $n")
                break}



        }

    }


}

fun senhaNova(){
    print("Digite a senha que deseja -> ")
    var Senhaa: String?  = null
    val defaultpassword = "1234"
    val mas = "".padEnd(Senhaa?.length ?: defaultpassword.length,'*')

    print(mas)




}

fun NumeroMultplicacao(){
    /* Times ele muiltiplica e o minus subtrai  */
    val x = readln().toIntOrNull()?: 2.times(2).times(2).minus(10)
    print(x)

}

fun EspacoBranco(Str: String, isUppercaser: Boolean = false): String{
    val sb = StringBuilder()

    for (c in Str){
        sb.append("$c ")
    }
 val  r =  sb.toString()
   return  if (isUppercaser){
         r.uppercase()
    }else{
        r
    }
    }




