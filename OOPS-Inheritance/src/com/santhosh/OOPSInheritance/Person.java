package com.santhosh.OOPSInheritance;

public class Person {
	public String name;
	public String email;
	public String phoneNumber;

	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return String.format(
				"Name - %s\nEmail Id: - %s\nContact Number - %s",
				name, email, phoneNumber);
	}
}
