package com.redcode.demo.constant;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
public class RabbitQueueConstants {

    private RabbitQueueConstants() {

    }
    /**
     * 业务交换机、死信交换机、告警交换机
     * exchange===routingKey====queue
     */
    public static final String EXCHANGE_business = "exchange_business";

    public static final String EXCHANGE_ALERT = "exchange_alert";

    public static final String EXCHANGE_DEAD = "exchange_dead";
    //routingKey
    public static final String ROUTING_KEY_TASK_DEF = "routing_key_task_def";

    public static final String ROUTING_KEY_TASK_HELLO = "routing_key_task_hello";

    public static final String ROUTING_KEY_ALERT = "routing_key_alert";

    public static final String ROUTING_KEY_DEAD = "routing_key_dead";

    //queue
    public static final String QUEUE_TASK_TEST = "queue_task_test";

    public static final String QUEUE_TASK_HELLO = "queue_task_hello";

    public static final String QUEUE_ALERT = "queue_alert";

    public static final String QUEUE_DEAD = "queue_dead";
}
