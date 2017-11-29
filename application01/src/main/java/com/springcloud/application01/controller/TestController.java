package com.springcloud.application01.controller;

import com.springcloud.application01.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    String port;

    @RequestMapping("test")
   public Test test(){
        String services = "Services: " + discoveryClient.getServices()+"-port-"+port;
        String addr = services;
        Test test = new Test();
        test.setName("我是application01");
        test.setTel(123456789);
        test.setAddr(addr);
        return test;
   }
}
