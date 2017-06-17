package com.redcode.mybatis.mapper;

import com.redcode.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Erichou on 6/17/17.
 */
public interface UserMapper {

    User getUserById(@Param("id") Integer id);
}
