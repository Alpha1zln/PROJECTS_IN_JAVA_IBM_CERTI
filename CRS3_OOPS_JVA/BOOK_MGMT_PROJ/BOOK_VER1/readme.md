## 📚 Book Management System (Java Project)

### 📌 Project Overview

The Book Management System is a simple Java-based console application designed to manage books efficiently. It allows users to add books, view book details, and compare prices using index-based selection.

This project is useful for beginners to understand:
Object-Oriented Programming (OOP)
Class interaction
Basic data handling in Java

**************************************************

### 🧱 Project Structure
BOOK_PROJ/
│
└── src/
    ├── Book.java
    ├── BookAccess.java
    └── BookMenu.java

**************************************************

### 📂 File Descriptions

#### 1️⃣ Book.java
Represents a Book entity
Contains attributes:
title → Name of the book
author → Author name
price → Price of the book

Includes:
Constructor
Getters & Setters
toString() method (for display)

#### 2️⃣ BookAccess.java
Contains business logic methods
Main functionality:
Compare price of two books
Example feature:
comparePrices(Book book1, Book book2)
Compares prices and shows which book is cheaper or expensive

Search book // ver 2, 3, 4

#### 3️⃣ BookMenu.java
Acts as the main driver class (UI layer)
Provides menu-based interaction:
📖 View all books
➕ Add a new book
💰 Compare prices using index

Handles:
User input
Calling methods from BookAccess
Managing list/collection of books

**************************************************

### ⚙️ Features
✔ Add new books
✔ View all books
✔ Compare book prices using index
✔ Simple console-based UI
**************************************************

### 🛠️ Technologies Used
Java (Core Java)
OOP Concepts
Array - Create an array to store Book objects (for storing books)
**************************************************

### ▶️ How to Run
Compile all files:
javac src/*.java

Run the main class:
java src.BookMenu
**************************************************

#### 📌 Sample Flow
1. Add Book
2. View Books
3. Compare Prices
Any other no. to Exit
**************************************************

### 🎯 Learning Outcomes
Understanding class separation (Model, Logic, UI)
Practicing method calling between classes
Learning basic menu-driven programs
Hands-on with ArrayList and indexing
**************************************************

#### 🚀 Future Improvements
Add search functionality 🔍
Update/Delete book feature ✏️
File/database storage 💾
GUI using JavaFX/Swing 🎨
**************************************************


#### 👨‍💻 Author
* alpha1zln
* Developed as part of IBM Java learning project
**************************************************

⭐ Note
This is a beginner-friendly project aimed at strengthening core Java fundamentals and preparing for real-world application design.

**************************************************
