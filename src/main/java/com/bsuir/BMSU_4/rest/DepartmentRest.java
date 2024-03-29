package com.bsuir.BMSU_4.rest;

import com.bsuir.BMSU_4.model.Department;
import com.bsuir.BMSU_4.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/department")
public interface DepartmentRest {


    @GetMapping("/all") //work
    public List<Department> showAllDepartments();

    @PostMapping("/add-department") //work
    public String addDepartment(@RequestBody Department department);
}
