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

![Screenshot 2024-10-24 074822](https://github.com/user-attachments/assets/879cf76e-0ca7-49ba-84de-9821b39dbbe8)


2. **Create New Category**  
 
   `POST http://localhost:8080/api/categories`
![Screenshot 2024-10-24 074958](https://github.com/user-attachments/assets/f32ad7f2-4beb-402b-9f38-9c79e722c3b3)

3. **Get Category by ID**  
    
   `GET http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-24 075052](https://github.com/user-attachments/assets/b10f073d-42e4-4306-a63a-78e9793ac572)

4. **Update Category by ID**  
  
   `PUT http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-24 081033](https://github.com/user-attachments/assets/cfcec78a-b6e4-44c1-9a8b-378cf218bf1f)

5. **Delete Category by ID**  
  
   `DELETE http://localhost:8080/api/categories/{id}`
![Screenshot 2024-10-24 081148](https://github.com/user-attachments/assets/2ed80886-b581-415b-bc62-084ffa286df6)

### Product CRUD Operations

1. **Get All Products (with Pagination)**  
  
   `GET http://localhost:8080/api/products?page=2`
![Screenshot 2024-10-24 081236](https://github.com/user-attachments/assets/894b80ff-9a7b-4503-8519-fb3b231ca943)

2. **Create New Product**  
   
   `POST http://localhost:8080/api/products`
![Screenshot 2024-10-24 081645](https://github.com/user-attachments/assets/154f3ee6-fdc1-451a-8401-6be70b7017f6)

3. **Get Product by ID**  
  
   `GET http://localhost:8080/api/products/{id}`  
  ![Screenshot 2024-10-24 081742](https://github.com/user-attachments/assets/c7bea9bc-2489-4a22-9014-80016693b990)


4. **Update Product by ID**  
 
   `PUT http://localhost:8080/api/products/{id}`
![Screenshot 2024-10-24 082007](https://github.com/user-attachments/assets/2b2eb51c-d7e2-4b33-9cbc-e0d4041610da)

5. **Delete Product by ID**  
  
   `DELETE http://localhost:8080/api/products/{id}`
![Screenshot 2024-10-24 082118](https://github.com/user-attachments/assets/43dfadb2-364f-4f6f-8ebe-728adc2901ac)

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

