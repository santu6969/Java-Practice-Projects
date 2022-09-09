package com.santhosh.oops.level2;

public class Customer {

	// State
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// Creating
	Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

//Print the State
	public String toString() {
		return String.format("name is: " + name + "\nHome address is :\n" + homeAddress + "\n\nWork Address is:\n"
				+ workAddress + "\n");
	}
}
