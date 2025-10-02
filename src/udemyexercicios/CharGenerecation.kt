package udemyexercicios

class CharGenerecation(var min: Char, var max: Char) {

    fun next() =  (min..max).random()
}