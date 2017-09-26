package com.redcode.demo.service.impl;

import com.redcode.demo.entity.UserInfo;
import com.redcode.demo.repository.UserInfoRepository;
import com.redcode.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2017/9/26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByAccount(String account) {
        System.out.println("UserInfoServiceImpl.findByAccount()");
        return userInfoRepository.findByAccount(account);
    }
}
