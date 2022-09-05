package com.sanhosh.com;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		// TODO Auto-generated method stub
		//ducati.setSpeed(60);
		//honda.setSpeed(100);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
ducati.increaseSpeed(60);
honda.increaseSpeed(80);
System.out.println(ducati.getSpeed());
System.out.println(honda.getSpeed());
ducati.decreaseSpeed(60);
honda.decreaseSpeed(60);
System.out.println(ducati.getSpeed());
System.out.println(honda.getSpeed());
	}

}
