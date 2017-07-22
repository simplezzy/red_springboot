package com.redcode.demo.common;

import com.redcode.demo.exception.RetryException;

/**
 * Created by zhiyu.zhou on 2017/7/21.
 */
public interface RetryService {

    String retry();

    //String recover(RetryException e);
}
