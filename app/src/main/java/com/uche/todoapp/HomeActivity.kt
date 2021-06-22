package com.uche.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        intent

        usernameDisplay = findViewById(R.id.usernameDisplay)
        usernameDisplay.text = intent.getStringExtra("username")
    }
}