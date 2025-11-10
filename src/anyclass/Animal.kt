package anyclass

 open class Animal(Color: String) {

     fun comer(){
         println("Seu animal está comendo")
     }
}

class dog(color: String): Animal(color){

    fun late(){
        println("Seu cão está latindo")
    }

}
class cat(color: String): Animal(color){

    fun miauzinhgo(){
        println("Seu gato está miando")
    }
}