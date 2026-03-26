# 📘 Version 2 – Book Management System (Search Feature Added)

## 📌 Overview
This version enhances the basic Book Management System by adding **search functionality**. Users can now search for books using different criteria like **ID (index), title, and author**.

---

## 🚀 Features

### ✅ Existing Features (from v1)
- Add new books  
- View all books  

### 🆕 New Features (v2)
- 🔍 Search book by:
  - **ID (index)**
  - **Title**
  - **Author**

---

## 🧱 Project Structure


src/
├── Book.java
├── BookAccess.java
└── BookMenu.java


---

## ⚙️ How It Works

### 🔹 Search by ID
- Uses **direct index access**
- Fast lookup

### 🔹 Search by Title / Author
- Iterates through all books
- Uses **case-insensitive string comparison (`equalsIgnoreCase`)**

---

## 🧠 Concepts Used

- Linear Search  
- Array traversal  
- String comparison  
- Method modularization  

---

## ⏱️ Time Complexity

|      Operation    |   Complexity      |
|   ----------      |   -----------     |
| Search by ID      |       O(1)        |
| Search by Title   |       O(n)        |
| Search by Author  |       O(n)        |

---

## ▶️ Sample Menu


1- View Books
2- Add Book
3- Search Book
Any other key to exit


---

## 📌 Sample Output

Enter title:
Java
Found at index 0: Book{title='Java', author='James', price=500}


---

## ⚠️ Limitations

- Fixed size array (max 10 books)  
- No update/delete functionality  
- No sorting  

---

## 🎯 Learning Outcome

- Understanding **linear search**
- Working with **arrays**
- Writing **modular reusable methods**

---

## 🚀 Next Version (v3)

- Compare books using title/author  
- Update book details (title, author, price)  

---


---

#### 👨‍💻 Author
* alpha1zln
* Developed as part of IBM Java learning project
---

**************************************************
**************************************************

## Misc::

#### how to create a separate folder for all .class

Good question 👍 — this is a very important professional practice.

🔹 Goal

👉 Store all compiled .class files in a separate folder (like bin/)

✅ Method (Simple & Correct)
🔹 Step 1: Create folder

Inside your project:

BOOK_PROJ/
   src/
   bin/   👈 create this
🔹 Step 2: Compile with -d option

Run this command:

javac -d bin src/*.java
🔹 What this does

-d bin 👉 tells Java:

“Put all .class files inside bin folder”

🔹 Output structure
BOOK_PROJ/
   src/
      Book.java
   bin/
      src/
         Book.class
         BookMenu.class
         BookAccess.class

👉 Because of:

package src;
🔹 Step 3: Run the program
java -cp bin src.BookMenu
🔹 Explanation

-cp bin → classpath = where .class files exist

src.BookMenu → package + main class

🔥 Cleaner Version (OPTIONAL PRO TIP)

If you remove:

package src;

Then:

javac -d bin src/*.java
java -cp bin BookMenu

👉 Simpler for beginners

🧠 Why this is important

Keeps project clean ✅

Separates source & compiled code ✅

Industry standard practice ✅

🔹 One-line Interview Answer

We use javac -d <folder> to store compiled .class files in a separate directory for better project organization.

**********************************************
