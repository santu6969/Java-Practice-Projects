package com.santhosh.generics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employees {
	private int Id;
	private String name;

	public Employees(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		List<Employees> empList = new LinkedList<>();
		empList.add(new Employees(1, "Bhavani"));
		empList.add(new Employees(1, "Sravani"));
		empList.add(new Employees(2, "Santhosh"));
		empList.add(new Employees(2, "Santhosh"));

		empList.stream().map(Employees::getId).distinct().collect(Collectors.toList());
		Set<Employees> employees = new HashSet<>(empList);
		System.out.println(employees);
		// List result = new

	}

	@Override
	public String toString() {
		return "[Id=" + Id + ", name=" + name + "]";
	}

}
