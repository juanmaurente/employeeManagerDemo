# employeeManagerDemo

##Introduction
This project is a simple CRUD application that allows you to perform basic operations (create, read, update, and delete) on employees of a company. It was developed using Java and Spring framework.

##Architecture
The project is based on the Model-View-Controller (MVC) architectural pattern, which separates the application logic into three interconnected components: the Model, the View, and the Controller.

The Model represents the data and the business logic of the application. In this project, the Employee class represents the data model of the application.
The View is responsible for displaying the data to the user. In this project, the views are built using Thymeleaf templates.
The Controller handles the communication between the Model and the View, and it's implemented using Spring's RestController.
The project also uses Spring Data JPA to interact with a MySQL database. JPA stands for Java Persistence API, and it's a standard API for persisting Java objects to a relational database.

##Getting Started
Here are the steps you need to follow to run this project on your local machine:

1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Make sure you have MySQL installed on your machine.
4. Create a new database named 'employeesdb'
5. Update the application.properties file with your MySQL credentials.
6. Run the project using the command mvn spring-boot:run
7. Open your browser and go to http://localhost:8080
8. You can also test the different endpoints using Postman, the endpoints are:

- GET /employees: returns a list of all employees in the database
- GET /employees/{id}: returns the employee with the specified ID
- POST /employees: creates a new employee
- PUT /employees/{id}: updates the employee with the specified ID
- DELETE /employees/{id}: deletes the employee with the specified ID
