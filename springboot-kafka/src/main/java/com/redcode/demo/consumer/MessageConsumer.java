package com.redcode.demo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
@Component
public class MessageConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
/*
    @KafkaListener(topics = {"myTopic","test_new"})
    public void processMessage(String content) {
        logger.info("content:" + content);
        System.out.println("consumer content:" + content);
    }*/

    @KafkaListener(topics = {"test_new"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("listen1 " + message.toString());
        }
    }
}
