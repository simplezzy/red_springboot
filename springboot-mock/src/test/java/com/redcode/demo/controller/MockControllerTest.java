package com.redcode.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.redcode.demo.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zhiyu.zhou on 2017/7/14.
 */
public class MockControllerTest extends BaseTest {

    private MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationConnect;

    @Before
    public void setUp() throws JsonProcessingException {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }

    @Test
    public void mockIndex() throws Exception {
        String uri = "/mock/index";
        MvcResult mvcResult = mvc.perform(
                MockMvcRequestBuilders.get(uri)
                        .accept(MediaType.APPLICATION_JSON))
                        .andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println("status:" + status + "/content:" + content);
    }

}