package com.redcode.demo.repository;

import com.redcode.demo.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhiyu.zhou on 2017/9/26.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

    UserInfo findByAccount(String account);
}
