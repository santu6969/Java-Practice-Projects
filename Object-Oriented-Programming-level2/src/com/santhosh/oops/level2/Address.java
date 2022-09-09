package com.santhosh.oops.level2;

public class Address {
	// State
	private String line1;
	private String villageCity;
	private int zip;

	// Creating
	Address(String line1, String villageCity, int zip) {
		this.line1 = line1;
		this.villageCity = villageCity;
		this.zip = zip;
	}

	// Print the state
	public String toString() {
		return String.format("%s,\n%s,\n%d", line1, villageCity, zip);
	}
}
