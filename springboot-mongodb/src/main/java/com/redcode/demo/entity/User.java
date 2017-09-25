package com.redcode.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import javax.jws.soap.SOAPBinding;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public class User {

    //id属性是给mongodb用的，用@Id注解修饰
    @Id
    private String id;

    private String username;

    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public User(String id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
