# Microservices Spring Boot Application

This is a sample microservices application built with Spring Boot.

## Overview

This application consists of multiple microservices that work together to achieve a specific business functionality. Each microservice is designed to be independent and can be deployed and scaled independently.

## Modules

- **Api Gate Way**: All Request come to api gate way and it will redirect to according microservice.
- **service Registry**: To keep a tack of all the microservices.
- **Quiz Service**: microservice related to quiz.
- **Question Service**: microservice related to question.

## Prerequisites

- Java 11 or later
- Maven
- Docker (optional, for containerization)
- Postgresql

## Getting Started

1. **Clone the repositor:**

    ```bash
    git clone https://github.com/princeSoftsages/microservice-spring-boot.git
    cd microservices-spring-boot
    ```
2. **Run all the services**


## Configuration

Each microservice may have its configuration files. Make sure to check the `application.properties` or `application.yml` files in each service for specific configuration settings.

