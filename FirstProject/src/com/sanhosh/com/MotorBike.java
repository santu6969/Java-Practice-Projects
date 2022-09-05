package com.sanhosh.com;

public class MotorBike {
	
	MotorBike(){//Constructor for constructor
		this(50);
	}
	
	MotorBike(int speed){//intializing with values using Constructor
		this.speed = speed;
	}
int speed;
 public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	if(speed >= 0)
	this.speed = speed;
}
public void increaseSpeed(int howmuch) {
	setSpeed(howmuch + this.speed);
}
void start() {
	System.out.println("Bike Started");
}
void decreaseSpeed(int howmuch) {
	setSpeed(this.speed -howmuch);
	
}
}
