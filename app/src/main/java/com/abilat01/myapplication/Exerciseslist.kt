package com.abilat01.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerciseslist.*

class Exerciseslist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerciseslist)

        val exerciseslistData1 = ExerciseslistData("Описание", "Тут текс описывающий то самое", R.drawable.fitness_gym)
        val exerciseslistData2 = ExerciseslistData("Описание", "Это просто черный макет", R.drawable.athletic)
        val exerciseslistData3 = ExerciseslistData("Описание", "Просто протатип", R.drawable.hardworker)
        val exerciseslistData4 = ExerciseslistData("Описание", "Но времени мало", R.drawable.healthy_strong)
        val exerciseslistData5 = ExerciseslistData("Описание", "Да и я пока лучше не умею(", R.drawable.fitness_gym)

        val listProduct = listOf(exerciseslistData1, exerciseslistData2, exerciseslistData3, exerciseslistData4, exerciseslistData5)

        val adapter = ExercisesAdapter(this, listProduct)

        list_view.adapter = adapter




    }
}