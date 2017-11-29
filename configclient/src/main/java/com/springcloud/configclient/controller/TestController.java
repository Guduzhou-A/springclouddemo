package com.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @Autowired
    private Environment env;

    @RequestMapping("/name")
    public String name() {
        System.out.print(this.name);
        return this.name;
    }

    @RequestMapping("/from-env")
    public String fromEnv() {
        //也可以通过env来获取
        return env.getProperty("name", "undefined");
    }
}
