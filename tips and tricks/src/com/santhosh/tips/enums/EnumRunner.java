package com.santhosh.tips.enums;

import java.util.Arrays;

public class EnumRunner {

	public static void main(String[] args) {
		Season season1 = Season.WINTER;

		Season season2 = Season.valueOf("FALL");
		System.out.println(season2);
		System.out.println(Season.SPRING.ordinal());
		System.out.println(Season.SPRING.getValue());
		System.out.println(Arrays.toString(season1.values()));
	}

}
