package com.projects.Test;

import com.projects.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class UserTest {
    @Autowired
    private UserService userService;
    @Test
    public Integer getAllUser(){
        Integer allUser = userService.listAllUser();
        System.out.println("+8++8+8+");
        System.out.println(allUser);
        System.out.println("65656665656565656");
        return allUser;
    }
}
