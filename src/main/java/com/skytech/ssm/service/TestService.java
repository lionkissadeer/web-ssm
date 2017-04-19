package com.skytech.ssm.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Lianhong_ on 2017/04/11.
 */
@Service
public class TestService {

    @PostConstruct
    public void init() {
        System.out.println("TestService:Init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("TestService:Destory");
    }

    public void printContent() {
        System.out.println("TestService:Content");
    }


}
