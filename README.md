# 💰 Smart Expense & Investment Tracker

## 📌 Overview

Smart Expense & Investment Tracker is a full-stack application designed to help users **track daily expenses and manage investments efficiently**.
It provides a centralized dashboard to monitor spending patterns and financial growth.

## 🛠️ Tech Stack

* Frontend: React.js
* Backend: Spring Boot
* Database: MySQL
* API: REST APIs
* Tools: Axios, Git

## ✨ Features

* 🔐 User Authentication (Login/Register)
* 💸 Add, update, and delete expenses
* 📊 Track investments separately
* 📈 Dashboard for financial overview
* 🔄 Real-time data updates using APIs
* 🎯 Clean and responsive UI

## 📂 Project Structure

```id="i7m3zt"
Smart-Expense-Investment-Tracker/
│── finance-ui/        # React frontend
│── backend/           # Spring Boot backend
│── database/          # SQL scripts (if any)
│── README.md
```

## ⚙️ Installation & Setup

### 1. Clone Repository

```bash id="p8cfhl"
git clone https://github.com/Vinayak7788722/Smart-Expense-Investment-Tracker-.git
cd Smart-Expense-Investment-Tracker-
```

---

### 2. Frontend Setup

```bash id="7q1rnm"
cd finance-ui
npm install
npm start
```

Runs on: `http://localhost:3000`

---

### 3. Backend Setup

```bash id="p0ydg5"
cd backend
mvn spring-boot:run
```

Runs on: `http://localhost:8080`

---

### 4. Database Setup

Create a MySQL database (e.g., `expense_tracker`) and update credentials in:

```id="cyfkxg"
application.properties
```

Example:

```properties id="7ybdrt"
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## 🔗 API Endpoints (Sample)

* `GET /expenses` → Get all expenses
* `POST /expenses` → Add expense
* `DELETE /expenses/{id}` → Delete expense
* `GET /investments` → Get investments

---

## 📌 Key Learnings

* Full-stack application development
* REST API integration with React
* State management in frontend
* Backend API design using Spring Boot
* Database schema design

---

## 🚀 Future Improvements

* 📊 Add charts (graphs & analytics)
* ☁️ Deploy on cloud (AWS / Render)
* 🔔 Notifications & alerts
* 📱 Mobile responsive improvements

---

## 👨‍💻 Author

Vinayak
