package com.mxnavi.server.zuul.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import io.micrometer.core.ipc.http.HttpSender.Request;

@Component
public class MyZuulFilter extends ZuulFilter {

	
	Logger logger = LoggerFactory.getLogger(MyZuulFilter.class);
	
	@Override
	public boolean shouldFilter() {
		
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
/*		String servletPath = request.getServletPath();*/
		
		// �жϵ�ǰ��������Ƿ�Ϊsignal=hello
		String parameter = request.getParameter("signal");
		
		return "hello".equals(parameter);
		
	}

	@Override
	public Object run() throws ZuulException {
		logger.info("��ǰ����Ҫ���й��ˣ�run()����ִ����");
		return null;
	}

	@Override
	public String filterType() {
		String filterType = "pre";
		
		return filterType;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}



