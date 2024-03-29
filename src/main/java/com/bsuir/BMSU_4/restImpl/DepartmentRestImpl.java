package com.bsuir.BMSU_4.restImpl;

import com.bsuir.BMSU_4.model.Department;
import com.bsuir.BMSU_4.model.Employee;
import com.bsuir.BMSU_4.rest.DepartmentRest;
import com.bsuir.BMSU_4.service.DepartmentService;
import com.bsuir.BMSU_4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class DepartmentRestImpl implements DepartmentRest {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Override
    public List<Department> showAllDepartments() {
        return departmentService.showAllDepartments();
    }

    @Override
    public String addDepartment(Department department) {
        departmentService.addDepartment(department);
        return "Department was added successfully!";
    }
}
