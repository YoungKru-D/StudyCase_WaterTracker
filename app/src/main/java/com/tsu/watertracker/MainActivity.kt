package com.tsu.watertracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.watertracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            var currentValue: Int = binding.drunkValue.text.toString().toInt()
            binding.drunkValue.text = (currentValue + 250).toString()
            when (binding.drunkValue.text = 3000){
                val intent = Intent (this, SecondActivity::class.java)
                startActivity(intent)
            }

        }
        binding.button1.setOnClickListener{
            var currentValue: Int = binding.waterValue.text.toString().toInt()
            binding.waterValue.text = (currentValue - 250).toString()
        }
    }
}