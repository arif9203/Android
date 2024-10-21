package com.example.app8passdata

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)

        val custOrder = findViewById<TextView>(R.id.textView)
        custOrder.text = "Oder placed "+orderOfCustomer.toString()

    }
}