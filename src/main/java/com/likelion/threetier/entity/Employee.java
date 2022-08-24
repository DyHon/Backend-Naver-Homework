package com.likelion.threetier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="Employee_Id", nullable = false)
    private Long employeeId;

    @Column(name="Name", length=64, nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name="Birth_Date", nullable = false)
    private Date birthDate;

    @Column(name="Gender", nullable = false)
    private String gender;

    @ManyToOne
    @JoinColumn(name = "Department_Id")
    private Department departmentId;
}
