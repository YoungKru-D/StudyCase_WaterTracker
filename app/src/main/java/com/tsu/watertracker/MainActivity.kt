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

        var drink = 3000
        var drunk = 0

        binding.button1.setOnClickListener{
            drink -=250
            drunk +=250

            binding.drunkValue.text = "0"

            var drunkingValue: Int = binding.drunkValue.text.toString().toInt()
            binding.drunkValue.text = (drunk).toString()

            var drinkingValue: Int = binding.waterValue.text.toString().toInt()
            binding.waterValue.text = (drink).toString()

            if (drink == 0){
                val intent = Intent (this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}