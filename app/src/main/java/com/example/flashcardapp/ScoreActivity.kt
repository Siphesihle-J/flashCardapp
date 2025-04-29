package com.example.flashcardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * ScoreActivity displays the final score and provides options to review answers or exit.
 */
class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        // Get score from intent
        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 5)

        // Initialize UI elements
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val feedbackTextView = findViewById<TextView>(R.id.scoreFeedbackTextView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Display score
        scoreTextView.text = getString(R.string.score_display, score, totalQuestions)

        // Provide feedback based on score
        if (score >= 3) {
            feedbackTextView.text = getString(R.string.high_score_feedback)
        } else {
            feedbackTextView.text = getString(R.string.low_score_feedback)
        }

        // Set click listeners for buttons
        reviewButton.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity() // Close all activities and exit the app
        }
    }
}