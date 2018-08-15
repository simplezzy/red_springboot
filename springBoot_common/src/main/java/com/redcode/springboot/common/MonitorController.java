package com.redcode.springboot.common;

import com.alibaba.fastjson.JSONObject;
import com.redcode.springboot.entity.Result;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by zhouzhiyu on 2018/7/24
 */
@RestController
public class MonitorController {

    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/monitor")
    @ResponseBody
    public Object getMongodbMonitorData(@RequestBody String data) {
        System.out.println("monitor param:" + data);
        JSONObject object = JSONObject.parseObject(data);
        return object;
    }

    @RequestMapping("/mongdb/monitor/singleSelect")
    @ResponseBody
    public Result<List<Object>> singleSelectData() {

        return null;
    }
}
