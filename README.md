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
- Collections: Utilized ArrayList to manage dynamic data storage.

---

## Proposed Architecture Description

The application follows the Model-View-Controller (MVC) architectural pattern to ensure a clean separation between data logic and the user interface:

- Model Layer: Contains the core data structures (Event, Workshop). It handles data encapsulation and object-oriented logic using inheritance.

- View Layer (EventView): A Swing-based graphical interface that utilizes a JTable and DefaultTableModel for structured data presentation and user interaction.

- Controller Layer (EventController): Acts as the intermediary "brain." It manages the application flow, performs Regex-based validation, and handles Exceptions during data processing.

## How to Run

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
