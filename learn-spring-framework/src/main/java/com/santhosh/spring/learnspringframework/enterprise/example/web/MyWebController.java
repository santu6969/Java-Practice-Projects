package com.santhosh.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.santhosh.spring.learnspringframework.enterprise.example.Business.BusinessService;

@Component
public class MyWebController {

	@Autowired
	private BusinessService businessService;

	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Web Constructor Injection");
		this.businessService = businessService;
	}

	public long returnValueFromBusinessService() {
		return businessService.calculateSum();

	}
}
