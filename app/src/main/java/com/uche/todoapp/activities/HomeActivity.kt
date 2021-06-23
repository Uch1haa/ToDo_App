package com.uche.todoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.uche.todoapp.R


class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        intent
//to move to the next activity
        usernameDisplay = findViewById(R.id.usernameDisplay)
        usernameDisplay.text = intent.getStringExtra("username")
        profileButton = findViewById(R.id.profileButton)

        profileButton.setOnClickListener {
            openProfilePage()

        }
    }

    fun openProfilePage() {

            val intent : Intent = Intent(this, ProfileActivity :: class.java)

            startActivity(intent)

        }

    }