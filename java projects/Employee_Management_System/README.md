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

2. **Configure database**

Update application.properties (or application.yml) with your MySQL database credentials:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password

jwt.secret=your_jwt_secret_key
jwt.expiration=3600000

3. **Build and run**

```bash
mvn clean install
mvn spring-boot:run

4. **API Usage**

Access Swagger UI for API documentation and testing:
http://localhost:8080/swagger-ui/index.html

Register a new user:
POST /api/auth/signup

Login and get JWT token:
POST /api/auth/login

Use the token in Authorization header for all protected endpoints:
Authorization: Bearer <token>

Manage employees via endpoints under /api/employees

5. **Project Structure**

src/main/java/ems
├── config              # Security and Swagger configurations
├── controller          # REST Controllers
├── dto                 # Data Transfer Objects
├── entity              # JPA Entities
├── repository          # Spring Data JPA Repositories
├── service             # Business logic services
└── util                # JWT utilities and filters

Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
Developed by Mohan R
Email: mtm.kcs@gmail.com

LinkedIn:[ https://www.linkedin.com/in/yourprofile](https://www.linkedin.com/in/mohan7401/)
