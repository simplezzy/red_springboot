package com.redcode.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2017/7/14.
 */

@Component
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class ConfigProperties {

    @Value("${spring.com.github.username}")
    private String username;

    @Value("${spring.com.github.desc}")
    private String desc;

    @Value("${spring.com.github.prop.contact}")
    private String contact;

    @Value("${spring.com.random.value}")
    private String random;

    public String getContact() {
        return contact;
    }

    public String getUsername() {
        return username;
    }

    public String getDesc() {
        return desc;
    }

    public String getRandom() {
        return random;
    }
}
