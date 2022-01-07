package com.mxnavi.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mxnavi.server.api.EmployeeRemoteService;
import com.mxnavi.server.entity.Employee;
import com.mxnavi.server.util.ResultEntity;

@RestController
public class HRController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private EmployeeRemoteService employeeRemoteService;
	
	@RequestMapping("/consummer/get/employee/remote")
	public ResultEntity<Employee> getEmployee(@RequestParam("signal") String signal) {
		

/*		String httpHost = "http://127.0.0.1:1000";*/
		//使用微服务名 代替 host + port
/*		String httpHost = "http://spring-cloud-study-provider";
		String path = "/provider/get/employee/remote";
		Employee employee = restTemplate.getForObject(httpHost + path, Employee.class);*/
		
		ResultEntity<Employee> resultEntity = employeeRemoteService.showEmp(signal);
		
		return resultEntity;
		
	}

}
