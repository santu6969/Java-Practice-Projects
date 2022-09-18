package com.santhosh.OOPSInheritance;

abstract public class AbstractRecipe {
//Prepare
	// Recipe
	// CleanUP
	public void execute() {
		prepare();
		doTheDish();
		cleanUp();
	}

	abstract void prepare();

	abstract void doTheDish();

	abstract void cleanUp();

}
