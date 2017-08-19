package com.redcode.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
@Component
public class MessageConsumer {

    @KafkaListener(topics = "test_topic")
    public void processMessage(String content) {
        System.out.println("consumer content:" + content);
    }
}
