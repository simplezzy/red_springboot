package com.redcode.demo;

import com.redcode.demo.listener.MessageListener;
import com.redcode.demo.send.manager.SendManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
public class ServiceTest extends BaseTest {

    @Autowired
    private SendManager sendManager;

    @Autowired
    private MessageListener messageListener;

    @Test
    public void sendManagerTest() throws Exception {
        String message = "Hello test";
        sendManager.sendMessage("Hello test");
        messageListener.onMainMessage(message);
        System.out.println("onComplete");
    }

}
