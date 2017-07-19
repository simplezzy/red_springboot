package com.redcode.demo.service;

import com.redcode.demo.domain.User;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public interface UserService {

    Integer getAllUsers();

    void insertUser(User user);
}
