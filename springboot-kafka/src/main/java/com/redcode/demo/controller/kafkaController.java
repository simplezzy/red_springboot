package com.redcode.demo.controller;

import com.redcode.demo.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
@RestController
@RequestMapping("/kafka")
public class kafkaController {

    @Autowired
    private MessageSender messageSender;

    @RequestMapping("/index")
    public String indexKafka() {
        return "kafka index --" + new Date();
    }

    @RequestMapping("/sendMsg")
    public void sendMsg() throws Exception {
        messageSender.sendMessage();
        System.out.println("messageSender:" + "finish sending");
    }
}
