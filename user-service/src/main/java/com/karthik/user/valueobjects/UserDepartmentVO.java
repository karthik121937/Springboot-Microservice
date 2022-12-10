package com.karthik.user.valueobjects;

import com.karthik.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDepartmentVO {

    private User user;
    private Department department;

}
