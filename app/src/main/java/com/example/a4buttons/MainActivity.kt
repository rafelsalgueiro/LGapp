package com.example.a4buttons

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4buttons.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val increaseButton = binding.Counterincrease
        val decreaseButton = binding.Counterdecrease
        val lgPage = binding.lgPage
        val colours = binding.colours

        increaseButton.setOnClickListener {
            val numCounter = binding.NumCounter.text
            binding.NumCounter.text = ( Integer.parseInt(numCounter.toString()) + 1 ).toString()
        }

        decreaseButton.setOnClickListener {
            val numCounter = binding.NumCounter.text
            binding.NumCounter.text = ( Integer.parseInt(numCounter.toString()) - 1 ).toString()
        }

        lgPage.setOnClickListener {
            val intent = Intent(this, MapViewer::class.java)
            startActivity(intent)
        }

        colours.setOnClickListener {
            val randomColor = Random
            val colour = Color.argb(255, randomColor.nextInt(256), randomColor.nextInt(256),randomColor.nextInt(256))
            colours.setBackgroundColor(colour)
            increaseButton.setBackgroundColor(colour)
            decreaseButton.setBackgroundColor(colour)
            lgPage.setBackgroundColor(colour)
        }

    }


}