# 🚀 AlphaCoder Academy

### Spring Boot MVC Learning Project (Version 1 + Version 2)

---

## 📌 Project Overview

About Project:
AlphaCoder Academy is a platform designed to nurture future engineers by providing quality coding education, helping & empowering them to grow into skilled software developers, enlighten them into top coders and guiding them to excel and succeed in software development careers.

Tech. Project details:
**AlphaCoder Academy** is a **Spring Boot MVC-based web application** built to demonstrate real-world backend development concepts like:

* MVC Architecture
* Form Handling
* Thymeleaf Integration
* Validation & Error Handling

This project evolves in **two versions**, showing a clear progression from **basic UI rendering → advanced form validation system**.

---

## 🎯 What This Project Does

👉 A simple academy website where:

* Users can navigate through pages (Home, About, Services, Contact)
* Users can register using a form
* Application validates user input (name, email, DOB, etc.)
* Errors are displayed dynamically in UI
* Successful submissions show confirmation

---

## 🧱 Project Versions

---

### 🔹 Version 1 (Basic MVC)

✔ Static pages using Thymeleaf
✔ Navigation between pages
✔ Simple registration form (no validation)
✔ Basic UI using HTML + CSS

📌 Focus:

* Understanding MVC flow
* Controller → View mapping
* Thymeleaf basics

---

### 🔹 Version 2 (Advanced MVC + Validation)

✔ Form Binding using `@ModelAttribute`
✔ Validation using `@Valid`
✔ Error handling using `BindingResult`
✔ Dynamic error display in UI
✔ Improved UI & consistency

📌 Focus:

* Real-world form handling
* Data validation
* Clean UI/UX
* Production-level concepts

---

## 🛠 Tech Stack

* **Backend:** Java, Spring Boot, Spring MVC
* **Frontend:** HTML, CSS, Thymeleaf
* **Validation:** Jakarta Bean Validation (Hibernate Validator)
* **Build Tool:** Maven

---

## 🧠 Core Concepts Covered

---

### 🔷 1. MVC Architecture

```text
User → Controller → Model → View → Response
```

* **Model:** Data + validation rules
* **View:** UI (Thymeleaf templates)
* **Controller:** Handles requests

---

### 🔷 2. Thymeleaf (Template Engine)

👉 Used to create dynamic HTML pages

#### Key Syntax:

* `th:text` → display data
* `th:href` → navigation
* `th:action` → form submission
* `th:object` → bind form
* `th:field` → bind input
* `th:errors` → show validation errors

---

### 🔷 3. Form Binding

```java
@ModelAttribute("registrationForm")
```

👉 Automatically maps form data → Java object

---

### 🔷 4. Validation

```java
@Valid
@NotBlank
@Email
@Past
```

👉 Ensures correct user input

#### Flow:

```text
Form → Object → Validation → Errors → View
```

---

### 🔷 5. DispatcherServlet (Spring Core)

```text
Client → DispatcherServlet → Controller → View → Client
```

👉 Acts as a **front controller** handling all requests

---

### 🔷 6. LocalDate vs Date

| Feature     | Date | LocalDate |
| ----------- | ---- | --------- |
| API         | Old  | Modern    |
| Thread-safe | ❌    | ✔         |
| Recommended | ❌    | ✔         |

---

## 📂 Project Structure

```text
academy-project/
│
├── version-1/
├── version-2/
│
└── README.md
```

---

## 🚀 How to Run

### Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

### Or:

```bash
mvn spring-boot:run
```

### Open:

```text
http://localhost:8080/
```

---

## ⚠️ Common Issues

| Issue                  | Fix                        |
| ---------------------- | -------------------------- |
| mvn not recognized     | Use `mvnw`                 |
| Validation not working | Add `@Valid`               |
| Thymeleaf error        | Check `model.addAttribute` |

---

## 🚀 Future Scope

* 🔐 Authentication (Spring Security)
* 💾 Database Integration (JPA + MySQL)
* 📧 Email Verification
* 🌐 REST APIs
* ☁️ Cloud Deployment

---
## 🧠 How to push code to Github from pc 

### 🚀 ✅ If repo already initialized & remote added
```
1️⃣ Check status
git status

2️⃣ Add files
git add .

3️⃣ Commit
git commit -m "added ver2, readme, validation"

4️⃣ Push
git push origin main
```

 ---

#### 🚀 ✅ If first time push (IMPORTANT)
```
1️⃣ Initialize (if not done)
git init
2️⃣ Add remote
git remote add origin https://github.com/your-username/repo-name.git

4️⃣ Push (first time)
git branch -M main
git push -u origin main
```
---

#### 🚀 ✅ Gist - If already push codes on github for proj.
```
3️⃣ Add + Commit
git add .
git commit -m "initial commit"
git push origin main
```
---
---

## 👨‍💻 Author

**AlphaCoder (Java Backend Developer Aspirant)**
Learned from IBM JAVA Certi course.
---

## ⭐ Final Note

This project demonstrates a **step-by-step journey from beginner to intermediate Spring Boot developer**, focusing on **clean architecture, validation, and real-world practices**.

---

💡 *“Code → Understand → Build → Scale → Succeed”*

*******************
******************************************