package com.redcode.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Erichou on 6/17/17.
 */
public class User implements Serializable {

    private Integer id;
    private String user_name;
    private String password;
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", time=" + time +
                '}';
    }
}
