package com.santhosh.OOPSInterfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("go into the hole");
	}

	@Override
	public void left() {
	}

	@Override
	public void right() {
		System.out.println("Move Forward");
	}

}
