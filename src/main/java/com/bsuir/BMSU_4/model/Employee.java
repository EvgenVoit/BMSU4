package com.bsuir.BMSU_4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "joined_date")
    private String joinedDate;

//    @ManyToOne
//    @JoinColumn(name = "department_id")
//    private Department department;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "salary")
    private int salary;

}