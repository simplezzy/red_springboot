package com.redcode.demo.mqconfig;

import com.redcode.demo.constant.RabbitQueueConstants;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue(RabbitQueueConstants.QUEUE_TASK_HELLO);
    }

    @Bean
    public Queue taskQueue() {
        return new Queue(RabbitQueueConstants.QUEUE_TASK_TEST);
    }

    @Bean
    public Queue deadQueue() {
        return new Queue(RabbitQueueConstants.QUEUE_DEAD);
    }

    @Bean
    public Exchange businessExchange() {
        return new TopicExchange(RabbitQueueConstants.ROUTING_KEY_TASK_HELLO);
    }

    @Bean
    public Exchange taskExchange() {
        return new TopicExchange(RabbitQueueConstants.ROUTING_KEY_TASK_DEF);
    }

    @Bean
    public Exchange deadExchange() {
        return new FanoutExchange(RabbitQueueConstants.QUEUE_DEAD);
    }

    @Bean
    public Binding bindingHelloTaskQueueExchange(Queue helloTaskQueue, Exchange businessExchange) {
        return BindingBuilder.bind(helloTaskQueue).to(businessExchange).with(RabbitQueueConstants.ROUTING_KEY_TASK_HELLO).noargs();
    }

    @Bean
    public Binding bindingTaskQueueExchange(Queue TaskQueue, Exchange taskExchange) {
        return BindingBuilder.bind(taskExchange).to(taskExchange).with(RabbitQueueConstants.ROUTING_KEY_TASK_DEF).noargs();
    }

    @Bean
    public Binding bindingDeadQueueExchange(Queue deadQueue, Exchange deadExchange) {
        return BindingBuilder.bind(deadQueue).to(deadExchange).with(RabbitQueueConstants.ROUTING_KEY_TASK_DEF).noargs();
    }

}
