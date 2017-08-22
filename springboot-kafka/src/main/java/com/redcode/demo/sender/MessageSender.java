package com.redcode.demo.sender;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.redcode.demo.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
@Service
public class MessageSender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void sendMessage() {
            Message message = new Message();
            message.setId(System.currentTimeMillis());
            message.setMsg(UUID.randomUUID().toString());
            message.setSendTime(new Date());
            kafkaTemplate.send("test_topic", "key_test", gson.toJson(message));
    }
}
