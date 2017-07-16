package com.redcode.demo.config;

import com.redcode.demo.BaseTest;
import com.redcode.demo.ConfigProperties;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhiyu.zhou on 2017/7/16.
 */
public class ConfigPropertiesTest extends BaseTest {

    @Autowired
    private ConfigProperties configProperties;

    @Test
    public void getProperties() throws Exception {

        String username = configProperties.getUsername();
        String desc = configProperties.getDesc();
        String contact = configProperties.getContact();
        String random = configProperties.getRandom();
        System.out.println(username + desc + " " + contact + " " + random.length() + random);
    }

}