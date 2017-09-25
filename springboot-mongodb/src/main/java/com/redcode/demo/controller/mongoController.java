package com.redcode.demo.controller;

import com.redcode.demo.entity.User;
import com.redcode.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhiyu.zhou on 2017/9/25.
 */
@RestController
@RequestMapping("/mongo")
public class mongoController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/save")
    public String save() {
        User user = new User();
        user.setAge(27);
        user.setUsername("redcat");
        userRepository.save(user);
        return "success";
    }

    @RequestMapping("/find")
    public List<User> find() {
        return userRepository.findAll();
    }


    @RequestMapping("findByName")
    public User findByName() {
        return userRepository.findByUsername("redcat");
    }

}
