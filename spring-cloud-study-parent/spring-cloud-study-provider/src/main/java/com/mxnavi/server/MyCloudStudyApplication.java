package com.mxnavi.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MyCloudStudyApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyCloudStudyApplication.class, args);
	}

}
