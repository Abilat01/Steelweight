package com.abilat01.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.header_main_menu.view.*
import kotlinx.android.synthetic.main.header_main_menu.view.imageView
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter(private val mContext: Context, private val listProduct: List<Product>) :
    ArrayAdapter<Product>(mContext, 0, listProduct) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.product_item, parent, false)

        val productIn = listProduct[position]

        layout.tv_main.text = productIn.namber
        layout.imageView.setImageResource(productIn.image)

            layout.setOnClickListener {
            var intentGo = Intent(context, ListScroll::class.java)

            intentGo.putExtra("id", position)
            context.startActivity(intentGo)
        }

        return layout
    }
}