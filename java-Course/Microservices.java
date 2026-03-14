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

    - No redeployment for config changes
    - Environment-specific configs
    - Consistency across services

---

### 15. What is Distributed Tracing?

    Tracking request flow across multiple services.

    Tools:
        * Sleuth
        * Zipkin

    Flow:
    Client → API Gateway → Order Service → Payment Service

---

### 16. Why Distributed Tracing important?

    Helps identify:
            * performance bottlenecks
            * service failures

---

### 17. What is Saga Pattern?

    Pattern for managing **distributed transactions** across microservices.
    Each service performs local transaction.

    Types:
        1. **Choreography** – Event-based, Less coupling
        2. **Orchestration** – Central controller, Easier control

    Example:
        Order → Payment → Inventory  
        If payment fails → rollback order

---

### 18. How do you maintain data consistency?

    * Saga pattern
    * Eventual consistency
    * Asynchronous messaging

---

### 19. What is Event-Driven Microservices?

    Services communicate using **events** instead of direct calls.

    Example:
        - OrderPlacedEvent
        - PaymentCompletedEvent

    Improves scalability & decoupling.

---

### 20. What is Idempotency?

    Same request executed multiple times gives **same result**.

    Example:
        ```http
        POST /payments (same transactionId)
    Payment API retry should not charge twice.

---

### 21. What is Statelessness in Microservices?

    Services do not store session state.

    Session stored in:
        * JWT
        * Redis

---

### 22. Why each microservice should have its own DB?

    - Avoid tight coupling
    - Independent scaling
    - Prevent shared failures
---

### 23. What is Docker in Microservices?

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

### 24. What is Kubernetes?

    Container orchestration platform used to manage containers.

    Features:
        * Auto scaling
        * Self healing
        * Load balancing
        * Deployment management

---

### 25. How do you secure microservices?

    * JWT authentication
    * OAuth2
    * HTTPS
    * API Gateway security
    * Role based access control

---

### 26. What is OAuth2?

    Authorization framework using **access tokens**.s

    Flow:
        Client → Auth Server → Access Token → Resource Server

---

### 27. What is JWT?

    JSON Web Token used for **stateless authentication**.

    Contains:
        * Header
        * Payload
        * Signature

---

### 28. What is Blue-Green Deployment?

    Two environments:
        * Blue (current)
        * Green (new)

    Switch traffic after testing → **Zero downtime**

---

### 29. What is Canary Deployment?

    Deploy new version to **small % of users** first.

    If stable → rollout fully.

---

### 30. What is Versioning in Microservices?

    API versioning example:
        /api/v1/users
        /api/v2/users

---

### 31. Real-Time Microservices Example?

    Banking System:
        * Customer Service
        * Account Service
        * Transaction Service
        * Notification Service

    Flow:
        Customer → API Gateway → Account → Transaction → Notification
---

### 32. How does Eureka based discovery work in Spring Boot?

    1. Service starts
    2. Registers with Eureka server
    3. Other services request the service name
    4. Eureka provides service instance
---

### 33. How is routing handled in Spring Cloud Gateway?

    Routing is configured using **path predicates**.

    Example:
        /api/orders → order-service

---

### 34. What is client-side load balancing?

    The client chooses which service instance to call.
    Spring Cloud LoadBalancer selects one instance automatically.

---

### 35. What is configuration refresh in microservices?

    Allows configuration updates **without restarting services**.

    Example:-
        /actuator/refresh

---

### 36. How do you implement asynchronous communication in microservices?

    Using message brokers:-
                            * Kafka
                            * RabbitMQ

---

### 37. What is database per service pattern?

    Each microservice manages its own database.
    Other services cannot access it directly.

---

### 38. How do you containerize Spring Boot microservices?

    Using Dockerfile:-
       
                FROM openjdk:17
                COPY app.jar app.jar
                ENTRYPOINT ["java","-jar","app.jar"]

---

### 39. Why do we need container orchestration in microservices?

    To manage hundreds of containers efficiently.

---

### 40. How is JWT propagated across services in microservices?

    JWT token passed via HTTP header.

            Authorization: Bearer token

---

### 41. What is Fault Tolerance in microservices?

    System continues functioning even if one service fails.

---

### 42. What do you understand by Domain Driven Design?

    Designing services based on **business domains**.

    Example:
        Order Service, Payment Service.

---

### 43. What is bounded context in microservices?

    Clear boundary for domain models.
    Each service owns its domain.

---

### 44. Suppose there are 10 microservices. How will you debug an issue?

    Using:
            * distributed tracing
            * traceId
            * centralized logging

---

### 45. When serviceA calls serviceB how is session maintained?

    Using **JWT token forwarding**.

---

### 46. Huge load logs many users. How to identify one user logs in microservices?

    Using:
        * traceId
        * userId
        * correlationId

---

### 47. Have you worked on event sourcing in microservices?

    Event sourcing stores **events instead of current state**.

---

### 48. How do you maintain scalability in microservices?

    * Stateless services
    * Horizontal scaling
    * Container orchestration

---

### 49. What is health check and readiness probe in microservices?

    Health check: Service is alive.
    Readiness probe: Service is ready to accept traffic.

    Example:
        /actuator/health
        /actuator/ready

---

### 50. What is centralized logging in microservices?

    Collecting logs from all services into one system.

    Example:
        ELK stack.

---

### 51. How do you monitor microservices?

    Using monitoring tools:

            * Prometheus
            * Grafana

---

### 52. What is contract testing in microservices?

    Ensures API compatibility between services.

    Example: Pact testing.

---

### 53. How do you avoid cascading failures in microservices?

    Using:
        * circuit breaker
        * timeout
        * retry
        * fallback

---

### 54. What is timeout and retry strategy in microservices?

    Timeout defines waiting time.
    Retry attempts call again if failure occurs.

---

### 55. What is schema evolution in microservices?

    Safe database schema changes without breaking services.

---

### 56. What is sidecar pattern in microservices?

    Helper container running alongside service.

    Example:
        Logging proxy container.

---

### 57. What is the strangler pattern in microservices?

    Used to migrate monolith to microservices gradually.

---

### 58. How do you test microservices?

    Testing levels:-
        * Unit tests
        * Integration tests
        * Contract tests
        * End-to-end tests

---

### 59. What is service mesh in microservices?

    Infrastructure layer for service communication.

    Example:-
        Istio.


*/
