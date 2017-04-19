package com.skytech.ssm.test;

import com.skytech.ssm.entity.User;
import com.skytech.ssm.service.IUserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestMybatis extends TestCase {

    @Autowired
    private IUserService userService;

    @Test
    public void testUsers() {
        List<User> users = userService.getAllUser();
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }


}
