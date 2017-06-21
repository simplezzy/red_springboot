package com.redcode.mybatis.service;

import com.redcode.mybatis.domain.User;
import com.redcode.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by Erichou on 6/20/17.
 */
@Service
//Settings - Editor - Inspections - Spring - Spring Core - Code - Autowiring for Bean Class - warning
public class UserServiceImpl implements UserService {

    //注入Mapper接口代理
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
