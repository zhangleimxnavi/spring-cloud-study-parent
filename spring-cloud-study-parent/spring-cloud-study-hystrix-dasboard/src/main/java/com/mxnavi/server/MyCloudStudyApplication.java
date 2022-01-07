package com.mxnavi.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableHystrixDashboard
@SpringBootApplication
public class MyCloudStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCloudStudyApplication.class, args);
	}

}
