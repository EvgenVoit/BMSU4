package com.bsuir.BMSU_4.restImpl;

import com.bsuir.BMSU_4.model.Department;
import com.bsuir.BMSU_4.model.Employee;
import com.bsuir.BMSU_4.model.User;
import com.bsuir.BMSU_4.rest.EmployeeRest;
import com.bsuir.BMSU_4.service.DepartmentService;
import com.bsuir.BMSU_4.service.EmployeeService;
import com.bsuir.BMSU_4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeRestImpl implements EmployeeRest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Override
    public List<Employee> showAllEmployees() {
        return employeeService.showAllEmployees();
    }

    @Override
    public String updateEmployee(Integer id, Employee employee) {
        employeeService.updateEmployee(id,employee);
        return "Employee was updated successfully!";
    }

    @Override
    public String addEmployee(Employee employee) {
//        Department department = departmentService.findDepartmentById(departmentID);
//        employee.setDepartment(department);
        employeeService.addEmployee(employee);
        return "Employee was added successfully!";
    }

    @Override
    public Employee getEmployeeByEmail(String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    @Override
    public Map<String, Object> getEmployeeStatistics() {
        Map<String, Object> statistics = new HashMap<>();
        statistics.put("totalUsers", employeeService.getTotalEmployees());
        statistics.put("averageSalary",employeeService.getAverageSalary());
        return statistics;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeService.deleteEmployee(id);
    }
}
