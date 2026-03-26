
# 🎓 IBM Java Professional Certificate – Projects Repository

## 📌 Overview
This repository contains all projects, assignments, and practice work completed as part of the **IBM Java Professional Certificate**.

The certification covers core and advanced concepts in Java, backend development, and modern application design using frameworks like **Spring Boot**.
Also, includes courses on Devops, Microservices, FrontEnd, Design Pattern, Testing, Cloud, Java with DB, etc.

---

## 🚀 About the Certification

- 📚 Platform: Coursera  
- 🏢 Provider: IBM  
- 📦 Total Courses: 14  
- 💻 Focus: Java + Backend Development  

---

## 📂 Repository Structure
```
IBM-Java-Certificate/
│
├── Course-1-Basics/
├── Course-2-OOP/
│ └── Book-Management-System/
│
├── Course-3-Advanced-Java/
├── Course-4-Collections/
├── Course-5-Exception-Handling/
├── Course-6-Java-IO/
├── Course-7-Multithreading/
├── Course-8-Database/
├── Course-9-JDBC/
├── Course-10-Spring-Boot/
├── Course-11-REST-API/
├── Course-12-Microservices/
├── Course-13-DevOps/
├── Course-14-Capstone-Project/
│
└── README.md
```

---


---

## 📘 Key Projects

### 🔹 1. Book Management System (OOP – Java)
- Implemented using **Core Java + OOP principles**
- Features:
  - CRUD operations  
  - Search (ID, Title, Author)  
  - Filter (Price range)  
  - Sort (Title, Author, Price Asc/Desc)  
  - Search → Filter → Sort pipeline  

---

### 🔹 2. Spring Boot Projects
- REST API development  
- Controller, Service, Repository layers  
- CRUD APIs  
- JSON-based communication  

---

### 🔹 3. Database & JDBC Projects
- MySQL integration  
- CRUD operations using JDBC  
- Connection handling  

---

### 🔹 4. Microservices (Basics)
- Introduction to microservices architecture  
- Service separation concepts  

---

### 🔹 5. Capstone Project
- Final project integrating:
  - Java  
  - Spring Boot  
  - Database  
  - API development  

---

## 🧠 Skills Gained

- Core Java & OOP  
- Data Structures (ArrayList, Collections)  
- Exception Handling  
- JDBC & Database Integration  
- Spring Boot & REST APIs  
- Microservices Basics  
- Git & GitHub Workflow  

---

## 🔧 Tech Stack

- Java  
- Spring Boot  
- MySQL  
- JDBC  
- Git & GitHub  

---

## 🎯 Highlights

- Built multiple real-world backend projects  
- Implemented **search, filter, and sorting pipelines**  
- Followed **modular and reusable coding practices**  
- Used **feature-branch Git workflow for safe development**

---

## 🚀 Future Improvements

- Add frontend (React)  
- Convert projects to full-stack applications  
- Deploy using cloud platforms (AWS/Azure)  



*****************************
---

## 🔥 STEP-BY-STEP: PUSH TO GITHUB

### 🟢 Step 1: Go to your main folder
```
cd path/to/IBM-Java-Certificate
```

### 🟢 Step 2: Initialize Git (first time, when created a repo on local pc)
```
git init
```
👉 This creates .git in main folder


#### Note 1 :: 
If "first time" using git on laptop, then -
it’s a new laptop, you must configure Git username & email before pushing.

✅ STEP : Set Username & Email

👉 Run these in terminal (Git Bash / VS Code terminal):
```
git config --global user.name "Your Name"
git config --global user.email "your_email@example.com"
```
#### Note 1 End.

---

#### Note 2 :: 

##### 🟢  Create a feature branch
👉 Example:
```
git checkout -b feature/ver4-book-system
```
✔ Now you are NOT on main

#### Note 2 End.

---

### 🟢 Step 3: Add all files
```
git add .
```

### 🟢 Step 4: Commit
```
git commit -m "Initial commit - IBM Java Certification Projects"
git branch -M main
```
##### Note ::
✅  git branch -M main (YOU SHOULD USE THIS)
```
git branch -M main
```
🔹 What it does:
Renames your current branch → main
Usually from master → main
##### Note End.


### 🟢 Step 5: Create repo on GitHub
Go to:
👉 https://github.com
Click New Repository
Name: IBM-Java-Certificate

### 🟢 Step 6: Connect local to GitHub (first time to cnct a repo)
```
git remote add origin https://github.com/YOUR_USERNAME/IBM-Java-Certificate.git
```

### 🟢 Step 7: Push

##### 1. Either push directly on main.
```
git push -u origin main 
```


##### OR  2. Push on branch
🟢 Push feature branch
```
git push -u origin feature/ver4-book-system
```


--- 

*********************************************

### STEP 8 : REMAINING STEPS (IF code is pushed on branch, not main)
🟢 1. Go to GitHub
👉 You’ll see:
“Compare & Pull Request”
Click it ✅

🟢 2. Create Pull Request (PR)
Base: main
Compare: feature/ver4-book-system
Click:
👉 Create Pull Request

🟢 3. Merge into main
Click:
👉 Merge Pull Request

4. 🔥 LOCAL SYNC AFTER MERGE
After merging on GitHub:

##### 👉 Switches your working branch to main
```
git checkout main
```

##### Update code on local pc : 
👉 Gets latest changes from GitHub (remote) and updates your local main
```
git pull origin main
```

*********************************************


---
## STEPS GIVEN ON GITHUB

### create a new repository on the command line
```
echo "# PROJECTS_IN_JAVA_IBM_CERTI" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Alpha1zln/PROJECTS_IN_JAVA_IBM_CERTI.git
git push -u origin main
```

###  push an existing repository from the command line
```
git remote add origin https://github.com/Alpha1zln/PROJECTS_IN_JAVA_IBM_CERTI.git
git branch -M main
git push -u origin main
```

---


apznek1
***************************************************************
***************************************************************


---

## 👨‍💻 Author
- alpha1zln
- Learned and developed using IBM JAVA PROF. CERTI - COURSERA.

***************************************************************
***************************************************************