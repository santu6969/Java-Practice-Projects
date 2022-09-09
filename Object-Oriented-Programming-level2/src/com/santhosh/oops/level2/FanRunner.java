package com.santhosh.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 0.356, "BROWN");

		fan.switchOn();
		System.out.println(fan);

		fan.getSpeed((byte) 3);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);
	}

}
