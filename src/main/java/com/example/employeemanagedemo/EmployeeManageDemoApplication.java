package com.example.employeemanagedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class EmployeeManageDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeManageDemoApplication.class, args);
    }

}
