package com.example.practical3_125_b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class activity1 : AppCompatActivity() {
    lateinit var editText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        editText = findViewById(R.id.edit1)
        val intent = getIntent()

        editText.text = intent.getStringExtra("Main")
    }
}