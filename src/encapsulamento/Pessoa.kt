package Encapsulamento

class Pessoa {
    var nome = "Desconhecido"
        set(value){
            if(value.isNotBlank())
                field = value;
            else
                println("Nome invalido!");
        }
        get(){
            return field.split(" ").joinToString(" ")  { it.replaceFirstChar { it
                .uppercase()} }}

        }

    var idade = 0
        private set

    fun fazerAniversario()
    {
        idade++;
    }
