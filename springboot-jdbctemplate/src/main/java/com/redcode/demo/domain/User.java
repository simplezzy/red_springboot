package com.redcode.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public class User implements Serializable{
    private static final long serialVersionUID = -6679406910975939138L;

    private int id;

    private String lastName;

    private int age;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
