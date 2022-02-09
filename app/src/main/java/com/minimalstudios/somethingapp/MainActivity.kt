package com.minimalstudios.somethingapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.minimalstudios.somethingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScreen.setOnClickListener {
            Toast.makeText(applicationContext, "Something", Toast.LENGTH_SHORT).show()
        }
    }
}