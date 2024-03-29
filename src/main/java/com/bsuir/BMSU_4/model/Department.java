package com.bsuir.BMSU_4.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;


}
