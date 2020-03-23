package com.example.simplecountermobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UI Elements
        val countView: TextView = findViewById(R.id.countView)
        val incrementButton: Button = findViewById(R.id.incrementButton)

        // Initial setup
        var count: Int = 0;
        countView.text = count.toString()

        // Event handler
        incrementButton.setOnClickListener {
            count++
            countView.text = count.toString()
        }
    }
}
