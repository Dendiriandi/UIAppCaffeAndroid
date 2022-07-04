package com.Den.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class List_Drink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_drink)

        var listView = findViewById<ListView>(R.id.ListView2)
        var list = mutableListOf<Model>()
        list.add(Model("Macchiato", "Rp 17.000", R.drawable.macchiato))
        list.add(Model("Hot Chocolate", "Rp 16.000 ", R.drawable.hot_coklat))
        list.add(Model("Flavoure Soda", "Rp 16.000", R.drawable.flavouredsoda))
        list.add(Model("Fruit Juice", "Rp 10.000", R.drawable.fruit_juice))
        list.add(Model("Ice Drink Moccacino", "Rp 17.000", R.drawable.icedrink))

        listView.adapter = MyAdapter(this, R.layout.row, list)
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@List_Drink, "Anda memilih Mocchiato", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 1) {
                Toast.makeText(this@List_Drink, "Anda memilih Hot Chocolate", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 2) {
                Toast.makeText(this@List_Drink, "Anda memilih Flavoure Soda", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 3) {
                Toast.makeText(this@List_Drink, "Anda memilih Fruite Juice", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 4) {
                Toast.makeText(this@List_Drink, "Anda memilih Ice Drink Moccacino", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }
}

