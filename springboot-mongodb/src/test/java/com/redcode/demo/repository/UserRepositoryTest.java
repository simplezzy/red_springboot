package com.redcode.demo.repository;

import com.redcode.demo.BaseTest;
import com.redcode.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public class UserRepositoryTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    public void saveTest() throws Exception {
        for(int i = 0 ; i < 5; i++) {
            userRepository.save(new User(1l+ i,"aaaa" + i , 10 + i));
        }
    }

}