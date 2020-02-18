package com.projects.web.controller;

import com.projects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ShowAllUser {
    @Autowired
    private UserService userService;
    @RequestMapping("/showalluser")
    public String getAllUser(HttpServletRequest request, HttpServletResponse response){
        Integer user = userService.listAllUser();
        System.out.println("user:  "+user);
        request.setAttribute("user",user);
        return "index";
    }
}
