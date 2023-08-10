package com.example.practical3_125_b6
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.textview1)
    }

    fun Call(view: View) {
        val intent = Intent(this,activity1::class.java)
        var message = editText.text.toString()
        intent.putExtra("Main",message)
        startActivity(intent)
    }
}
