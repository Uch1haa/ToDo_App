package com.uche.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uche.todoapp.R
import com.uche.todoapp.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

   private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homebutton.setOnClickListener {
            val myIntent = Intent(this,HomeActivity :: class.java)
            startActivity(myIntent)
        }
    }
}