# 🛒 E-commerce Product API (Full-Stack Edition)

**Course:** C 281.1 – Intro. To Cyber Technology

**Assignment:** Web Design Practical (Group 15)

## 📋 Project Overview

This project is a comprehensive Full-Stack Product Catalog built with **Spring Boot** and a modern **Vanilla JS Frontend**. It allows users to browse a 100-product inventory, filter by category, and manage data display through custom pagination settings. To maintain a portable, "no-install" environment for the **Dell E6440**, it uses an **H2 In-Memory Database**.

## 🚀 Key Features

* **Full-Stack Integration:** A sleek, responsive frontend hosted directly on the Spring Boot server.
* **Advanced Pagination:** User-controlled "Items Per Page" and page navigation.
* **Master Dataset:** Pre-loaded with 100 diverse products across Electronics, Furniture, and more.
* **Layered Architecture:** Strict separation of concerns (Controller, Service, Repository, Model).
* **Automated API Docs:** Real-time documentation via **Swagger UI**.

## 🛠️ Tech Stack

* **Backend:** Java 17+, Spring Boot 3.4.2
* **Frontend:** HTML5, CSS3 (Modern Grid/Flexbox), JavaScript (Fetch API)
* **Database:** H2 In-Memory
* **Documentation:** SpringDoc OpenAPI 3.0

## 👥 Contributors & Specialized Teams (20 Members)

| Team | Members | Role | Primary Responsibilities |
| --- | --- | --- | --- |
| **Infrastructure** | 1 – 4 | **Architects** | `pom.xml` config, H2 Database setup, and server environment. |
| **Data Design** | 5 – 8 | **Backend Devs** | `Product` Entity mapping and `ProductRepository` JPA methods. |
| **Core Logic** | 9 – 12 | **Logic Engineers** | `ProductService` filtering and pagination math. |
| **API & UX** | 13 – 16 | **API Specialists** | `ProductController` and **Swagger UI** customization. |
| **Frontend** | 17 – 18 | **UI/UX Designers** | HTML structure and CSS "Premium" styling. |
| **Data & QA** | 19 – 20 | **Quality Leads** | `import.sql` (100 products) and end-to-end endpoint testing. |

## ⚙️ Setup & Execution

1. Open the project in **VS Code**.
2. Run the application:
```bash
./mvnw spring-boot:run

```


3. **Frontend UI:** `http://localhost:8080/index.html`
4. **API Docs:** `http://localhost:8080/swagger-ui.html`
5. **Database:** `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:ecommerce_db`)

---

## 💡 "For Dummies": How this project actually works

Think of this project as a **Modern Digital Restaurant**:

### 1. The Menu (Frontend UI) 📱

The website you see is the **Digital Menu**. It allows you to pick a category and decide how many items you want to see on one page.

* **In your code:** `index.html`

### 2. The Waiter (The Controller) 💁‍♂️

The Waiter takes your request from the menu. When you click "Next Page," the Waiter carries that specific instruction to the kitchen.

* **In your code:** `ProductController.java`

### 3. The Chef (The Service) 👨‍🍳

The Chef is the **Logic**. He looks at the 100 products in the back and picks only the ones you asked for (e.g., only "Electronics") and plates them in the size you requested.

* **In your code:** `ProductService.java`

### 4. The Pantry Manager (The Repository) 📦

The Chef doesn't dig through boxes; he asks the Pantry Manager. The Repository uses **JPA** to grab the exact data from the database instantly.

* **In your code:** `ProductRepository.java`

### 5. The Chalkboard (H2 Database) 🖍️

We use a **Chalkboard** for our storage. It’s incredibly fast for the team to use, but it wipes clean when the restaurant closes. We use an `import.sql` file to "re-write" our 100-item menu every single morning.