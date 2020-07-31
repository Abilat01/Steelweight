package com.abilat01.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener { //наследуемся

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener (this) //привязка к конкретному RecyclerView
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.id_raz -> Toast.makeText(this, "Разминка", Toast.LENGTH_LONG).show()
            R.id.id_program -> Toast.makeText(this, "Программы", Toast.LENGTH_LONG).show()
            R.id.id_exercises -> intentExercisesMainGo()
            R.id.id_info -> intentInfoActivity()
            R.id.id_exit -> finish() //первый из 5 готов)
        }

        return true
    }



    fun intentInfoActivity(){
        val intentGo = Intent(this, ActivityInfo::class.java)
        startActivity(intentGo)
    }

    fun intentExercisesMainGo(){
        val intenGoEx = Intent(this, ExercisesMain::class.java)
        startActivity(intenGoEx)
    }

}