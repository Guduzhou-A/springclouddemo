package com.springcloud.application02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Application02Application {

	public static void main(String[] args) {
		SpringApplication.run(Application02Application.class, args);
	}
}
