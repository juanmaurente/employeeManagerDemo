package com.example.employeemanagedemo.repository;


import com.example.employeemanagedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
    List<Employee> findByEmail(String email);
    List<Employee> findBySalaryGreaterThan(double salary);


}
