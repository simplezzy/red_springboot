package com.redcode.mybatis.service;

import com.redcode.mybatis.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Erichou on 6/20/17.
 */
public interface UserService {

    User getUserById(Integer id);
}
