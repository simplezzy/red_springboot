package com.redcode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/8/1.
 */

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @RequestMapping("/index")
    public String scheduleIndex() {
        return "schedule index " + new Date();
    }


}
