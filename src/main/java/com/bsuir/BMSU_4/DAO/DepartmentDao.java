package com.bsuir.BMSU_4.DAO;

import com.bsuir.BMSU_4.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

    Department getDepartmentById(Integer id);
}
