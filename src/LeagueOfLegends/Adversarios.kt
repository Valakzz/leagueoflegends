package LeagueOfLegends

class Adversarios {


    companion object{
        var inimigoEsc: String? = null
            private set


        fun sempersonagem(){
            inimigoEsc = null
        }
        fun chamarpersonage(){
            Adversarios.inimigoEsc =  Adversarios.campeoes.random()
        }

        val campeoes = mutableListOf(
            "Lissandra",
            "Yasuo",
            "Ahri",
            "Thresh",
            "Zed",
            "Lux",
            "Garen",
            "Riven",
            "Ekko",
            "Morgana"
        )
        var vidaInimigo: Int = 100
    }
}