package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
@RestController
@RequestMapping("/jdbc")
public class JDBCController {

    @RequestMapping("/index")
    public String jdbcIndex() {
        return "jdbc Index" + new Date();
    }
}
