# 📚 Book Management System (Java Project)

## 📌 Project Overview

The Book Management System is a simple Java-based console application designed to manage books efficiently. It allows users to add books, view book details, and compare prices using index-based selection.

*****************************************************

## 📘 Version 4 – Book Management System (Complete CRUD + Smart Search & Sort)

## 📌 Overview
This is the final version of the Book Management System. It implements a **complete CRUD system** along with **advanced search, delete, and smart sorting features**.

The project now follows a **real-world approach** where users can:
- Search books using multiple criteria  
- Apply sorting on filtered results  
- Perform full data management operations  

> Built a dynamic book management system supporting search, filtering, and multi-level sorting similar to real-world e-commerce platforms.

---

## 🚀 Features

### ✅ Core Features (CRUD)
- ➕ Add books  
- 📖 View all books  
- 🔍 Search books  
- ✏️ Update books  
- 🗑️ Delete books  

---

### 🔍 Advanced Search
Search books by:
- ID  
- Title  
- Author  

👉 Returns **multiple matching results (ArrayList)**


---

### 🔃 Smart Sorting (NEW 🔥)
After search, user can sort results by:
- Title  
- Price  

👉 Sorting is applied **only on filtered results** (like real apps)



---

### 🗑️ Delete Options
Delete book by:
- ID  
- Title  
- Author  

---

********************************************

## 🧱 Project Structure

src/
├── Book.java
├── BookAccess.java
└── BookMenu.java

---

## ⚙️ Key Improvements

### 🔹 1. ArrayList Usage
- Dynamic size (no fixed limit)
- Easy insert/delete
- Industry-standard collection

```java
ArrayList<Book> books = new ArrayList<>();
```


### 🔹 2. Reusable Logic
Common methods used across features:
getById()
getAllByTitle()
getAllByAuthor()

👉 Used in:
Search
Compare
Update
Delete


### 🔹 3. Smart Flow (🔥 Highlight)
Search → Get Results → Ask for Sort → Show Sorted Output
👉 Mimics real-world filtering systems (Amazon / Flipkart)


### 🔹 4. Search → Filter → Sort Pipeline (🔥 Highlight)
#### 🔍 Advanced Search + Filter + Sort (NEW 🔥)
- Search books by:
  - ID  
  - Title  
  - Author  

- Apply **price filtering after search**:
  - ≤ 500  
  - 501 – 1000  
  - > 1000  

- Apply **sorting on filtered results**:
  - By Title  
  - By Author  
  - By Price:
    - Ascending  
    - Descending  
    - Price Range + Ascending  

👉 Supports full pipeline:
Search → Filter → Sort → Result


- Users can refine results step-by-step  
- Sorting is applied on filtered data, not full dataset  
- Mimics real-world systems like Amazon / Flipkart  



### 🔹 5. Advanced Sorting Options
- Sort by Title  
- Sort by Author  
- Sort by Price:
  - Ascending  
  - Descending  
  - Price-range based sorting  

- Supports combined operations (filter + sort)

---

## 🧠 Concepts Used
ArrayList (Java Collections)
Comparator & Sorting
Linear Search
Method Reusability
OOP (Encapsulation)
Menu-driven design

---

## ⏱️ Time Complexity
Operation	          Complexity
Add Book	            O(1)
View Books	          O(n)
Search by ID	        O(1)
Search by Title	      O(n)
Search by Author	    O(n)
Update	              O(n)
Delete	              O(n)
Sort (Title/Price)	  O(n log n)

--- 

## ▶️ Sample Menu
1- View Books
2- Add Book
3- Search Book
4- Compare Books
5- Update Book
6- Delete Book
7- Sort Books
Any other key to exit

---

## 📌 Sample Flow
Search by Title: Java

Results:
Java - 500
Java - 300
Java - 700

Filter by Price:
1- <=500

Filtered Results:
Java - 500
Java - 300

Sort by Price (Ascending):
Final Results:
Java - 300
Java - 500

--- 
## ⚠️ Limitations
No database (data lost after exit)
No GUI (console-based)
No pagination for large data


---

## 🎯 Learning Outcomes
Built a complete CRUD system using Java
Transitioned from Array → ArrayList
Implemented real-world search + filter + sort logic
Designed modular and reusable code
Applied Comparator for custom sorting

---

## 🚀 Future Improvements
Add database (MySQL / MongoDB)
Convert to Spring Boot REST API
Add GUI (JavaFX / Web UI)
Add pagination & filtering

---

## 🧠 Interview Highlights
- Implemented full CRUD operations using ArrayList
- Designed reusable search-based architecture
- Applied dynamic sorting on filtered datasets
- Used Comparator for flexible sorting logic
- Designed a search → filter → sort pipeline for dynamic data processing  
- Implemented multiple sorting strategies (title, author, price asc/desc)  
- Added price range filtering for real-world use-case simulation  

---

### 👨‍💻 Author
* alpha1zln 
* Developed as part of IBM Java learning mini project(Coursera)

---

**************************************************
**************************************************

#### why VER 4

1-
🧠 DESIGN CHANGE (IMPORTANT)

👉 Instead of:

Book getByTitle(...)

👉 We return:

ArrayList<Book> getAllByTitle(...)

✔ This allows:

Multiple matches

Sorting after search


2-
✅ YOUR REQUIREMENT (REFINED)
1️⃣ Global Sort Options

Sort by ID

Sort by Title

Sort by Price

2️⃣ Smart Flow (🔥 BEST FEATURE)

👉 After search:

Show filtered results

Ask:

“Do you want to sort these results?”

👉 Then sort only those results


3-
🔥 WHY THIS IS AWESOME
Before:

Search → single result ❌

Sort → global ❌

Now:

Search → multiple results ✅

Sort → on filtered data ✅

User-driven flow ✅

👉 This is how real apps work (Amazon, Flipkart filters)

🧠 INTERVIEW GOLD LINE

Implemented dynamic filtering and sorting where users can search books and then apply sorting on filtered results.

🎯 YOU JUST UPGRADED YOUR PROJECT TO:

❌ Basic CRUD
→ ✅ Mini product with filtering + sorting system

🚀 NEXT (OPTIONAL BUT 🔥)

We can add:

Price range filter (100–500)

Multi-filter (title + price)

Pagination


**
🎯 INTERVIEW GOLD LINES

Implemented flexible sorting options including ascending, descending, and range-based filtering.

Designed a pipeline allowing search → filter → sort → insights on dynamic datasets.

Used Comparator for multi-level sorting (title + price).

**********************************************
**********************************************

