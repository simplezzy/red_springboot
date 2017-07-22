package com.redcode.demo.service;

import com.redcode.demo.common.Constant;
import com.redcode.demo.common.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2017/7/21.
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private RetryService retryServiceImpl;

    @Override
    public String testRetry() {
        String str = retryServiceImpl.retry();
        if(str.equals(String.valueOf(Constant.MOCK_END))) {
            System.out.println("retry成功。。。。。。。。。。。");
        } else if(str.equals(String.valueOf(Constant.DO_SOMETHING))) {
            System.out.println("recover 成功。。。。。。。。。");
        }else {
            System.out.println("失败。。。。。。。。。。。");
        }
        return str;
    }
}
