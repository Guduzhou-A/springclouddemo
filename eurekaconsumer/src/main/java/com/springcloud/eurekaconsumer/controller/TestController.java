package com.springcloud.eurekaconsumer.controller;

import com.springcloud.eurekaconsumer.Iservice.ITestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    private ITestInterface testInterface;

    @RequestMapping("consumer")
    public  String testConsumer(){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("application01");
//        String url = "http://eurekaclient/test";
//        return restTemplate.getForObject(url, String.class);
        return testInterface.test().toString();

    }
}
