package com.example.akshayparmar.practicle2button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference to the Button
        val button = findViewById<Button>(R.id.button)
        var textbox = findViewById<EditText>(R.id.editText)
        var button1 = findViewById<Button>(R.id.button2)
        var textview = findViewById<TextView>(R.id.textView6)

        //Set on-click listener
        button.setOnClickListener {
            Toast.makeText(applicationContext, "You Click the Button", Toast.LENGTH_LONG).show()
        }

        fun showtext(){
                if(textbox != null) {
                    Toast.makeText(applicationContext, textbox.text, Toast.LENGTH_LONG).show()
            }
        }

        button1.setOnClickListener {
            showtext()
        }

        textbox.setOnClickListener {
               textview.setText(textbox.text)
             }

        textbox.addTextChangedListener()

    }
}

private fun TextView.addTextChangedListener() {
       textView6.setText(textbox.text)
    
}
