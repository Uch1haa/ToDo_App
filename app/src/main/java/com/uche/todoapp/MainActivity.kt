package com.uche.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.uche.todoapp.activities.HomeActivity

class MainActivity : AppCompatActivity() {
    val validUsername: String = "admin"
    val validPassword: String = "admin"

//layout variables
    private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText

    lateinit var submit_button:Button
    lateinit var signUp_button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput = findViewById(R.id.userNameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submit_button = findViewById(R.id.submit_button)
        signUp_button = findViewById(R.id.signUp_button)

        submit_button.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }

    }
    fun login(username: String,password: String,) {
        if (isValidCredentials(username, password)){
            val intent : Intent = Intent(this, HomeActivity :: class.java)
            intent.putExtra("username",username)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext, "invalid login",Toast.LENGTH_SHORT).show()
        }



    }
    private fun isValidCredentials(username: String,password: String,): Boolean{
        return(username == validUsername && password == validPassword)

    }

}