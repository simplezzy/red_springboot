package com.redcode.demo.controller;

import com.redcode.demo.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/7/18.
 */
@RestController
@RequestMapping("/exc")
public class ExceptionController {

    @RequestMapping("/index")
    public String exceptionIndex() {
        return "exception index" + new Date();
    }

    @RequestMapping("/test")
    public String exceptionTest() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String exceptionJson() throws MyException {
        throw new MyException("Json错误");
    }
}
