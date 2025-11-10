package Calculadora

class calculadoraD(var digito1: Double, var digito2: Double, var operacao: String) {





    fun calculos(): Double{

        if (operacao == "*"){
            return digito1 * digito2
        }

        if (operacao == "+"){

            return digito1 + digito2
        }

        if (operacao == "%"){

            return digito1 % digito2
        }

        if (operacao == "/"){

            return digito1 / digito2
        }else{
            return 0.0
        }


    }


}


