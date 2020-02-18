package com.projects.dao;

import com.projects.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public Integer listAllUser();
}
