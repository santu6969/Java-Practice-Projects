package com.santhosh.OOPSInterfaces;

interface Flyable {
	void fly();
}
// String flyingObjects

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Can Fly Using Wings");

	}

}

class Aeroplanes implements Flyable {

	@Override
	public void fly() {
		System.out.println("Can Fly Using Fuel");
	}

}

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplanes() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}

}
