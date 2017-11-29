package com.springcloud.eurekaconsumer.Iservice;

import com.springcloud.eurekaconsumer.entity.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eurekaclient")
public interface  ITestInterface {
    @RequestMapping("test")
    Test test();

}
