package com.springboot.employeepayrollapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.employeepayrollapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
