package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/23.
 */
@RestController
@RequestMapping("/aop")
public class AopController {

    @RequestMapping("/index")
    public String aopIndex() {
        return "aop index" + new Date();
    }
}
