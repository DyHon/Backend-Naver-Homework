package com.likelion.threetier.service.DepartmentService.impl;

import com.likelion.threetier.entity.Department;
import com.likelion.threetier.repository.Department.DepartmentRepository;
import com.likelion.threetier.service.DepartmentService.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository deptRepository;

    @Override
    public String createNewDepartment(Department dept) {
        deptRepository.save(dept);
        return "Create successful";
    }

    @Override
    public List<Department> findAll() {
        return deptRepository.findAll();
    }

    @Override
    public Optional<Department> getById(long deptId) {
        return deptRepository.findById(deptId);
    }
}
