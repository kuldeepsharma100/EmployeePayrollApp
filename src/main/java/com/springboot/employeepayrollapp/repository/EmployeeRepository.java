package com.springboot.employeepayrollapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
