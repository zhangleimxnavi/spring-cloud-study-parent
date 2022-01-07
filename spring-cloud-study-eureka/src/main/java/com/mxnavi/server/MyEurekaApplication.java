package com.mxnavi.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyEurekaApplication {
	public static void main(String[] args) {
		// test
		SpringApplication.run(MyEurekaApplication.class, args);
	}

}
