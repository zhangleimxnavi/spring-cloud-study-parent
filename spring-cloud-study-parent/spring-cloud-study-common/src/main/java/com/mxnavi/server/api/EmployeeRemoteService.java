package com.mxnavi.server.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mxnavi.server.config.MyFallbackFactory;
import com.mxnavi.server.entity.Employee;
import com.mxnavi.server.util.ResultEntity;

import feign.hystrix.FallbackFactory;

//��@FeignClient ע��������fallbackFactory ����
//ָ��consumer ����provider ʱ���ʧ������ȡ�ı��÷���
//fallbackFactory ָ��FallbackFactory ���͵��࣬��֤���÷���������ͬ���͵�����
@FeignClient(value="spring-cloud-study-provider",fallbackFactory=MyFallbackFactory.class)
public interface EmployeeRemoteService {
	
	@RequestMapping("/provider/get/employee/remote")
	public ResultEntity<Employee> showEmp(@RequestParam("signal") String signal );
	


}
