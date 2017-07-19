package com.redcode.demo.service;

import com.redcode.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from t_user", Integer.class);
    }

    @Override
    public void insertUser(User user) {
        jdbcTemplate.update("INSERT INTO t_user(id, last_name, age, create_time) VALUES(?,?,?,?)", user);
    }
}
