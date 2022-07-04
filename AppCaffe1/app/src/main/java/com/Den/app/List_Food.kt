package com.Den.app

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class List_Food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)
        var listView = findViewById<ListView>(R.id.ListView)
        var list = mutableListOf<Model>()
        list.add(Model("chicken", "Rp 14.000", R.drawable.chicken))
        list.add(Model("Roti bakar", "Rp 13.000 ", R.drawable.roti_bakar))
        list.add(Model("Pisang goreng", "Rp 10.000", R.drawable.pisang_goreng))
        list.add(Model("kentang goreng", "Rp 10.000", R.drawable.kentang_goreng))
        list.add(Model("kue", "Rp 12.000", R.drawable.kue1))

        listView.adapter = MyAdapter(this, R.layout.row, list)
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@List_Food, "Anda memilih Chicken", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 1) {
                Toast.makeText(this@List_Food, "Anda memilih Roti bakar", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 2) {
                Toast.makeText(this@List_Food, "Anda memilih Pisang goreng", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 3) {
                Toast.makeText(this@List_Food, "Anda memilih kentang goreng", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 4) {
                Toast.makeText(this@List_Food, "Anda memilih Samsung kue", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }
}
