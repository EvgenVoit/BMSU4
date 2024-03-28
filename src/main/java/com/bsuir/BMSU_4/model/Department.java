package com.bsuir.BMSU_4.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_email")
    private String departmentEmail;

    @Column(name = "department_phone")
    private String departmentPhone;


}
