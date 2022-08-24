package com.likelion.threetier.service.EmployeeService.impl;

import com.likelion.threetier.entity.Employee;
import com.likelion.threetier.repository.Employee.EmployeeRepository;
import com.likelion.threetier.service.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public String createNewEmployee(Employee emp) {
        employeeRepository.save(emp);
        return "Create successful";
    }
}
