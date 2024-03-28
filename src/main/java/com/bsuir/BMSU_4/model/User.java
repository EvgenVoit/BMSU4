package com.bsuir.BMSU_4.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "contactNumber")
//    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

//    @Column(name = "status")
//    private String status;

    @Column(name = "role")
    private String role;
}
