# Online Voting System

An online voting system built with Java Servlets, HTML, CSS, and JavaScript for the frontend, and MySQL for the backend. This project allows users to register, log in, vote for candidates, and view voting results.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [License](#license)

## Features
- User Registration and Login
- Voting for Candidates
- Viewing Voting Results
- Simple and User-Friendly Interface

## Technologies Used
- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java Servlets
- **Database:** MySQL

## Project Structure
online-voting-system/
├── src/
│ ├── com/
│ │ └── voting/
│ │ ├── LoginServlet.java
│ │ ├── RegisterServlet.java
│ │ ├── VoteServlet.java
│ │ └── ResultServlet.java
├── WebContent/
│ ├── index.html
│ ├── vote.html
│ ├── results.html
│ ├── styles/
│ │ └── styles.css
│ ├── scripts/
│ │ └── app.js
│ ├── images/
│ │ └── logo.png
│ ├── WEB-INF/
│ │ └── web.xml
└── backend/
└── database.sql

## Setup Instructions

### Prerequisites
- JDK 8 or later
- Apache Tomcat
- MySQL

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/<Sriram-Poojitha>/Online-Voting-System.git
   cd Online-Voting-System
   Set up the MySQL database:

Open backend/database.sql in a MySQL client and execute the script to create the database and tables.
Configure the database connection:

Update the database connection details in your servlet code (LoginServlet.java, RegisterServlet.java, VoteServlet.java, ResultServlet.java).
Deploy the project on Tomcat:

Copy the project directory to the webapps directory of your Tomcat installation.
Start the Tomcat server.
Access the application:

Open a web browser and go to http://localhost:8080/online-voting-system.

