package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
@RestController
@RequestMapping("/jpa")
public class JpaController {

    @RequestMapping("/index")
    public String jpsIndex() {
        return "jps index" + new Date();
    }


}
