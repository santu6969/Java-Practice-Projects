package com.santhosh.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Customer customer = new Customer("Santhosh", new Address("30-39-9", "Gajuwaka, Vizag", 530046));
		System.out.println(customer);

		customer.setWorkAddress(new Address("9-95/11", "Balaji Nagar, Hyderabad", 500091));
		System.out.println(customer);

	}
}
