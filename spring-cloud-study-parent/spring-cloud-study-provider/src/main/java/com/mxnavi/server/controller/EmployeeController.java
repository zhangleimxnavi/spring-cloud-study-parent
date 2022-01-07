package com.mxnavi.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Objects;
import com.mxnavi.server.entity.Employee;
import com.mxnavi.server.util.ResultEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EmployeeController {
	
	@HystrixCommand(fallbackMethod="getFallback")
	@RequestMapping("/provider/get/employee/remote")
	public ResultEntity<Employee> showEmp(@RequestParam("signal") String signal ) {
		
		if(Objects.equal("false", signal)) {
			throw new RuntimeException("不好使了");
		}
		Employee employee = new Employee(1,"yangtingting", 10000.0);
		return ResultEntity.successWithData(employee);
	}
	
	
	
	public ResultEntity<Employee> getFallback(@RequestParam("signal") String signal ) {
		
		return ResultEntity.failed("the signal: " + signal + " is error");
	}
	
	

}
