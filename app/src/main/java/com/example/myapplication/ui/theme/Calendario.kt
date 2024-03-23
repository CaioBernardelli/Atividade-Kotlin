package com.example.myapplication.ui.theme

import java.util.Calendar

class Calendario {
    private var data : Calendar = Calendar.getInstance()


    fun diaDASemana(): String{
        val dias = arrayListOf("Domingo","Segunda","Terça","Quarta","quinta","Sexta","sabado")

    return dias[this.data.get(Calendar.DAY_OF_WEEK_IN_MONTH)]

    }
}