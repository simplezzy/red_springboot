package com.redcode.demo.listener;

import com.redcode.demo.constant.RabbitQueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
@Component
@Slf4j
public class MessageListener {

    @RabbitHandler
    @RabbitListener(queues = RabbitQueueConstants.QUEUE_TASK_HELLO, containerFactory="rabbitListenerContainerFactory")
    public void onMainMessage(String content) {
        log.info("onMainMessage start:{}", content);
        System.out.println("onMainMessage:" + content);
        //TODO:Service
    }
}
