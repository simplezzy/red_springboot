package com.redcode.demo.service;

import com.redcode.demo.entity.UserInfo;

/**
 * Created by zhiyu.zhou on 2017/9/26.
 */
public interface UserInfoService {

    UserInfo findByAccount(String account);
}
