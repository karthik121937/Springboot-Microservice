package com.karthik.user.service;

import com.karthik.user.entity.User;
import com.karthik.user.repository.UserRepository;
import com.karthik.user.valueobjects.Department;
import com.karthik.user.valueobjects.UserDepartmentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser in UserService");
        return userRepository.save(user);
    }

    public UserDepartmentVO getUserWithDepartment(Long id) {
        log.info("Inside getUserWithDepartment in UserService");
        User user = userRepository.findByUserId(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
                ,Department.class);

        UserDepartmentVO userDepartmentVO = UserDepartmentVO.builder()
                .department(department)
                .user(user)
                .build();
        return userDepartmentVO;
    }
}
