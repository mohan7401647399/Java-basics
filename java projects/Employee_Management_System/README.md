# Employee Management System

A secure and scalable **Employee Management REST API** built with **Java**, **Spring Boot**, and **MySQL**.

---

## Features

- **User Authentication & Authorization**
  - JWT-based authentication
  - Role-based access control (USER, MODERATOR, ADMIN)
- **Employee Management**
  - Create, Read, Update, Delete (CRUD) employees
  - Soft delete functionality (deactivate instead of permanent deletion)
  - Search employees by name
  - Filter employees by department
- **Security**
  - Password encryption with BCrypt
  - Secure API endpoints with Spring Security and JWT filters
- **API Documentation**
  - Swagger UI integration for easy API testing and documentation

---

## Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security with JWT
- Spring Data JPA (Hibernate)
- MySQL
- Lombok
- Swagger (OpenAPI)
- Maven

---

## Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven
- MySQL database

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system
