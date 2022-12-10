package com.karthik.department.controller;

import com.karthik.department.entity.Department;
import com.karthik.department.service.DeparmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DeparmentService deparmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment in DeartmentController");
        return deparmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("Inside findByDepartmentId in DeartmentController");
        return deparmentService.findByDepartmentId(departmentId);
    }
}
