package com.redcat.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */

/**
 * 参数说明
 * groupKey	productStockOpLog	group标识，一个group使用一个线程池
 * commandKey	addProductStockOpLog	command标识
 * fallbackMethod	addProductStockOpLogFallback	fallback方法，两者需要返回值和参数相同
 * 超时时间设置	400ms	执行策略，在THREAD模式下，达到超时时间，可以中断
 * 统计窗口（10s）内最少请求数	10	熔断策略
 * 熔断多少秒后去尝试请求	5s	熔断策略，默认值
 * 熔断阀值	10%	熔断策略：一个统计窗口内有10%的请求处理失败，会触发熔断
 * 线程池coreSize	10	默认值（推荐值）
 * 线程池maxQueueSize	-1	即线程池队列为SynchronousQueue
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    @HystrixCommand(fallbackMethod = "indexError", threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "30"),
            @HystrixProperty(name = "maxQueueSize", value = "100"),
            @HystrixProperty(name = "queueSizeRejectionThreshold", value = "20")},
            commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "100"),//指定多久超时，单位毫秒。超时进fallback
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//判断熔断的最少请求数，默认是10；只有在一个统计窗口内处理的请求数量达到这个阈值，才会进行熔断与否的判断
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "10"),//判断熔断的阈值，默认值50，表示在一个统计窗口内有50%的请求处理失败，会触发熔断
    })
    public String indexInfo() {
        return new Date() + "redcat" + " hystrix!";
    }

    public String indexError(Throwable e) {
        e.printStackTrace();
        return new Date() + "call index error";
    }
}
