[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

EVENT MANAGEMENT SYSTEM (MVC & OOP)

## Problem Statement (max 150 words)

Management of multiple Events and Workshops manually at Campus or Workplaces often leads to errors and mismanagement. Hence, this Java-based system provides a structured way to track events using Object-Oriented principles, ensuring data integrity and a user-friendly interface.  

## Target User

The primary target users are Campus Event Coordinators and Student Club Leads. This application is designed to help them transition from manual record-keeping to a structured digital system, allowing for efficient tracking of various event types, including specialized workshops, while maintaining data integrity through input validation. 

## Core Features

- Dynamic Event Classification: Uses Inheritance to distinguish between general events and specialized workshops automatically based on user input.
- Professional Data Grid: Implements a JTable with a structured DefaultTableModel for a clean, spreadsheet-style data display instead of simple text areas.
- Input Validation & Robustness: Employs Regular Expressions (Regex) to enforce strict $DD/MM/YYYY$ date formats and prevents empty submissions using JOptionPane alerts.
- Real-time State Management: Synchronizes an ArrayList collection with the GUI, allowing users to add records and reset the system state instantly.

---

## OOP Concepts Used

- Abstraction: Used for the Event base class to represent the general idea of an Event.
- Inheritance: The Workshop class extends Event, inheriting its core properties.
- Polymorphism: Using a single ArrayList<Event> to store both Event and Workshop objects and overriding the toString() method.
- Exception Handling: Used JOptionPane and Regex to handle invalid date formats and empty inputs.
Used try-catch blocks with DateTimeParseException to handle invalid calendar dates
- Collections: Utilized ArrayList to manage dynamic data storage.

---

## Proposed Architecture Description

The application follows the Model-View-Controller (MVC) architectural pattern to ensure a clean separation between data logic and the user interface:

- Model Layer: Contains the core data structures (Event, Workshop). It handles data encapsulation and object-oriented logic using inheritance.

- View Layer (EventView): A Swing-based graphical interface that utilizes a JTable and DefaultTableModel for structured data presentation and user interaction.

- Controller Layer (EventController): Acts as the intermediary "brain." It manages the application flow, performs Regex-based validation , and handles Exceptions during data processing.


## How to Run

- Prerequisites: Ensure Java JDK 17 (or higher) and VS Code (with Extension Pack for Java) are installed.

- Clone the Repository: git clone https://github.com/MansiBishoy/term-ii-project-submission-MansiBishoy.git

- Open in VS Code: Open the folder and navigate to the src directory.

- Execute: Locate Main.java in the root or main package, right-click, and select Run Java.

- Alternative (Terminal):

javac -d bin src/**/*.java

java -cp bin main.Main

## Git Discipline Notes
This project was developed using a strict Atomic Commit Strategy to ensure a high-quality, traceable development lifecycle. Rather than bulk-uploading code, the project was built incrementally across 15 distinct commits.

Key Disciplines Followed:
Feature Branching & Synchronization: Regular use of git pull and git push to maintain a clean synchronization between the local development environment and the remote repository.

Atomic Commits: Each commit addresses a single logical change (e.g., separating the MVC structure setup from Regex validation logic).

Standardized Commit Messages: Used the Conventional Commits format to categorize changes:

feat: New functional features (e.g., Adding Workshop subclass).

fix: Critical bug fixes (e.g., Implementing STRICT date parsing for April 31st).

docs: Documentation updates (README, UML diagrams, Reports).

refactor: Code improvements without changing functionality.
