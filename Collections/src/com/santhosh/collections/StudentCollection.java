package com.santhosh.collections;

public class StudentCollection implements Comparable<StudentCollection> {
	private int id;
	private String name;

	public StudentCollection(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return String.format("%s (%d)", name, id);
	}

	@Override
	public int compareTo(StudentCollection that) {
		return Integer.compare(that.id, this.id);
	}

}
