# candidate-assessment
# Overview
The Mini Candidate Assessment Platform is a simple web application that allows admin  to create questions, candidates to attempt the questions, and store scores for each candidate. The platform also provides the ability to generate reports of candidates' performance.
# Features
# Admin Functionality:

POST /admin/questions: Create new multiple-choice questions.

GET /admin/questions: View all existing questions.

Candidate Functionality:

GET /quiz: Get a random set of 5 questions to attempt.

POST /submit: Submit answers for the quiz. The system will auto-calculate the score based on the correct answers.

Score & Report:

POST /register: Register a new candidate with a name and email, and generate a user ID.

GET /quiz/userId: Fetch the report for a given candidate, including their score and submission time.

# Authentication:

HTTP Basic Authentication is used for Admin and Candidate roles

# Tech Stack
Backend: Java, Spring Boot

Database: PostgreSQL

Authentication: HTTP Basic Authentication
