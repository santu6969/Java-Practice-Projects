package com.santhosh.OOPSInheritance;

public class Recipe1 extends AbstractRecipe {

	@Override
	void prepare() {
		System.out.println("Get the Raw Materials");
		System.out.println("Get the Utensils");

	}

	@Override
	void doTheDish() {
		System.out.println("Do the Dish");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean The Utensils");
	}
}
