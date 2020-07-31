package com.abilat01.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_scroll.*

class ListScroll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_scroll)


        val test = arrayListOf<Eximple>()
        test.add(Eximple("name","test",R.drawable.ic_info))
        test.add(Eximple("name","test2",R.drawable.ic_raz))
        test.add(Eximple("name","test3",R.drawable.healthy_strong))
        test.add(Eximple("name","test4",R.drawable.fitness))
        test.add(Eximple("name","test5",R.drawable.ic_workout))
        test.add(Eximple("name","test6",R.drawable.ic_exit))
        val id = intent.getIntExtra("id",0)

        number_product.text = test[id].description
        number_oper.text = test[id].info
        image_product.setImageResource(test[id].imege_info)
    }
}