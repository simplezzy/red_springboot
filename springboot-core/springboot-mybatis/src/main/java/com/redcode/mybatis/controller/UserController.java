package com.redcode.mybatis.controller;

import com.redcode.mybatis.domain.User;
import com.redcode.mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erichou on 6/20/17.
 */

@RestController
public class UserController {

    //注入Service服务对象
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hello() {
        return "hello user";
    }

    @RequestMapping("pojo")
    public User pojoUser() {
        User user = new User();
        user.setId(11);
        user.setUser_name("zzy");
        user.setPassword("abc");
        user.setTime(new Date());
        return  user;
    }

    @RequestMapping("maps")
    public Map<String, Object> showMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aa","hello");
        map.put("bb","zzy");
        return  map;
    }

    @RequestMapping("ssm/{id}")
    public User ssmUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
