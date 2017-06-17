package com.redcode.springboot.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Erichou on 6/17/17.
 */
@Controller
public class JSPController {

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/index")
    public String jspIndex() {
        logger.info("index");
        return "index";
    }

}
