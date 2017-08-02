package com.redcode.demo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2017/8/2.
 */
@Component
public class ScheduleJob {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0 0/1 * * * ?")
    public void statusCheck() {
        logger.info("每分钟执行一次,开始执行");
    }

    @Scheduled(fixedRate = 10000)
    private void taskCheck() {
        logger.info("每10s执行一次，开始执行");
    }
}
