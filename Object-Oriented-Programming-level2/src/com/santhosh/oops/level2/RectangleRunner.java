package com.santhosh.oops.level2;

public class RectangleRunner {
	public static void main(String[] args) {
		RectangleTrail rect = new RectangleTrail(8, 5);
		System.out.println(rect);
		rect.setLength(9);
		System.out.println(rect);
		rect.setWidth(9);
		System.out.println(rect);
	}
}
