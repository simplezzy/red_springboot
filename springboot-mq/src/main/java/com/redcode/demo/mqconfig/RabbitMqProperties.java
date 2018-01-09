package com.redcode.demo.mqconfig;

import lombok.Data;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */

/**
 * 重试配置
 */
@Configuration
@ConfigurationProperties(prefix = "spring.rabbitmq")
@Data
public class RabbitMqProperties {

    /**
     * Enable publisher confirms.
     */
    private boolean publisherConfirms;

    /**
     * Enable publisher returns.
     */
    private boolean publisherReturns;

    /**
     * Connection timeout, in milliseconds; zero for infinite.
     */
    private Integer connectionTimeout;

    /**
     * Cache configuration.
     */
    private final Cache cache = new Cache();

    /**
     * Listener container configuration.
     */
    private final Listener listener = new Listener();

    private final Template template = new Template();


    @Data
    public static class Cache {

        private final Channel channel = new Channel();

        private final Connection connection = new Connection();

        @Data
        public static class Channel {

            /**
             * Number of channels to retain in the cache. When "check-timeout" > 0, max
             * channels per connection.
             */
            private Integer size;

            /**
             * Number of milliseconds to wait to obtain a channel if the cache size has
             * been reached. If 0, always create a new channel.
             */
            private Long checkoutTimeout;
        }

        @Data
        public static class Connection {

            /**
             * Connection factory cache mode.
             */
            private CachingConnectionFactory.CacheMode mode = CachingConnectionFactory.CacheMode.CHANNEL;

            /**
             * Number of connections to cache. Only applies when mode is CONNECTION.
             */
            private Integer size;
        }

    }

    @Data
    public static class Listener {

        /**
         * Whether rejected deliveries are requeued by default; default true.
         */
        private Boolean defaultRequeueRejected;

        /**
         * Optional properties for a retry interceptor.
         */
        @NestedConfigurationProperty
        private final ListenerRetry retry = new ListenerRetry();
    }

    @Data
    public static class Template {

        @NestedConfigurationProperty
        private final Retry retry = new Retry();

        /**
         * Enable mandatory messages. If a mandatory message cannot be routed to a queue
         * by the server, it will return an unroutable message with a Return method.
         */
        private Boolean mandatory;

        /**
         * Timeout for receive() operations.
         */
        private Long receiveTimeout;

        /**
         * Timeout for sendAndReceive() operations.
         */
        private Long replyTimeout;
    }

    @Data
    public static class Retry {

        /**
         * Whether or not publishing retries are enabled.
         */
        private boolean enabled;

        /**
         * Maximum number of attempts to publish or deliver a message.
         */
        private int maxAttempts = 3;

        /**
         * Interval between the first and second attempt to publish or deliver a message.
         */
        private long initialInterval = 1000L;

        /**
         * A multiplier to apply to the previous retry interval.
         */
        private double multiplier = 1.0;

        /**
         * Maximum interval between attempts.
         */
        private long maxInterval = 10000L;
    }

    @Data
    public static class ListenerRetry extends Retry {

        /**
         * Whether or not retries are stateless or stateful.
         */
        private boolean stateless = true;
    }
}
