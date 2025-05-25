# History Flashcards Android App
  A native Android application built with Kotlin that allows users to test their knowledge of historical events using true/false flashcards.

## Project Overview
  This Android application implements a flashcard quiz system focusing on historical facts. Users answer a series of true/false questions, receive immediate feedback on their answers, and get a final score with personalized feedback based on their performance.

## Features
  •	Welcome Screen: Displays a brief description of the app and a welcome message with a "Start" button.
  •	Flashcard Questions: Five true/false history questions with immediate feedback.
  •	Score Tracking: Keeps track of correct answers.
  •	Score Screen: Displays the total score with personalized feedback based on performance.
  •	Review Functionality: Allows users to review all questions with their correct answers.
  •	Exit Option: Provides a clean way to exit the application.

## Screenshot

  ![image](https://github.com/user-attachments/assets/4dbb84db-5121-4323-b2f4-48616918311c)
  -Figure 1: Welcome Screen of Flash Card App.

  ![image](https://github.com/user-attachments/assets/345f280a-f647-41f2-8709-27d1ac0a3819)
  -Figure 2: This is the first page, it shows the question that the user has to answer. The user is given two options to choose from when answering (True/False).

  ![image](https://github.com/user-attachments/assets/6d558f36-da8e-4e6e-98e5-61e53b7e8f47)
  -Figure 3: Feedback “Correct” is a clear indication that the user has answered the question correctly. The user is now given the option of going to the next screen by clicking “Next”.

  ![image](https://github.com/user-attachments/assets/02ceb9fd-7440-49c9-83a2-db27c7e2c4d9)
  -Figure 4: Feedback “Incorrect” is a clear indication that the user has answered the question incorrectly.

  ![image](https://github.com/user-attachments/assets/8b5124e2-db5e-4165-a7a6-981ddbef2432)
  -Figure 5: This is the Score Screen, on this screen the user is given a score based on their responses on the previous screens. The user is also given feedback based on their score. On this screen the user is also given the option to review the answers or to exit the app.

  ![image](https://github.com/user-attachments/assets/b5a5b7b5-bdd0-436b-939c-375b7237f0b4)
  -Figure 6: This the review screen where the user is shown all the questions asked in this quiz and the correct responses.

## Technical Implementation

### Architecture
  The app follows a standard Android activity-based architecture:
    •	MainActivity: Entry point with welcome screen
    •	FlashcardActivity: Handles question display and answer processing
    •	ScoreActivity: Shows final results and feedback
    •	ReviewActivity: Provides review functionality

### Key Components

#### 1.	Parallel Arrays:
  o	Questions array stores the five history questions
  o	Answers array stores the corresponding boolean values (true/false)

#### 2.	User Interface:
  o	Consistent design across all screens
  o	Intuitive navigation between activities
  o	Clear feedback on user actions

#### 3.	Logic:
  o	Score calculation based on correct answers
  o	Personalized feedback based on score threshold
  o	Complete iteration through all questions
  
## Setup and Installation

### Prerequisites
  •	Android Studio Arctic Fox (2021.3.1) or newer
  •	Minimum SDK: API 21 (Android 5.0 Lollipop)
  •	Target SDK: API 33 (Android 13)

### Steps to Run
  1.	Clone the repository: https://github.com/Siphesihle-J/flashCardapp.git
  2.	Open the project in Android Studio:
    o	Launch Android Studio
    o	Select "Open an existing Android Studio project"
    o	Navigate to the cloned repository and select it
  3.	Build the project:
    o	Click "Build" > "Rebuild Project"
  4.	Run the application:
    o	Connect an Android device or use an emulator
    o	Click "Run" > "Run 'app'"

## CI/CD Integration
  This project includes GitHub Actions workflows for continuous integration:
    •	Automated building and testing on every push to main branch
    •	Code quality checks during pull requests

## Future Enhancements
  Potential improvements for future versions:
    •	User login/profile system
    •	Expanded question database
    •	Multiple quiz categories
    •	Difficulty levels
    •	Score history tracking
    •	Timed quiz mode

## References
  W3schools, 2025. Arrays (version 1.0) [source code]
  Available at: https://www.w3schools.com/programming/prog_arrays.php

  Kotlin programming logic, 2025. Declarations (version 1.0) [Source Code]
  Available at: https://kotlinlang.org/spec/declarations.html

  w3schools, 2025. Kotlin If ... Else (version 1.0) [source code]
  Available at: https://www.w3schools.com/programming/prog_if.php

  w3schools, 2025. Variables (version 1.0) [source code]
  Available at: https://www.w3schools.com/java/java_variables_print.asp

  Reddit, 2025. Image (version 1.0) [source code]
  Available at: https://preview.redd.it/r32y2vtrhvs31.jpg?auto=webp&s=d06b6001f49eb7b3ef0fd73900c3bc9eaad677be
 
  Pinterest, 2025. Image (version 1.0) [source code]
  Available at: https://i.pinimg.com/originals/e0/5a/0f/e05a0f50ef03d66a41cfb076f6b9fa98.jpg

  Pinterest, 2025. Image (version 1.0) [source code]
  Available at: https://th.bing.com/th/id/OIP.kkXUhDWWluofKFPem3NUiAAAAA?cb=iwc2&rs=1&pid=ImgDetMain


## Contact
  [St10479775 - Siphesihle Jali]
  
## Youtube Link
  https://youtube.com/shorts/KvZL5O8FTRI?si=DUhto0nRy7pU4BI5
  
https://github.com/Siphesihle-J/flashCardapp.git
