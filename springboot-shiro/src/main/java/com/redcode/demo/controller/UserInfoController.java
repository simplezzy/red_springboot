package com.redcode.demo.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhiyu.zhou on 2017/9/26.
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @RequestMapping("/list")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
        return "user";
    }

    @RequestMapping("/add")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userAdd";
    }

    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userDel";
    }
}
