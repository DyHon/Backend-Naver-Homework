package com.likelion.threetier.service.EmployeeService;

import com.likelion.threetier.entity.Department;
import com.likelion.threetier.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeService {
    String createNewEmployee(Employee emp);

    List<Employee> findAll();
}
