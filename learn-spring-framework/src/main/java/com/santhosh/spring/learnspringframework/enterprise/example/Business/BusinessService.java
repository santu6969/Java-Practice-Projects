package com.santhosh.spring.learnspringframework.enterprise.example.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.santhosh.spring.learnspringframework.enterprise.example.Data.DataService;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;

	public BusinessService(DataService dataService) {
		super();
		System.out.println("Business - Constructor Injection");
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}
