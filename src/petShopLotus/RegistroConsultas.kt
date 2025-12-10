package petShopLotus

abstract class RegistroConsultas(
   private val nomeAnimal: String,
   private val RacaAnimal: String,
    private var dataConsulta: String,
   private var Horarioonsulta: String,
    private val observacaso: String

) {
}

class Cachorro(
   private val nomeCachorro: String,
   private val racaCachorro: String,
    private var dataConsulta: String,
    private var horarioonsulta: String,
    private val observacaso: String

): RegistroConsultas(nomeCachorro,racaCachorro,dataConsulta,horarioonsulta,observacaso){


}