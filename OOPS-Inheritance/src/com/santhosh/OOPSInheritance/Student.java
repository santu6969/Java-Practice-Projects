package com.santhosh.OOPSInheritance;

public class Student extends Person {
	private String year;
	private String college;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String toString() {
		return name + " " + getCollege() + year;
	}
}
