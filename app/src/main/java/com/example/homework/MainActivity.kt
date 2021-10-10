package com.example.homework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val UpperText = findViewById<EditText>(R.id.TextUp)

        val LowerText = findViewById<EditText>(R.id.TextDown)

        val buttonButtonv = findViewById<Button>(R.id.buttonButton)

        buttonButtonv.setOnClickListener {
            val text1 = UpperText.text.toString()
            val text2 = LowerText.text.toString()

            Toast.makeText(this, "Вы ввели $text1 , $text2, но зачем?", Toast.LENGTH_LONG).show()
        }
    }
}