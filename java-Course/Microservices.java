/*


                                            *****Microservices (Java – Spring Boot)*****


## 1. What are Microservices?

Microservices are an architectural style where an application is divided into **small, independent services**, each responsible for a specific business function.
Each service runs independently and communicates via APIs.

---

## 2. What is Microservices architecture and how is it different from Monolithic architecture?

| Monolithic         | Microservices           |
| ------------------ | ----------------------- |
| Single application | Multiple small services |
| One deployment     | Independent deployment  |
| Tight coupling     | Loose coupling          |
| One database       | Separate DB per service |

---

## 3. What are the core principles of microservices?

* Single responsibility
* Independent deployment
* Decentralized data management
* API-based communication
* Failure isolation
* Automation & DevOps friendly

---

## 4. How do microservices communicate?

1. **Synchronous** – REST APIs (HTTP)
2. **Asynchronous** – Messaging systems (Kafka, RabbitMQ)

---

## 5. How do services communicate in a Spring Boot microservices system?

Using:

* **REST API**
* **Feign Client**
* **Message brokers (Kafka/RabbitMQ)**

---

## 6. What is Service Discovery?

Service discovery allows services to **automatically find other services** without hardcoding URLs.

Example: **Eureka Server**

---

## 7. What is Eureka Server & Client?

* **Eureka Server** → Service registry
* **Eureka Client** → Registers service with the registry

---

## 8. How does Eureka based discovery work in Spring Boot?

1. Service starts
2. Registers with Eureka server
3. Other services request the service name
4. Eureka provides service instance

---

## 9. What is API Gateway?

API Gateway is the **single entry point for all client requests**.

Responsibilities:

* Routing
* Authentication
* Rate limiting
* Load balancing

Example: **Spring Cloud Gateway**

---

## 10. Why do we need an API Gateway?

* Hide internal services
* Centralized security
* Reduce client complexity
* Handle cross-cutting concerns

---

## 11. How is routing handled in Spring Cloud Gateway?

Routing is configured using **path predicates**.

Example:

```
/api/orders → order-service
```

---

## 12. What is Load Balancing?

Load balancing distributes traffic across multiple service instances.

Example:

```
ORDER-SERVICE → instance1, instance2
```

---

## 13. What is client-side load balancing?

The client chooses which service instance to call.

Example:
Spring Cloud LoadBalancer selects one instance automatically.

---

## 14. What is Circuit Breaker?

Circuit breaker stops calling a failing service and returns fallback response.

Used to prevent **system failure cascading**.

Example: **Resilience4j**

---

## 15. Do you know what is a circuit breaker?

It detects service failures and **opens the circuit** to stop requests temporarily.

---

## 16. What is a Fallback Method?

Fallback method executes when a service fails.

Example:
Return default response if service unavailable.

---

## 17. What is a fallback mechanism?

Alternative response when a remote service fails.

Example:
If payment service fails → return "Payment service unavailable".

---

## 18. What is Config Server?

Centralized configuration management system.

Stores configuration in **Git or remote repository**.

---

## 19. Why use centralized configuration?

* Manage config in one place
* Avoid redeployment
* Environment specific configs

---

## 20. What is centralized configuration in microservices?

All service configurations are stored in **Config Server** and loaded at runtime.

---

## 21. What is configuration refresh in microservices?

Allows configuration updates **without restarting services**.

Example:

```
/actuator/refresh
```

---

## 22. What is Distributed Tracing?

Tracking request flow across multiple services.

Tools:

* Sleuth
* Zipkin

---

## 23. What is distributed tracing and why is it important?

Helps identify:

* performance bottlenecks
* service failures

---

## 24. What is Saga Pattern?

Pattern for managing **distributed transactions** across microservices.

Each service performs local transaction.

---

## 25. Difference between Orchestration and Choreography in Saga?

| Orchestration      | Choreography  |
| ------------------ | ------------- |
| Central controller | Event driven  |
| Easier control     | Less coupling |

---

## 26. How do you maintain data consistency?

Using:

* Saga pattern
* Eventual consistency
* Asynchronous messaging

---

## 27. What is Event-Driven Microservices?

Services communicate via **events instead of direct calls**.

Example:
OrderPlacedEvent → Payment service.

---

## 28. How do you implement asynchronous communication?

Using message brokers:

* Kafka
* RabbitMQ

---

## 29. What is Idempotency?

Same request executed multiple times produces **same result**.

Example:
Payment API retry should not charge twice.

---

## 30. What is idempotency and why is it important?

Prevents duplicate processing during retries.

---

## 31. What is Statelessness in Microservices?

Services do not store session state.

Session stored in:

* JWT
* Redis

---

## 32. Why each microservice should have its own DB?

To avoid tight coupling and allow independent scaling.

---

## 33. What is database per service pattern?

Each microservice manages its own database.

Other services cannot access it directly.

---

## 34. What is Docker in Microservices?

Docker packages application with dependencies into a **container**.

---

## 35. How do you containerize Spring Boot microservices?

Using Dockerfile:

```
FROM openjdk:17
COPY app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
```

---

## 36. What is Kubernetes?

Container orchestration platform used to manage containers.

Features:

* Auto scaling
* Self healing
* Load balancing

---

## 37. Why do we need container orchestration?

To manage hundreds of containers efficiently.

---

## 38. How do you secure microservices?

* JWT authentication
* OAuth2
* HTTPS
* API Gateway security

---

## 39. What is OAuth2?

Authorization framework using **access tokens**.

---

## 40. What is JWT?

JSON Web Token used for **stateless authentication**.

Contains:

* Header
* Payload
* Signature

---

## 41. How is JWT propagated across services?

JWT token passed via HTTP header.

```
Authorization: Bearer token
```

---

## 42. What is Blue-Green Deployment?

Two environments:

* Blue (current)
* Green (new)

Traffic switched after testing.

---

## 43. What is Canary Deployment?

New version released to **small % of users** first.

---

## 44. What is Versioning in Microservices?

API versioning example:

```
/api/v1/users
/api/v2/users
```

---

## 45. What is Fault Tolerance?

System continues functioning even if one service fails.

---

## 46. What do you understand by Domain Driven Design?

Designing services based on **business domains**.

Example:
Order Service, Payment Service.

---

## 47. What is bounded context in microservices?

Clear boundary for domain models.

Each service owns its domain.

---

## 48. For logging, what are you doing in microservices?

Using **centralized logging system**.

Example:
ELK stack.

---

## 49. Suppose there are 10 microservices. How will you debug an issue?

Using:

* distributed tracing
* centralized logging
* traceId

---

## 50. When serviceA calls serviceB how is session maintained?

Using **JWT token forwarding**.

---

## 51. Huge load logs many users. How to identify one user logs?

Using:

* traceId
* userId
* correlationId

---

## 52. Have you worked on event sourcing?

Event sourcing stores **events instead of current state**.

---

## 53. How do you maintain scalability?

* Stateless services
* Horizontal scaling
* Container orchestration

---

## 54. What is health check and readiness?

Health endpoints monitor service status.

Example:

```
/actuator/health
```

---

## 55. What is centralized logging?

Collecting logs from all services into one system.

---

## 56. How do you monitor microservices?

Using monitoring tools:

* Prometheus
* Grafana

---

## 57. What is contract testing?

Ensures API compatibility between services.

Example: Pact testing.

---

## 58. How do you avoid cascading failures?

Using:

* circuit breaker
* timeout
* retry
* fallback

---

## 59. What is timeout and retry strategy?

Timeout defines waiting time.

Retry attempts call again if failure occurs.

---

## 60. What is schema evolution?

Safe database schema changes without breaking services.

---

## 61. What is sidecar pattern?

Helper container running alongside service.

Example:
Logging proxy container.

---

## 62. What is the strangler pattern?

Used to migrate monolith to microservices gradually.

---

## 63. How do you test microservices?

Testing levels:

* Unit tests
* Integration tests
* Contract tests
* End-to-end tests

---

## 64. What is service mesh?

Infrastructure layer for service communication.

Example:
Istio.

---

## 65. What are the biggest challenges in microservices?

* Distributed system complexity
* Debugging difficulty
* Data consistency
* Monitoring


*/
