package com.redcode.springboot.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Erichou on 6/17/17.
 */
@Controller
public class HelloController {

    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello zzy!";
    }

    @RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
    public String testThymeleaf(Model model) {
        model.addAttribute("name", "Eric");
        return "thymeleaf";
    }
}
