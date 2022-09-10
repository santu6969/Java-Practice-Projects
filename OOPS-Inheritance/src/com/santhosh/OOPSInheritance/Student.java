package com.santhosh.OOPSInheritance;

public class Student extends Person {
	private String year;
	private String collegeName;
	
	public Student(String name, String collegeName) {
		super(name);
		this.collegeName=collegeName;
	}
	

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCollege() {
		return collegeName;
	}

	public void setCollege(String college) {
		this.collegeName = college;
	}

	public String toString() {
		return super.toString() + "\n" + collegeName +"\n"+ year;
	}
}
