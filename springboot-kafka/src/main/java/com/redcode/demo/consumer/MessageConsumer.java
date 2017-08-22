package com.redcode.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
@Component
public class MessageConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(topics = "test_topic")
    public void processMessage(String content) {
        logger.info("content:" + content);
        System.out.println("consumer content:" + content);
    }
}
