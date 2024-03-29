package com.bsuir.BMSU_4.serviseImpl;

import com.bsuir.BMSU_4.DAO.EmployeeDao;
import com.bsuir.BMSU_4.model.Employee;
import com.bsuir.BMSU_4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> showAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee saveEmployee = employeeDao.getEmployeeById(id);
        return employeeDao.save(saveEmployee);
    }

    @Override
    public Employee getEmployeeByEmail(String email) {
        return employeeDao.getEmployeeByEmail(email);
    }

    @Override
    public Object getTotalEmployees() {
        int number = employeeDao.findAll().size();
        return (Integer) number;
    }

    @Override
    public Object getAverageSalary() {
        List<Employee> employees = employeeDao.findAll();
        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        if (employees.size() > 0) {
            return totalSalary / employees.size();
        } else {
            return 0.0;
        }
    }
    @Override
    public void deleteEmployee(Integer id) {
        employeeDao.deleteById(id);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDao.getEmployeeById(id);
    }
}
