/*


                                            *****Microservices (Java – Spring Boot)*****


### 1. What are Microservices?

    **Answer:**
    Microservices architecture is a design approach where an application is broken into **small, independent, loosely-coupled services**, each responsible for a single business capability.
    Each service:

    * Has its **own database**
    * Can be **deployed independently**
    * Communicates via **REST / Messaging**

---

### 2. Difference between Monolithic and Microservices

    | Monolithic         | Microservices                 |
    | ------------------ | ----------------------------- |
    | Single codebase    | Multiple independent services |
    | Tight coupling     | Loose coupling                |
    | Single deployment  | Independent deployment        |
    | One DB             | One DB per service            |
    | Scaling entire app | Scale individual services     |

---

### 3. Advantages of Microservices

    * Independent deployment
    * Easy scalability
    * Fault isolation
    * Technology flexibility
    * Faster development cycles

---

### 4. Challenges of Microservices

    * Distributed system complexity
    * Network latency
    * Data consistency
    * Monitoring & logging
    * Service communication failures

---

### 5. How do microservices communicate?

    1. **Synchronous** – REST APIs (HTTP calls)
    2. **Asynchronous** – Messaging systems (Kafka, RabbitMQ)

---

### 6. What is Service Discovery?

    Service discovery allows services to **automatically find other services** without hardcoding URLs.

    Example: **Eureka Server**
        - Services register with Eureka Server
        - Clients fetch service locations dynamically

    eureka:
        client:
            register-with-eureka: true
---

### 7. What is Eureka Server & Client?

    * **Eureka Server** → Service registry
    * **Eureka Client** → Registers service with the registry

    @EnableEurekaServer
    public class EurekaServerApp {}

---

### 8. What is API Gateway?

    API Gateway is the **single entry point for all client requests**.

    Responsibilities:

    * Routing
    * Authentication
    * Rate limiting
    * Load balancing

    Example: **Spring Cloud Gateway**
        yaml file:
            routes:
            - id: user-service
                uri: lb://USER-SERVICE
                predicates:
                - Path=/users/**

---

### 9. Why do we need an API Gateway?

    * Hide internal services
    * Centralized security
    * Reduce client complexity
    * Cross-cutting concerns handled in one place

---

### 10. What is Load Balancing?

    Load balancing distributes traffic across multiple service instances.

    Uses **Ribbon / Spring Cloud LoadBalancer**

    Example:
        yaml file:
            routes:
            - id: order-service
                uri: lb://ORDER-SERVICE
                predicates:
                - Path=/orders/**

---

### 11. What is Circuit Breaker?

    Prevents cascading failures when a service is down.

    ### Example: Resilience4j
        @CircuitBreaker(name = "orderService", fallbackMethod = "fallback")
        public String callOrderService() { }

    Fallback method executes if service fails.

---

### 12. What is a Fallback Method?

    Fallback method executes when a service fails.

    Example:
        public String fallback(Exception e) {
            return "Service unavailable";
        }
---

### 13. What is Config Server?

    Centralized configuration management system.

    Example:
        - Config Server reads from Git
        - Services fetch config at runtime

    spring:
        cloud:
            config:
            uri: http://localhost:8888    
---

### 14. Why use centralized configuration?

    * Manage config in one place
    * Avoid redeployment
    * Environment specific configs

---

### 15. What is Distributed Tracing?

    Tracking request flow across multiple services.

    Tools:
        * Sleuth
        * Zipkin

    Flow:
    Client → API Gateway → Order Service → Payment Service
---

### 16. What is Saga Pattern?

    Pattern for managing **distributed transactions** across microservices.
    Each service performs local transaction.

    Types:
        1. **Choreography** – Event-based
        2. **Orchestration** – Central controller

    Example:
        Order → Payment → Inventory  
        If payment fails → rollback order

---

### 17. How do you maintain data consistency?

    * Saga pattern
    * Eventual consistency
    * Asynchronous messaging

---

### 18. What is Event-Driven Microservices?

    Services communicate using **events** instead of direct calls.

    Example:
        - OrderPlacedEvent
        - PaymentCompletedEvent

    Improves scalability & decoupling.

---

### 19. What is Idempotency?

    Same request executed multiple times gives **same result**.

    Example:
        ```http
        POST /payments (same transactionId)
    Payment API retry should not charge twice.

---

### 20. What is Statelessness in Microservices?

    Services do not store session state.

    Session stored in:
        * JWT
        * Redis

---

### 21. Why each microservice should have its own DB?

    - Avoid tight coupling
    - Independent scaling
    - Prevent shared failures
---

### 22. What is Docker in Microservices?

    Docker packages application with dependencies into a **container**.

    Packages microservice with:
        - Code
        - Dependencies
        - Runtime

    ```dockerfile
        FROM openjdk:17
        COPY app.jar app.jar
        ENTRYPOINT ["java","-jar","app.jar"]

---

### 23. What is Kubernetes?

    Container orchestration platform used to manage containers.

    Features:
        * Auto scaling
        * Self healing
        * Load balancing
        * Deployment management

---

### 24. How do you secure microservices?

    * JWT authentication
    * OAuth2
    * HTTPS
    * API Gateway security
    * Role based access control

---

### 25. What is OAuth2?

    Authorization framework using **access tokens**.s

    Flow:
        Client → Auth Server → Access Token → Resource Server

---

### 26. What is JWT?

    JSON Web Token used for **stateless authentication**.

    Contains:
        * Header
        * Payload
        * Signature

---

### 27. What is Blue-Green Deployment?

    Two environments:
        * Blue (current)
        * Green (new)

    Switch traffic after testing → **Zero downtime**

---

### 28. What is Canary Deployment?

    New version released to **small % of users** first.

---

### 29. What is Versioning in Microservices?

    API versioning example:
        /api/v1/users
        /api/v2/users

---

### 30. Real-Time Microservices Example?

    Banking System:
        * Customer Service
        * Account Service
        * Transaction Service
        * Notification Service

    Flow:
        Customer → API Gateway → Account → Transaction → Notification

        
---

### 34. How does Eureka based discovery work in Spring Boot?

1. Service starts
2. Registers with Eureka server
3. Other services request the service name
4. Eureka provides service instance

---

### 35. How is routing handled in Spring Cloud Gateway?

Routing is configured using **path predicates**.

Example:

```
/api/orders → order-service
```

---

### 36. What is client-side load balancing?

The client chooses which service instance to call.
Spring Cloud LoadBalancer selects one instance automatically.

---

### 37. Do you know what is a circuit breaker?

It detects service failures and **opens the circuit** to stop requests temporarily.

---

### 38. What is a fallback mechanism?

Alternative response when a remote service fails.

Example:
If payment service fails → return "Payment service unavailable".

---

### 39. What is centralized configuration in microservices?

All service configurations are stored in **Config Server** and loaded at runtime.

---

### 40. What is configuration refresh in microservices?

Allows configuration updates **without restarting services**.

Example:

```
/actuator/refresh
```

---

### 41. What is distributed tracing and why is it important?

Helps identify:

* performance bottlenecks
* service failures

---

### 42. Difference between Orchestration and Choreography in Saga?

| Orchestration      | Choreography  |
| ------------------ | ------------- |
| Central controller | Event driven  |
| Easier control     | Less coupling |

---

### 43. How do you implement asynchronous communication?

Using message brokers:

* Kafka
* RabbitMQ

---

### 44. What is idempotency and why is it important?

Prevents duplicate processing during retries.

---

### 45. What is database per service pattern?

Each microservice manages its own database.
Other services cannot access it directly.

---

### 46. How do you containerize Spring Boot microservices?

Using Dockerfile:

```
FROM openjdk:17
COPY app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
```

---

### 47. Why do we need container orchestration?

To manage hundreds of containers efficiently.

---

### 48. How is JWT propagated across services?

JWT token passed via HTTP header.

```
Authorization: Bearer token
```

---

### 49. What is Fault Tolerance?

System continues functioning even if one service fails.

---

### 50. What do you understand by Domain Driven Design?

Designing services based on **business domains**.

Example:
Order Service, Payment Service.

---

### 51. What is bounded context in microservices?

Clear boundary for domain models.
Each service owns its domain.

---

### 52. For logging, what are you doing in microservices?

Using **centralized logging system**.

Example:
ELK stack.

---

### 53. Suppose there are 10 microservices. How will you debug an issue?

Using:

* distributed tracing
* centralized logging
* traceId

---

### 54. When serviceA calls serviceB how is session maintained?

Using **JWT token forwarding**.

---

### 55. Huge load logs many users. How to identify one user logs?

Using:

* traceId
* userId
* correlationId

---

### 56. Have you worked on event sourcing?

Event sourcing stores **events instead of current state**.

---

### 57. How do you maintain scalability?

* Stateless services
* Horizontal scaling
* Container orchestration

---

### 58. What is health check and readiness?

Health endpoints monitor service status.

Example:

```
/actuator/health
```

---

### 59. What is centralized logging?

Collecting logs from all services into one system.

---

### 60. How do you monitor microservices?

Using monitoring tools:

* Prometheus
* Grafana

---

### 61. What is contract testing?

Ensures API compatibility between services.

Example: Pact testing.

---

### 62. How do you avoid cascading failures?

Using:

* circuit breaker
* timeout
* retry
* fallback

---

### 63. What is timeout and retry strategy?

Timeout defines waiting time.
Retry attempts call again if failure occurs.

---

### 64. What is schema evolution?

Safe database schema changes without breaking services.

---

### 65. What is sidecar pattern?

Helper container running alongside service.

Example:
Logging proxy container.

---

### 66. What is the strangler pattern?

Used to migrate monolith to microservices gradually.

---

### 67. How do you test microservices?

Testing levels:

* Unit tests
* Integration tests
* Contract tests
* End-to-end tests

---

### 68. What is service mesh?

Infrastructure layer for service communication.

Example:
Istio.

---

### 69. What are the biggest challenges in microservices?

* Distributed system complexity
* Debugging difficulty
* Data consistency
* Monitoring



*/
