package com.example.flashcardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * MainActivity serves as the entry point for the application.
 * It displays a welcome message and a button to start the flashcard quiz.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Title: Variables
        // Author:W3schools
        // Version: 1.0
        // Available: https://www.w3schools.com/java/java_variables_print.asp

        // Initialize the Start button and set its click listener
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            // Create an intent to start the FlashcardActivity
            val intent = Intent(this, FlashcardActivity::class.java)
            startActivity(intent)
        }
    }
}