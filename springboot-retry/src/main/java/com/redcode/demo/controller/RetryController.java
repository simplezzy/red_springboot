package com.redcode.demo.controller;

import com.redcode.demo.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
/**
 * Created by zhiyu.zhou on 2017/7/20.
 */
@RestController
@RequestMapping("/retry")
public class RetryController {

    @Autowired
    private BusinessService businessServiceImpl;

    @RequestMapping("/index")
    public String retryIndex() {
        return "retry Index" + new Date();
    }


    @RequestMapping("/test")
    public String retryTest() {
        String str = null;
        try {
            str = businessServiceImpl.testRetry();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}


