package com.projects.pojo;
import java.io.Serializable;

public class User implements Serializable{
    private Integer id ;
    public User(){}
    public void setTest(Integer test) {
        this.id = test;
    }

    public Integer getTest() {
        return id;
    }
}
