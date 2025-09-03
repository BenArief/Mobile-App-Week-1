package com.example.lab_week_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<TextInputEditText>(R.id.name_input)
        val emailInput = findViewById<TextInputEditText>(R.id.email_input)
        val submitButton = findViewById<Button>(R.id.submit_button)
        val resultText = findViewById<TextView>(R.id.result_text)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val studentNumber = emailInput.text.toString()

            resultText.text = "Hello my name is: $name\nStudent Number: $studentNumber"
        }
    }
}
