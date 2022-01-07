package com.mxnavi.server.config;

import org.springframework.stereotype.Component;

import com.mxnavi.server.api.EmployeeRemoteService;
import com.mxnavi.server.entity.Employee;
import com.mxnavi.server.util.ResultEntity;

import feign.hystrix.FallbackFactory;

@Component
public class MyFallbackFactory implements FallbackFactory<EmployeeRemoteService> {

	@Override
	public EmployeeRemoteService create(Throwable cause) {
		
		return new EmployeeRemoteService() {
			
			@Override
			public ResultEntity<Employee> showEmp(String signal) {
				// TODO Auto-generated method stub
				return ResultEntity.failed("服务器挂了，请参考：" + cause.getMessage());
			}
		};
	}

}
