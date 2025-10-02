package estudoopp.exercocopcjar

class CharGeneretion(
   val min: Char,
  val   max: Char
) {


    fun next() =  (min..max).random()
}