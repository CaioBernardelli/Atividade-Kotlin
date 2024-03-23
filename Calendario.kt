
import java.util.*

class Calendario {
    private var data: Calendar = Calendar.getInstance()
     fun diaDaSemana(): String{


         val dias = arrayListOF("Domingo","Segunda","Terça","quarta","Quinta","Sexta","Sabado")

         return dias[this.data.get(Calendar.Day_OF_WEEK_IN_MONTH)]
     }

}