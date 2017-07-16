package com.redcode.demo.domain;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/7/16.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6679406910975939138L;

    private Long id;

    private String username;

    private Integer age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
