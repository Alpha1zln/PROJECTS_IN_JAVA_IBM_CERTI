# 🚀 AlphaCoder Academy (Ver 2)

### Spring Boot MVC + Thymeleaf + Validation Project

---

## 📌 Overview

This is an enhanced version of the **AlphaCoder Academy web application**, built using **Spring Boot MVC architecture** with **Thymeleaf** and **Spring Validation**.

Version 2 introduces:

* ✅ Form Binding using `@ModelAttribute`
* ✅ Input Validation using `@Valid`
* ✅ Error Handling with `BindingResult`
* ✅ Clean UI with consistent styling
* ✅ Multi-page navigation

---

## 🛠 Tech Stack

* **Backend:** Java, Spring Boot, Spring MVC
* **Frontend:** HTML, CSS, Thymeleaf
* **Validation:** Jakarta Bean Validation (Hibernate Validator)
* **Build Tool:** Maven

---

## 📂 Project Structure

```id="a1v2st"
src/
 └── main/
      ├── java/com/app/webdemo/
      │       ├── controller/
      │       │      └── AcadAppnController.java
      │       ├── model/
      │       │      └── RegistrationForm.java
      │
      └── resources/
            ├── templates/
            │     ├── index.html
            │     ├── registration.html
            │     ├── about.html
            │     ├── services.html
            │     └── contact.html
            │
            └── static/
                  └── css/
                        └── styles.css
```

---

## 🚀 Features

* 📝 User Registration Form
* ✅ Form Validation (Name, Email, DOB, Country)
* ❌ Error Display in UI
* 🔗 Navigation (Home, About, Services, Contact)
* 🎨 Modern UI with Flexbox

---

## 🔁 MVC Architecture

```id="mvcflowv2"
User → Controller → Model → View → Response
```

### Flow:

1. User opens `/registration`
2. Controller sends empty `RegistrationForm`
3. User fills form
4. Data binds to object using `@ModelAttribute`
5. Validation triggered using `@Valid`
6. Errors handled via `BindingResult`
7. Response rendered using Thymeleaf

---

## 🧠 Key Concepts

---

### 🔷 1. Thymeleaf (Template Engine)

👉 Used to render dynamic HTML

#### Common Syntax:

| Syntax      | Purpose                |
| ----------- | ---------------------- |
| `th:text`   | Display data           |
| `th:href`   | Dynamic links          |
| `th:action` | Form submission        |
| `th:object` | Bind form to object    |
| `th:field`  | Bind input to field    |
| `th:errors` | Show validation errors |

---

### 🔷 2. Form Binding

```id="formbind"
@ModelAttribute("registrationForm") RegistrationForm form
```

👉 Automatically maps form data → Java object

---

### 🔷 3. Validation (Spring Boot)

#### Annotations Used:

```id="valann"
@NotBlank
@Email
@Past
```

#### Flow:

```id="valflow"
Form → Object → @Valid → BindingResult → View
```

👉 If invalid → show errors
👉 If valid → process data

---

### 🔷 4. DispatcherServlet

👉 Core component of Spring MVC

```id="dispatchflow"
Client → DispatcherServlet → Controller → View → Client
```

👉 Acts as a **Front Controller** handling all requests

---

### 🔷 5. LocalDate vs Date

| Feature       | Date | LocalDate |
| ------------- | ---- | --------- |
| API           | Old  | Modern    |
| Thread-safe   | ❌    | ✔         |
| Includes Time | ✔    | ❌         |

---

## 🔗 Endpoints

| Endpoint        | Method | Description   |
| --------------- | ------ | ------------- |
| `/`             | GET    | Home Page     |
| `/registration` | GET    | Show Form     |
| `/register`     | POST   | Submit Form   |
| `/about`        | GET    | About Page    |
| `/services`     | GET    | Services Page |
| `/contact`      | GET    | Contact Page  |

---

## 🎨 UI Highlights

* Flexbox-based Navbar
* Card-style Form Layout
* Inline Validation Errors (Red text)
* Consistent Input Styling

---

## ▶️ How to Run

### Option 1 (Maven Wrapper)

```id="run1"
./mvnw spring-boot:run
```

### Option 2 (If Maven Installed)

```id="run2"
mvn spring-boot:run
```

### Open in browser:

```id="run3"
http://localhost:8080/
```

---

## ⚠️ Common Issues

| Issue                  | Solution                            |
| ---------------------- | ----------------------------------- |
| Validation not working | Add `@Valid` + dependency           |
| Thymeleaf error        | Ensure `model.addAttribute` present |
| mvn not recognized     | Use `mvnw`                          |

---

---

## 📸 Screens / Op

* Home Page
<h4 align="center">Home Page</h4>
<p align="center">
  <img src="images/home.png" width="600"/>
</p>

* Registration Form
<h4 align="center">Reg. Page</h4>
<p align="center">
  <img src="images/regtnFormInDtl.png" width="600"/>
</p>

* About Page
<h4 align="center">Service Page</h4>
<p align="center">
  <img src="images/about.png" width="600"/>
</p>

---

## 🚀 Future Enhancements

* 🔐 Login & Authentication (Spring Security)
* 💾 Database Integration (MySQL + JPA)
* 📧 Email Verification
* 🌐 REST API Integration
* ☁️ Deployment (AWS / Render)

---

## 👨‍💻 Author

**AlphaCoder (Java Backend Developer Aspirant)**

---

## ⭐ Interview Ready Summary

👉 This project demonstrates:

* MVC Architecture
* Form Binding
* Validation Handling
* Dynamic UI Rendering

---

💡 *“Build → Understand → Scale → Succeed”*

**************************
**************************
