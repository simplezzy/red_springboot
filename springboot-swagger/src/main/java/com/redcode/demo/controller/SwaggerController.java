package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/16.
 */

@RestController
@RequestMapping("swagger")
public class SwaggerController {

    @RequestMapping("/index")
    public String swaggerIndex() {
        return "swagger index" + " " + new Date();
    }


}
