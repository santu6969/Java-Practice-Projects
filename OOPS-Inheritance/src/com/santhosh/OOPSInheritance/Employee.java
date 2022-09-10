package com.santhosh.OOPSInheritance;
import java.math.BigDecimal;

public class Employee extends Person {
	public String title;
	public String employer;
	public char employeeGrade;
	public BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format(
				"Name - %s\nEmail Id: - %s\nContact Number - %s\nJob Title: - %s\nEmployer: - %s, Employee Grade: -  %c\nSalary: -  %s\n",
				name, email, phoneNumber, title, employer, employeeGrade, salary);
	}
}
