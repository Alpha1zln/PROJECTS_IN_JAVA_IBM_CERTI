## 📚 Book Management System (Java Project)

### 📌 Project Overview

The Book Management System is a simple Java-based console application designed to manage books efficiently. It allows users to add books, view book details, and compare prices using index-based selection.

## 📘 Version 3 – Book Management System (ArrayList + Advanced Features)

### 📌 Overview
This version upgrades the system by introducing **ArrayList (dynamic storage)** and advanced operations like **compare and update using multiple search criteria**.

It focuses on **code reusability, cleaner design, and real-world practices**.

---

## 🚀 Features

### ✅ Existing Features (v1 + v2)
- Add books  
- View all books  
- Search books by:
  - ID  
  - Title  
  - Author  

### 🆕 New Features (v3)
- 💰 Compare books by:
  - ID  
  - Title  
  - Author  

- ✏️ Update book details:
  - Title  
  - Author  
  - Price  

- 🔁 Reusable search logic across operations  

- 📦 Switched from **Array → ArrayList**

---

## 🧱 Project Structure


src/
├── Book.java
├── BookAccess.java
└── BookMenu.java


---

## ⚙️ Key Improvements

### 🔹 1. ArrayList Usage
- Dynamic size (no fixed limit)
- Easy add/remove operations
- Cleaner and industry-standard approach

```java
ArrayList<Book> books = new ArrayList<>();
```

###  🔹 2. Code Reusability

Common search methods reused for:
Search
Compare
Update

Example:
getById()
getByTitle()
getByAuthor()

### 🔹 3. Modular Design

BookMenu → UI (user interaction)
BookAccess → Logic (operations)

---


## 🧠 Concepts Used
ArrayList (Java Collections)
Linear Search
Method Reusability
OOP (Encapsulation)
Menu-driven program design

---

### ⏱️ Time Complexity
Operation	        Complexity
Search by ID	        O(1)
Search by Title	        O(n)
Search by Author	    O(n)
Compare	                O(n)
Update	                O(n)

--- 

### ▶️ Sample Menu
1- View Books
2- Add Book
3- Search Book
4- Compare Books
5- Update Book
Any other key to exit

---

### 📌 Sample Output
Compare by: 1-ID 2-Title 3-Author
Enter Title1:
Java
Enter Title2:
Python
Java[book] is cheaper

---

### ⚠️ Limitations
No delete functionality
No sorting
Data not persisted (lost after program ends)

--- 

### 🎯 Learning Outcomes
Transition from Array → ArrayList
Writing reusable methods
Designing modular code structure
Handling multiple operations using shared logic

---

### 🚀 Next Version (v4)
Delete book by:
ID
Title
Author

Sort books:
By Title
Then by Price


---

#### 👨‍💻 Author
* alpha1zln 
* Developed as part of IBM Java learning mini project(Coursera)

---

**************************************************
**************************************************

#### why convert from array to arraylist

Good question 👍 — this is very important for interviews + real projects.

🔥 Why convert Array → ArrayList?
🔹 1. Size Problem (BIGGEST reason)
❌ Array
Book[] books = new Book[10];

Fixed size = 10

After 10 → ❌ cannot add more

✅ ArrayList
ArrayList<Book> books = new ArrayList<>();

Dynamic size ✅

Automatically grows

👉 Real-world apps never use fixed size

🔹 2. Add / Remove is easier
❌ Array (hard)
books[3] = null;  // leaves gap

👉 You need shifting logic 😓

✅ ArrayList (easy)
books.remove(3);

👉 Automatically shifts elements ✅

🔹 3. Built-in methods (VERY IMPORTANT)

ArrayList gives:

books.add(bk);
books.remove(index);
books.get(index);
books.size();

👉 No need to write extra logic

🔹 4. Cleaner Code
❌ Array
if(bkIdx == 10)
✅ ArrayList
if(books.size() == 0)

👉 More readable + professional

🔹 5. Industry Standard

👉 In real companies:

Arrays → rarely used directly

ArrayList → very common

🔹 6. Time Complexity (important)
Operation	Array	ArrayList
Access	O(1)	O(1)
Add	O(1)	O(1) amortized
Delete	O(n)	O(n)

👉 Almost same, but ArrayList is easier to use

🔥 Simple Analogy

Array = fixed-size box
ArrayList = expandable bag 🎒

🔹 Interview One-liner (VERY IMPORTANT)

ArrayList is preferred over arrays because it provides dynamic resizing and built-in methods for easier data manipulation.

⚠️ When to use Array?

Use Array when:

Size is fixed

Performance is critical (rare case)

**********************************************
**********************************************

