package com.skytech.ssm.test;

import com.skytech.ssm.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * Test1.java
 * 创建人：李岸虹
 * 日期：2017-02-14 14:12
 * 描述：
 * 历史：
 */
public class Test1 {

    @Test
    public void test1() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        System.out.println("print1");
        TestService testService = (TestService) applicationContext.getBean("testService");
        System.out.println("print2");
        testService.printContent();
        System.out.println("print3");
        applicationContext.registerShutdownHook();
    }

}
