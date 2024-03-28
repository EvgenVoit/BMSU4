package com.bsuir.BMSU_4.rest;

import com.bsuir.BMSU_4.model.Employee;
import com.bsuir.BMSU_4.model.User;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/employee")
public interface EmployeeRest {

    @GetMapping("/all") //work
    public List<Employee> showAllEmployees();

    //todo
    @PutMapping("/update-employee/{id}")
    public String updateEmployee(@PathVariable Integer id, @RequestBody Employee employee);

    @PostMapping("/add-employee") //work
    public String addEmployee(@RequestBody Employee employee);

    @GetMapping("/getByEmail/{email}") //work
    public Employee getEmployeeByEmail(@PathVariable String email);

    @GetMapping("/employee-statistics") //work
    public Map<String, Object> getEmployeeStatistics();

    @DeleteMapping("/delete-employee/{id}") //work
    @Transactional
    public void deleteEmployee(@PathVariable Integer id);
}
