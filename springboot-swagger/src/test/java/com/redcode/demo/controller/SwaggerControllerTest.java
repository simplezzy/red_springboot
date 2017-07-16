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

/**
 * Created by zhiyu.zhou on 2017/7/16.
 */
public class SwaggerControllerTest extends BaseTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext  webApplicationConnect;

    @Before
    public void setUp() throws JsonProcessingException {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }

    @Test
    public void swaggerIndex() throws Exception {

        String uri = "/swagger/index";
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri)
        .accept(MediaType.APPLICATION_JSON)).andReturn();
        System.out.println("status:" + result.getResponse().getStatus() + "----content:" + result.getResponse().getContentAsString());
    }
}