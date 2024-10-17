# CRUD-Operation

# CrudNimap Application


## Overview

Welcome to CrudNimap! This is a powerful CRUD (Create, Read, Update, Delete) application built with Spring Boot, JPA, and Hibernate. It allows users to manage categories and products seamlessly, with a clear focus on user experience and efficiency.

## Features

- User-Friendly Interface: Easy navigation with a clean design.
- CRUD Operations: Create, read, update, and delete categories and products.
- Data Persistence: Secure storage of data using a relational database (MySQL).
- One-to-Many Relationship: Each category can have multiple products.
- Server-Side Pagination: Efficient data retrieval with pagination support.
- Detailed Responses: Fetch single product details along with its category information.

## Technologies Used

- Java 17: The latest version for optimal performance.
- Spring Boot: Simplifies the development of Java applications.
- JPA & Hibernate: For managing relational data.
- MySQL: A reliable relational database management system.


## API Endpoints

### Category CRUD Operations

1. **Get All Categories (with Pagination)**  
    
   `GET http://localhost:8080/api/categories?page=0`

![Screenshot 2024-10-16 160150](https://github.com/user-attachments/assets/5209ddae-bdce-45a9-9461-16b60508cfb5)

2. **Create New Category**  
 
   `POST http://localhost:8080/api/categories`
![Screenshot 2024-10-17 064024](https://github.com/user-attachments/assets/c3b6b7e9-c8b9-4683-8b0a-eaef35018e70)

3. **Get Category by ID**  
    
   `GET http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-16 135811](https://github.com/user-attachments/assets/2e9cc11c-6420-4849-9ee5-a8aeb9c8053f)

4. **Update Category by ID**  
  
   `PUT http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-16 140130](https://github.com/user-attachments/assets/31c9ed08-1d6c-425f-8788-7d41f71a48f6)

5. **Delete Category by ID**  
  
   `DELETE http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-16 140203](https://github.com/user-attachments/assets/372c4f51-fa38-4527-a6f7-5231fe2619aa)

### Product CRUD Operations

1. **Get All Products (with Pagination)**  
  
   `GET http://localhost:8080/api/products?page=2`

2. **Create New Product**  
   
   `POST http://localhost:8080/api/products`

3. **Get Product by ID**  
  
   `GET http://localhost:8080/api/products/{id}`  
  

4. **Update Product by ID**  
 
   `PUT http://localhost:8080/api/products/{id}`
![Screenshot 2024-10-17 064511](https://github.com/user-attachments/assets/03029e56-a58a-41da-a92b-a4888eb1a847)

5. **Delete Product by ID**  
  
   `DELETE http://localhost:8080/api/products/{id}`
![Screenshot 2024-10-17 064511](https://github.com/user-attachments/assets/ac7abe47-4b60-4dbb-8860-a684b49d6905)

## Getting Started

Follow these steps to set up the application on your local machine:

### Prerequisites

- JDK 17 or higher
- Maven
- MySQL Server

### Installation

1. **Clone the repository**:
  
   git clone https://github.com/its-vaishu2405/CrudNimap.git
  

2. **Navigate to the project directory**:
 
   cd CrudNimap
  

3. **Configure the MySQL database**:
   - Create a database named `crudnimap`.
   - Update the `application.properties` file with your MySQL credentials.

4. Build the project:
   
   mvn clean install
 

5. Run the application:
 
   mvn spring-boot:run
   

### Accessing the Application

Open your web browser and navigate to [http://localhost:8080](http://localhost:8080) to start using CrudNimap!

## Contributing

We welcome contributions! If you have suggestions or want to improve the project, please fork the repository and create a pull request.

### Steps to Contribute:

1. Fork the repository
2. Create a new branch 
3. Make your changes
4. Commit your changes 
5. Push to the branch 
6. Open a pull request

