package com.example.flashcardapp

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

/**
 * ReviewActivity displays all questions with their correct answers for review.
 */
class ReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        // Arrays for questions and answers (same as in FlashcardActivity)
        val questions = arrayOf(
            "The Union of South Africa was formed in 1910.",
            "Shaka KaSenzangakhona was the founder of the Zulu Kingdom.",
            "The Boer Wars were fought between the Boers and the French.",
            "Apartheid laws were first introduced in the 1980s.",
            "Nelson Mandela was released from prison in 1990."
        )

        val answers = arrayOf(true, true, false, false, true)

        // Get reference to linear layout that will hold questions and answers
        val reviewLinearLayout = findViewById<LinearLayout>(R.id.reviewLinearLayout)

        // Add each question and its answer to the layout
        for (i in questions.indices) {
            val questionTextView = TextView(this)
            questionTextView.text = getString(R.string.review_question, i + 1, questions[i])
            questionTextView.textSize = 20f
            questionTextView.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            questionTextView.setTextColor(ContextCompat.getColor(this, R.color.white)) // Changed text color to white for readability against black background
            questionTextView.setTypeface(null, Typeface.BOLD)
            questionTextView.setPadding(0, 16, 0, 8)
            reviewLinearLayout.addView(questionTextView)

            val answerTextView = TextView(this)
            val answerText = if (answers[i]) "True" else "False"
            answerTextView.text = getString(R.string.review_answer, answerText)
            answerTextView.textSize = 20f
            answerTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            answerTextView.setTypeface(null, Typeface.BOLD)
            answerTextView.setPadding(32, 0, 0, 24)
            reviewLinearLayout.addView(answerTextView)
        }

        // Set click listener for back button
        val backButton = findViewById<Button>(R.id.backToScoreButton)
        backButton.setOnClickListener {
            finish() // Go back to the previous screen
        }
    }
}