package com.projects.service.serviceImpl;

import com.projects.dao.UserDao;
import com.projects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Integer listAllUser() {
        System.out.println("进入server---");
        System.out.println("user-services"+userDao.listAllUser());
        return userDao.listAllUser();
    }
}
