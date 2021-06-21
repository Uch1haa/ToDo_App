package com.uche.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val username: String = "admin"
    val password: String = "admin"

    private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText
    lateinit var emailInput: EditText
    lateinit var smallText: EditText
    lateinit var submit_button:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}