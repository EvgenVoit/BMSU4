package com.bsuir.BMSU_4.DAO;

import com.bsuir.BMSU_4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    Employee getEmployeeByEmail(String email);

    void deleteEmployeeByEmail(String email);

    void deleteById(Integer id);

    Employee getEmployeeById(Integer id);
}
