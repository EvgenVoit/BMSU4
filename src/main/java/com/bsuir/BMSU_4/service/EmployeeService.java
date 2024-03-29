package com.bsuir.BMSU_4.service;

import com.bsuir.BMSU_4.model.Employee;
import com.bsuir.BMSU_4.model.User;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> showAllEmployees();

    Employee updateEmployee(Integer id, Employee employee);

    Employee getEmployeeByEmail(String email);

    Object getTotalEmployees();

    Object getAverageSalary();
    void deleteEmployee(Integer id);

    Employee findEmployeeById(Integer id);
}
