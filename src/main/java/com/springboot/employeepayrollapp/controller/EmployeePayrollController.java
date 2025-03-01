package com.springboot.employeepayrollapp.controller;
import com.springboot.employeepayrollapp.model.EmployeePayroll;
import com.springboot.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeePayrollService;

    @GetMapping("/department/{department}")
    public List<EmployeePayroll> getEmployeesByDepartment(@PathVariable String department) {
        log.info("Received request to fetch employees from department: {}", department);
        return employeePayrollService.getEmployeesByDepartment(department);
    }
}
