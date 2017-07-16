package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/14.
 */
@RestController
@RequestMapping("/prop")
public class PropController {

    @GetMapping("/index")
    public String proIndex() {
        return "properties index:" + new Date();
    }

}
