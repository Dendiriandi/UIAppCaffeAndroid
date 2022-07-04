package com.Den.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutFood.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity, List_Food::class.java)
            startActivity(intent)
        }

        layoutDrink.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity, List_Drink::class.java)
            startActivity(intent)
        }
    }
}