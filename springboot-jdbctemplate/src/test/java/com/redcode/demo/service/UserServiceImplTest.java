package com.redcode.demo.service;

import com.redcode.demo.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public class UserServiceImplTest extends BaseTest {

    @Autowired
    private UserService userServiceImpl;

    @Test
    public void getAllUsers() throws Exception {
        int row = userServiceImpl.getAllUsers();
        System.out.println("row:" + row);
    }

    @Test
    public void insertUser() throws Exception {
    }

}