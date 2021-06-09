package com.example.yosholimlar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val login = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.password)
        val text = findViewById<TextView>(R.id.textView)
        findViewById<Button>(R.id.button).apply{
            if (login.text.toString() == "sardor" && password.text.toString() == "sardor"){
                text.visibility = View.INVISIBLE
                startActivity(Intent(applicationContext,MainActivity2::class.java))
            }
            else{
                text.visibility = View.VISIBLE
            }
        }
    }
}