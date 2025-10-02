package Condicionais




fun main() {



}

fun numeromaior(){
//1. Crie um programa leia dois números e mostre qual é o menor.
    val Numero1 = readln().toInt()
    val Numero2 = readln().toInt()
    if (Numero1 > Numero2){
        print("O numero 1 é maior")
    }else{
        print("O numero 2 é maior")
    }
}

fun numeroigualzero(){
//    2. Crie um programa leia um número e mostre se ele é menor, maior ou
//    igual à zero.

    val Numero = readln().toInt()
    if (Numero > 0){
        print("O numero é maior que zero")
    }else if (Numero == 0){
        print("O numero é zero")
    }else{
        print("O numero é menor que zero")
    }

}

fun NumeroDivisivel(){
    val Numero = readln().toInt()
    if (Numero  %3 == 0){
        print("O numero é divisivel por 3")
    }else{
        print("O numero não é divivel por 3")
    }
}



fun IdadeMaior(numero: Int){

    if (numero > 18){
        print("Você é de maior")
    }else{
        print("Você É DE MENOR")
    }

}

fun NumerosTresMaiores(){
//    5. Crie um programa leia três números e mostre o maior deles.
    var result = 0

    val Numero1 = readln().toInt()
    val Numero2 = readln().toInt()
    val Numero3 = readln().toInt()
    if (Numero1 > Numero2){
        result = Numero1
    }else if (Numero2 > Numero3){
        result = Numero2
    }else if (Numero3 > result){
         result = Numero3
    }
    println("O numero maior é $result")




}

fun NumeroEntre0E10(){
    val numero = readln().toInt()
    if (numero > 0 && numero < 10){
        print("Sim")
    }else{
        print("Não")
    }
}