package com.santhosh.oops.level2;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed;// 0 to 5

//Create
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		getSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		getSpeed((byte) 0);
	}

	public void getSpeed(byte speed) {
		this.speed = speed;
	}

//Print the State
	public String toString() {
		return String.format("make is - %s, radius is - %f, color is - %s, is on - %b, Speed is - %d", make, radius,
				color, isOn, speed);
	}
}
