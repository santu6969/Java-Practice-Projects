package com.santhosh.tips.enums;

public enum Season {
	SPRING(2), WINTER(1), SUMMER(3), FALL(4);

	private int value;

	public int getValue() {
		return value;
	}

	private Season(int value) {
		this.value = value;
	}

}
// Task - Check out Days Of the Week and Month