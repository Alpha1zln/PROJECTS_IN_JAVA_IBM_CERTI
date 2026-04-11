# 🔐 Spring Security Project

## 📌 Overview

This project demonstrates **authentication and authorization using Spring Security** in a structured, step-by-step manner.

It is divided into multiple versions to show gradual learning and implementation:

* **Version 1:** Basic Authentication (Login + Register)
* **Version 2:** Role-Based Access Control (RBAC)

The goal of this project is to build a **strong foundation in Spring Security** and understand how real-world backend systems secure applications.

---

## 🚀 Features

### 🔑 Authentication (Version 1)

* User Registration & Login
* Password Encryption using BCrypt
* Custom Login Page (Thymeleaf)
* Session-based Authentication
* Protected Endpoint (`/greet`)

---

### 🔐 Authorization (Version 2)

* Role-Based Access Control (ADMIN / STAFF)
* Secured Endpoints using roles
* Access restrictions with **403 Forbidden**
* Dynamic UI rendering based on roles

---

## 🏗️ Tech Stack

* **Backend:** Spring Boot
* **Security:** Spring Security
* **Frontend:** Thymeleaf
* **Storage:** In-memory (HashMap)

---

## 📂 Project Structure

```
SpringSecProj/
│
├── v1-basic-auth/
│   └── README.md
│
├── v2-role-based/
│   └── README.md
│
├── src/main/java/com/.../
│   ├── config/
│   ├── controller/
│   ├── service/
│   └── model/
│
├── src/main/resources/
│   ├── templates/
│   └── application.properties
│
└── README.md
```

---

## 🔄 Complete Flow (High Level)

```
User → Login/Register → Spring Security Filters
→ AuthenticationManager → UserDetailsService
→ Password Validation → SecurityContext
→ Authorization (Role Check) → Response
```

---

# 🧠 Spring Security Theory (Core Concepts)

---

## 🔹 1. Authentication

### 👉 What:

Verifying **who the user is**

### 👉 How it works:

* User enters username & password
* Spring Security intercepts request
* `AuthenticationManager` processes credentials
* Calls `UserDetailsService`
* Password checked using `PasswordEncoder`

---

## 🔹 2. Authorization

### 👉 What:

Determining **what the user can access**

### 👉 Example:

* ADMIN → access everything
* STAFF → limited access

---

## 🔹 3. UserDetailsService

### 👉 What:

Custom service to fetch user data

### 👉 Why:

Spring Security does not know your database
So you provide logic to fetch users

---

## 🔹 4. SecurityFilterChain

### 👉 What:

Chain of filters that every request passes through

### 👉 Flow:

```
Request → Authentication Filter → Authorization Filter → Controller
```

---

## 🔹 5. AuthenticationManager

### 👉 What:

Main component responsible for login verification

### 👉 Internally:

```
→ Calls UserDetailsService  
→ Uses PasswordEncoder  
→ Returns success/failure  
```

---

## 🔹 6. PasswordEncoder (BCrypt)

### 👉 What:

Encrypts passwords

### 👉 Why:

* Prevents storing plain passwords
* Protects against data leaks

---

## 🔹 7. SecurityContext

### 👉 What:

Stores authenticated user details

### 👉 Internally:

* Stored per request (ThreadLocal)
* Used across application after login

---

## 🔹 8. CSRF Protection

### 👉 What:

Prevents unauthorized requests from external sites

### 👉 How:

* Uses CSRF tokens
* Validates each request

---

# 📦 Versions

---

## 🔹 Version 1 – Basic Authentication

📁 Folder: `v1-basic-auth`

### Features:

* Register & Login
* Custom login page
* Password encryption
* Protected endpoint

👉 See detailed README inside version folder.

---

## 🔹 Version 2 – Role-Based Access

📁 Folder: `v2-role-based`

### Features:

* Role-based authorization (ADMIN / STAFF)
* Restricted endpoints
* 403 Forbidden handling
* Dynamic UI rendering

👉 See detailed README inside version folder.

---

## ⚙️ How to Run

1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Run Spring Boot application
4. Open:

```
http://localhost:8080/login
```

---

## ⚠️ Limitations

* In-memory storage (no database)
* Session-based authentication only
* No REST APIs / JWT

---

## 🔮 Future Enhancements

* MySQL + JPA integration
* JWT Authentication (stateless)
* REST API support
* OAuth2 / Google Login
* Production-level security

---

## 💡 Learning Outcomes

By completing this project, you will understand:

* How Spring Security works internally
* Authentication vs Authorization
* Role-based access control
* Secure password handling
* Real-world backend security flow

---

## 🎯 Interview Ready Points

You can confidently explain:

* SecurityFilterChain
* Authentication flow
* UserDetailsService
* Role-based authorization
* SecurityContext

---

## 👨‍💻 Author
alpha1zln
Learned on IBM JAVA PROF. CERTI. CRS ON COURSERA.
---

## ⭐ Final Note

This project is built step-by-step to move from:
👉 **Basic authentication → Real-world security concepts**

A strong foundation here makes it easier to learn:

* JWT
* Microservices Security
* Enterprise-level backend systems

---
