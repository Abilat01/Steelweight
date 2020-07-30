package com.abilat01.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.exercises_list_item.view.*
import kotlinx.android.synthetic.main.header_main_menu.view.*

class ExercisesAdapter(private val mContext: Context, private val listExercises: List<ExerciseslistData>) : ArrayAdapter<ExerciseslistData>(mContext, 0, listExercises){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.exercises_list_item, parent, false)

        val exercisesOne = listExercises[position]

        layout.tv_exercises.text = exercisesOne.namber
        layout.imageView.setImageResource(exercisesOne.image)

        return layout


    }

}