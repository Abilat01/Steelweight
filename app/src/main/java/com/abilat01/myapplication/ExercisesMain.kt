package com.abilat01.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercises_main.*

class ExercisesMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises_main)

        val product = Product("Белая вдова",  "Белая вдова", R.drawable.athletic)
        val product2 = Product("Ак 47", "Ак 47", R.drawable.fitness)
        val product3 = Product("Амнезия", "Амнезия", R.drawable.fitness_gym)
        val product4 = Product("Чистое поле",  "Чистое поле", R.drawable.healthy_strong)
        val product5 = Product("Сорняк",  "Сорняк", R.drawable.hardworker)
        val product6 = Product("Дезерт ИГЛ",  "Дезерт ИГЛ", R.drawable.ic_raz)

        val listProduct = listOf(product, product2, product3, product4, product5, product6)

        val adapter = ProductAdapter(this, listProduct)

        list_view.adapter = adapter
    }
}