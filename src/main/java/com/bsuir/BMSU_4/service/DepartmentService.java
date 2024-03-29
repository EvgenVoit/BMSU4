package com.bsuir.BMSU_4.service;

import com.bsuir.BMSU_4.model.Department;
import com.bsuir.BMSU_4.model.Employee;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);

    List<Department> showAllDepartments();

    Department findDepartmentById(Integer departmentID);
}
