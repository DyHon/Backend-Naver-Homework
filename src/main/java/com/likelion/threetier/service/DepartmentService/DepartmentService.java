package com.likelion.threetier.service.DepartmentService;

import com.likelion.threetier.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    String createNewDepartment(Department dept);

    List<Department> findAll();

    Optional<Department> getById(long deptId);
}
