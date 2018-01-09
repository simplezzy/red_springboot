package com.redcode.demo.send.manager;

import com.redcode.demo.constant.RabbitQueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
@Service
@Slf4j
public class SendManager {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendMessage(String message) {
        log.info("send to mq: message={}","main message test");
        try{
            rabbitTemplate.convertAndSend(RabbitQueueConstants.QUEUE_TASK_HELLO, message);
        } catch (Exception e) {
            log.error("send to mq error: {}", "send error", e);
        }
    }
}
