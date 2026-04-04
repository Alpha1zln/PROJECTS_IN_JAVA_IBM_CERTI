# 📚 Library Management System (LMS)

A backend project built using **Spring Boot** to simulate a real-world Library System.

This project is designed to **learn backend development step by step**, evolving from basic APIs to a production-ready system.

---

## 🚀 Features

- Manage Books 📖
- Manage Members 👨‍🎓
- Borrow & Return Books 🔄
- Track issued books and borrowers
- Search functionality
- Logging using SLF4J

---

# 🧱 Project Evolution (V1 → V6)

This project is built in multiple versions to understand concepts progressively.

---

## 🔹 Version 1 (Basic)

- Controller + Service layer
- In-memory storage (ArrayList)
- Basic CRUD (Create, Read)
- Logging added (SLF4J)

👉 Focus: Understanding **API flow**

---

## 🔹 Version 2 (Improved)

- Added Repository layer
- Update & Delete operations
- Optional used for safe handling
- Borrow & Return logic implemented
- Handle "Book/Member not found"

👉 Focus: **Layered Architecture + Business Logic**

---

## 🔹 Version 3 (Database - JPA)

- Replace ArrayList with Database (H2 / MySQL)
- Use Spring Data JPA
- Entities & relationships (@Entity)

👉 Focus: **Database Integration**

---

## 🔹 Version 4 (Advanced Backend)

- Global Exception Handling (@ControllerAdvice)
- Validation (@Valid)
- Proper entity relationships (@OneToMany, @ManyToOne)

👉 Focus: **Clean & Robust Backend**

---

## 🔹 Version 5 (Production Ready)

- JWT Authentication 🔐
- Swagger API Documentation 📄
- Docker Containerization 🐳

👉 Focus: **Security + Deployment**

---

## 🔹 Version 6 (UI Integration)

- Thymeleaf frontend
- Full-stack application

👉 Focus: **User Interface + Integration**

---

# 🌐 What is REST API?

A **REST API (Representational State Transfer)** allows communication between client (Postman, frontend) and server using HTTP.

👉 Example:
GET /api/books
POST /api/books


- Client sends request  
- Server processes  
- Server returns response  

---

# 🔧 HTTP Methods (Used in Project)

| Method | Purpose |
|--------|--------|
| GET | Fetch data |
| POST | Create new data |
| PUT | Update existing data |
| DELETE | Remove data |

---

# 📊 HTTP Status Codes (Important)

| Code | Meaning |
|------|--------|
| 200 | OK (Success) |
| 201 | Created |
| 400 | Bad Request |
| 404 | Not Found |
| 500 | Internal Server Error |

👉 Example:
- Book found → `200 OK`
- Book not found → `404 Not Found`

---

# 🛠 Tech Stack

- Java
- Spring Boot
- REST APIs
- Maven

---

# 📬 API Testing

Use **Postman** to test APIs:
GET /api/books
POST /api/books
PUT /api/books/{id}
DELETE /api/books/{id}
POST /api/borrow?bookId=1&memberId=1


---

# 🎯 Learning Outcomes

- Layered Architecture (Controller → Service → Repository)
- REST API Design
- Optional & Null Handling
- Real-world relationship modeling
- Backend system thinking

---

# 🚀 Future Enhancements

- Database (H2 / MySQL)
- Spring Data JPA
- Exception Handling
- Authentication (JWT)
- Swagger Documentation
- Docker Deployment

apznek1
---

# 👨‍💻 Author
alpha1zln
Built as a learning project to become a strong backend developer 🚀
Learned from IBM Java Prof. Certi, Coursera.



--- 


## How  to push code on Github from PC.

###  🚀 CASE 1: If git init is NOT done

👉 Go inside your project folder first:
cd your-project-folder

✅ Step 1: Initialize Git
git init

✅ Step 2: Add files
git add .
👉 (. = all files)

✅ Step 3: Commit
git commit -m "Initial commit"

✅ Step 4: Create repo on GitHub
Go to: GitHub
👉 Click New Repository
👉 Copy the URL:
Example:
https://github.com/username/LMS.git

✅ Step 5: Connect local to GitHub
git remote add origin https://github.com/username/LMS.git

✅ Step 6: Push code
git branch -M main
git push -u origin main

--- 
apznek1

### 🚀 CASE 2: If git init ALREADY DONE

👉 Just skip init

✅ Step 1: Add files
git add .

✅ Step 2: Commit
git commit -m "update LMS project"

✅ Step 3: Add remote (ONLY first time)
git remote add origin https://github.com/username/LMS.git
👉 If already added → skip

✅ Step 4: Push
git push origin main

*********************************
*************************************************
