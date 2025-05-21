package com.example.flashcardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

/**
 * FlashcardActivity handles displaying questions, recording user answers,
 * providing feedback, and calculating scores.
 */
class FlashcardActivity : AppCompatActivity() {

    // Title: Declarations
    // Author: Kotlin programming logic
    // Version: 1.0
    // Available: https://kotlinlang.org/spec/declarations.html

    // Declare UI elements
    private lateinit var questionTextView: TextView
    private lateinit var feedbackTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button

    // Title: Arrays
    // Author:W3schools
    // Version: 1.0
    // Available: https://www.w3schools.com/programming/prog_arrays.php

    // Arrays for questions and answers
    private val questions = arrayOf(
        "The Union of South Africa was formed in 1910.",
        "Shaka KaSenzangakhona was the founder of the Zulu Kingdom.",
        "The Boer Wars were fought between the Boers and the French.",
        "Apartheid laws were first introduced in the 1980s.",
        "Nelson Mandela was released from prison in 1990."
    )

    private val answers = arrayOf(true, true, false, false, true)

    // Title: Variables
    // Author:W3schools
    // Version: 1.0
    // Available: https://www.w3schools.com/java/java_variables_print.asp

    // Variables to track progress
    private var currentQuestionIndex = 0
    private var score = 0
    private var answerSelected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        // Initialize UI elements
        questionTextView = findViewById(R.id.questionTextView)
        feedbackTextView = findViewById(R.id.feedbackTextView)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextButton = findViewById(R.id.nextButton)

        // Initially hide feedback and disable next button
        feedbackTextView.visibility = View.INVISIBLE
        nextButton.isEnabled = false

        // Set click listeners for buttons
        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }
        nextButton.setOnClickListener { moveToNextQuestion() }

        // Display the first question
        displayQuestion()
    }

    /**
     * Displays the current question on the screen
     */
    private fun displayQuestion() {
        questionTextView.text = questions[currentQuestionIndex]
        feedbackTextView.visibility = View.INVISIBLE
        trueButton.isEnabled = true
        falseButton.isEnabled = true
        nextButton.isEnabled = false
        answerSelected = false
    }

    // Title: Kotlin If ... Else
    // Author: w3schools
    // Version: 1.0
    // Available: https://www.w3schools.com/programming/prog_if.php

    /**
     * Checks if the user's answer is correct and provides feedback
     */
    private fun checkAnswer(userAnswer: Boolean) {
        // Prevent multiple answers
        if (answerSelected) return

        answerSelected = true
        val correctAnswer = answers[currentQuestionIndex]

        if (userAnswer == correctAnswer) {
            feedbackTextView.text = getString(R.string.correct_answer)
            score++
        } else {
            feedbackTextView.text = getString(R.string.incorrect_answer)
        }

        // Show feedback and enable next button
        feedbackTextView.visibility = View.VISIBLE
        trueButton.isEnabled = false
        falseButton.isEnabled = false
        nextButton.isEnabled = true
    }

    /**
     * Moves to the next question or to the score screen if all questions are answered
     */
    private fun moveToNextQuestion() {
        currentQuestionIndex++

        if (currentQuestionIndex < questions.size) {
            displayQuestion()
        } else {
            // All questions answered, move to score screen
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("SCORE", score)
            intent.putExtra("TOTAL_QUESTIONS", questions.size)
            startActivity(intent)
            finish() // Close this activity
        }
    }
}