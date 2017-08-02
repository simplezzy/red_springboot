package com.redcode.demo.repository;

import com.redcode.demo.BaseTest;
import com.redcode.demo.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhiyu.zhou on 2017/7/19.
 */
public class UserRepositoryTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() throws Exception {
        for(int i = 0; i < 10; i++) {
            userRepository.save(new User("zzy" + i, 10 + i));
        }
    }

    @Test
    public void findByName() throws Exception {
       User user = userRepository.findByName("zzy1");
       System.out.println(" age:" + user.getAge());
    }

    @Test
    public void findByNameAndAge() throws Exception {
    }

    @Test
    public void findUser() throws Exception {
    }

}