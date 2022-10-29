package com.santhosh.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Go into a Hole");
	}

	public void left() {
		System.out.println("Stop");
	}

	public void right() {
		System.out.println("Accelerate");
	}
}
