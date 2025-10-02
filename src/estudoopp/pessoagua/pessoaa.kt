package estudoopp.pessoagua

class pessoaa(
    private var Inicialdistanttruewalther: Int = 5000
) {

    private  var distancia = 0
    var distanttruewalther: Int = 5000


    fun caminhar(){

        if (distanttruewalther > 0){
            distancia += 1000
            distanttruewalther -= 1000
        }else if ( distanttruewalther == 0){
            println("Voce precisa tomar algo")
        }


    }





    fun end() = "A pessoa andou $distancia"

    fun tomaragua(){
        distanttruewalther = Inicialdistanttruewalther
        println("Você tomou agua")


    }




    }


