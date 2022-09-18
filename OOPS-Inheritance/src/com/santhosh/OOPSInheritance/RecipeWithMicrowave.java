package com.santhosh.OOPSInheritance;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void prepare() {
		System.out.println("Get The Raw Materials");
		System.out.println("Switch On Microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get Stuff ready");
		System.out.println("Put it in the Microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean up the Utensils");
		System.out.println("Switch Off Microwave");
	}

}
