package com.santhosh.OOPSInheritance;
import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		Student student = new Student("DLS Kumar", "Bapatla Engineering College");
		student.setEmail("1sanu1@gmail.com");
		student.setPhoneNumber("92900 90988");		student.setYear("2015");
		System.out.println(student);
		*/
		Employee employee = new Employee("DLS Kumar", "Java Developer");
		employee.setEmail("1sanu1@gmail.com");
		employee.setPhoneNumber("92900 90988");
		employee.setEmployeeGrade('A');
		employee.setEmployer("Vinspire Technologies Pvt. Ltd");
		employee.setSalary(new BigDecimal(60000));
		System.out.println(employee);
	}

}
