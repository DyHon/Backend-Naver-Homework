package com.likelion.threetier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue
    @Column(name="Department_Id", nullable = false)
    private Long departmentId;

    @Column(name="Dept_Name", length=64, nullable = false)
    private String dept_name;

    @Column(name="Description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "departmentId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees;
}
