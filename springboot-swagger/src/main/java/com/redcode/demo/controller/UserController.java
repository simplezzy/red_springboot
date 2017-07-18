package com.redcode.demo.controller;

import com.redcode.demo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * Created by zhiyu.zhou on 2017/7/17.
 */
@Api(value = "接口test")
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "获取用户列表", notes = "用户列表")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<User>(users.values());
    }

    @ApiOperation(value = "创建用户", notes = "创建用户")
    @ApiImplicitParam(name = "user",value = "实体User", required = true, dataType = "User")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value = "用户详情", notes = "根据id获取用户")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id) {
        return users.get(id);
    }

}
