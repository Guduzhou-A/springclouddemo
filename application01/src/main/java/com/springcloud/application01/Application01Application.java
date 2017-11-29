package com.springcloud.application01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Application01Application {

	public static void main(String[] args) {
		SpringApplication.run(Application01Application.class, args);
	}
}
