package com.redcode.demo.mock;

import com.redcode.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyu.zhou on 2017/7/27.
 */
public class UserDao {

    public static List<User> getUserList(int rows) {

        List<User> users = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            User user = new User(10l + i, "eric" + i, new Integer(i + 2), "上海交大" + i);
            users.add(user);
        }
        return users;
    }
}
