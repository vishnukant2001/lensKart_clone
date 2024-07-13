# Lenskart Clone

This is a basic implementation of a Lenskart clone using Java Spring Boot. The project includes functionalities such as user registration, product listing, and cart management.

## Project Structure

lenskart-clone
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── example
│ │ │ └── lenskartclone
│ │ │ ├── LenskartCloneApplication.java
│ │ │ ├── controller
│ │ │ │ ├── UserController.java
│ │ │ │ ├── ProductController.java
│ │ │ │ └── CartController.java
│ │ │ ├── model
│ │ │ │ ├── User.java
│ │ │ │ ├── Product.java
│ │ │ │ └── Cart.java
│ │ │ ├── repository
│ │ │ │ ├── UserRepository.java
│ │ │ │ ├── ProductRepository.java
│ │ │ │ └── CartRepository.java
│ │ │ └── service
│ │ │ ├── UserService.java
│ │ │ ├── ProductService.java
│ │ │ └── CartService.java
│ │ └── resources
│ │ └── application.properties
│ └── test
│ └── java
│ └── com
│ └── example
│ └── lenskartclone
│ └── LenskartCloneApplicationTests.java
└── pom.xml


## Prerequisites

- Java 8 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/lenskart-clone.git
    cd lenskart-clone
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

3. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

4. **Access the application:**

    The application will be accessible at `http://localhost:8080`.

## Endpoints

### User Endpoints

- **Create User**

    ```http
    POST /users
    ```

    **Request Body:**
    ```json
    {
      "username": "john_doe",
      "password": "password123",
      "email": "john@example.com"
    }
    ```

- **Get All Users**

    ```http
    GET /users
    ```

### Product Endpoints

- **Create Product**

    ```http
    POST /products
    ```

    **Request Body:**
    ```json
    {
      "name": "Sunglasses",
      "description": "A pair of cool sunglasses",
      "price": 59.99
    }
    ```

- **Get All Products**

    ```http
    GET /products
    ```

### Cart Endpoints

- **Add to Cart**

    ```http
    POST /carts
    ```

    **Request Body:**
    ```json
    {
      "userId": 1,
      "productId": 2
    }
    ```

- **Get All Cart Items**

    ```http
    GET /carts
    ```

## Application Properties

The application uses an in-memory H2 database. The configuration is set in the `application.properties` file.

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true


Running Tests
To run the tests, execute the following command:
mvn test



Running the Application
To run the application, you can use the following command:

mvn spring-boot:run



