package com.mxnavi.server.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mxnavi.server.config.MyFallbackFactory;
import com.mxnavi.server.entity.Employee;
import com.mxnavi.server.util.ResultEntity;

import feign.hystrix.FallbackFactory;

//在@FeignClient 注解中增加fallbackFactory 属性
//指定consumer 调用provider 时如果失败所采取的备用方案
//fallbackFactory 指定FallbackFactory 类型的类，保证备用方案返回相同类型的数据
@FeignClient(value="spring-cloud-study-provider",fallbackFactory=MyFallbackFactory.class)
public interface EmployeeRemoteService {
	
	@RequestMapping("/provider/get/employee/remote")
	public ResultEntity<Employee> showEmp(@RequestParam("signal") String signal );
	


}
