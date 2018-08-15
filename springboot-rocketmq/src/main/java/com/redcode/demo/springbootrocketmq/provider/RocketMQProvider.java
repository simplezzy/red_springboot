package com.redcode.demo.springbootrocketmq.provider;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * Created by zhouzhiyu on 2018/8/6
 */
@Service
public class RocketMQProvider {

    @Value("${apache.rocketmq.producer.producerGroup}")
    private String producerGroup;

    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;

    @PostConstruct
    public void sender() {
        //生产者的组名
        DefaultMQProducer producer = new DefaultMQProducer(producerGroup);
        //指定NameServer地址，多个地址以 ; 隔开
        producer.setNamesrvAddr(namesrvAddr);
        try {
            producer.start();
            Message message = new Message("MyTopic", "push", "发送消息---producer test-----".getBytes());
            StopWatch stop = new StopWatch();
            stop.start();
            for (int i = 0; i < 10; i++) {
                SendResult result = producer.send(message, new MessageQueueSelector() {

                    @Override
                    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                        Integer id = (Integer) arg;
                        int index = id % mqs.size();
                        return mqs.get(index);
                    }
                },1);
                System.out.println("发送响应：MsgId:" + result.getMsgId() + "，发送状态:" + result.getSendStatus());
            }
            stop.stop();
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }
}
