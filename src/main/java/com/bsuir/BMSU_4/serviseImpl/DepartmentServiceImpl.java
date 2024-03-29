package com.bsuir.BMSU_4.serviseImpl;

import com.bsuir.BMSU_4.DAO.DepartmentDao;
import com.bsuir.BMSU_4.model.Department;
import com.bsuir.BMSU_4.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    @Override
    public Department addDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public List<Department> showAllDepartments() {
        return departmentDao.findAll();
    }

    @Override
    public Department findDepartmentById(Integer departmentID) {
        return departmentDao.findById(departmentID).get();
    }
}
