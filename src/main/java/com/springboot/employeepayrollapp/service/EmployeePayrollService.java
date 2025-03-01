package com.springboot.employeepayrollapp.service;
import com.springboot.employeepayrollapp.model.EmployeePayroll;
import com.springboot.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Slf4j
@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    public List<EmployeePayroll> getEmployeesByDepartment(String department) {
        log.info("Fetching employees from department: {}", department);
        return employeePayrollRepository.findEmployeesByDepartment(department);
    }
}
