package ArrayAds

fun main() {



//    val numeros = Array(4){0}
//
//    println("Digite um numero")
//     numeros[0] = readln().toInt()
//    numeros[1] = readln().toInt()
//    numeros[2] = readln().toInt()
//    numeros[3] = readln().toInt()
//    numeros.reverse()
//    print(numeros.joinToString())


    val numeros = Array(7){it + 1}

    for (y in numeros){

        for (x in y downTo 1){
             println("$x")
        }


    }
}