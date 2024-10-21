package com.example.app8passdata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.app8passdata.MainActivity.Companion.KEY
import com.google.firebase.database.FirebaseDatabase


class takeOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_order)

        val text1= findViewById<EditText>(R.id.tV1)
        val text2= findViewById<EditText>(R.id.tV2)
        val text3= findViewById<EditText>(R.id.tV3)
        val text4= findViewById<EditText>(R.id.tV4)
        val btnOrder = findViewById<Button>(R.id.button)

        btnOrder.setOnClickListener{

            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")

            val orderPlaced =text1.text.toString()+" , "+ text2.text.toString()+" ' "+
                    text3.text.toString()+" ' "+text4.text.toString()

            val intent = Intent(this, Order::class.java)
            intent.putExtra(KEY,orderPlaced)
            startActivity(intent)

        }

    }
}