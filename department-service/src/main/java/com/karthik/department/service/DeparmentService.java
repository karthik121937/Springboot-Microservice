package com.karthik.department.service;

import com.karthik.department.entity.Department;
import com.karthik.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeparmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment at DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        log.info("Inside findByDepartmentId at DepartmentService");
        return departmentRepository.findByDepartmentId(id);
    }
}
