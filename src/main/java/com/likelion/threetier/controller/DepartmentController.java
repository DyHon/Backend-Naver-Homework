package com.likelion.threetier.controller;

import com.likelion.threetier.entity.Department;
import com.likelion.threetier.entity.Employee;
import com.likelion.threetier.service.DepartmentService.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl deptServiceImpl;

    @RequestMapping("")
    public String allDeptPage(Model model)
    {
        System.out.println("loading...");
        List<Department> depts=(List<Department>) deptServiceImpl.findAll();
        model.addAttribute("depts", depts);
        return "department";

    }

    @RequestMapping("/new")
    public String renderCreateForm(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "new_dept";
    }

    @PostMapping(value = "/create")
    public String createNewDepartment(@ModelAttribute("department") Department dept) {
        System.out.println("creating...");
        deptServiceImpl.createNewDepartment(dept);
        return "redirect:/department/";
    }

    @GetMapping("/edit/{departmentId}")
    public String renderEditForm(@PathVariable(value = "departmentId") Long deptId, Model model) {
        Optional<Department> dept = deptServiceImpl.getById(deptId);
        model.addAttribute("department", dept);
        return "update_department";
    }

    @GetMapping("/{departmentId}/employees")
    public String showEmployees(@PathVariable(value = "departmentId") Long deptId, Model model) {
        Optional<Department> dept = deptServiceImpl.getById(deptId);
        List<Employee> employees = dept.get().getEmployees();
        model.addAttribute("department", dept);
        return "employees_of_department";
    }

    @RequestMapping("/{departmentId}/employee/new")
    public String renderEmployeeCreateForm(@PathVariable("departmentId") Long deptId, Model model) {
        Employee emp = new Employee();
        Optional <Department> departmentOptional = deptServiceImpl.getById(deptId);
        Department dept = departmentOptional.get();
        System.out.println(dept);
        emp.setDepartmentId(dept);
        model.addAttribute("employee", emp);
        return "new_employee";
    }
}
