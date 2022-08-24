package com.likelion.threetier.controller;

import com.likelion.threetier.entity.Department;
import com.likelion.threetier.entity.Employee;
import com.likelion.threetier.service.EmployeeService.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeServiceIml;

    @RequestMapping("")
    public String allEmployeePage(Model model)
    {
        System.out.println("loading...");
        List<Employee> employees = (List<Employee>) employeeServiceIml.findAll();
        model.addAttribute("employees", employees);
        return "employees";

    }

    @PostMapping(value = "/create")
    public String createNewEmployee(@ModelAttribute("employee") Employee emp) {
        System.out.println("creating...");
        employeeServiceIml.createNewEmployee(emp);
        Department dept = emp.getDepartmentId();
        return "redirect:" + dept.getDepartmentId() + "/employees/";
    }
}
