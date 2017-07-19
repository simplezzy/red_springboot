package com.redcode.demo.repository;

import com.redcode.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);
}
