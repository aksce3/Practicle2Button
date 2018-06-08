package com.example.akshayparmar.practicle2button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference to the Button
        val button = findViewById<Button>(R.id.button)

        //Set on-click listener
        button.setOnClickListener {
            Toast.makeText(applicationContext, "You Click the Button", Toast.LENGTH_LONG).show()
        }
    }
}
