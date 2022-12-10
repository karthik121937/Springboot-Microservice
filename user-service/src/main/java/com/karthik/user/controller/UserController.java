package com.karthik.user.controller;

import com.karthik.user.entity.User;
import com.karthik.user.service.UserService;
import com.karthik.user.valueobjects.UserDepartmentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser in UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserDepartmentVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment in UserController");
        return userService.getUserWithDepartment(userId);
    }
}
