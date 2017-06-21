package com.redcode.mybatis.mapper;

import com.redcode.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Erichou on 6/17/17.
 */

@Mapper  //扫描接口的操作
public interface UserMapper {

    User getUserById(@Param("id") Integer id);
}
