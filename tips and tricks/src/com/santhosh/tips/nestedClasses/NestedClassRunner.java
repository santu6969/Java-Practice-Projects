package com.santhosh.tips.nestedClasses;

public class NestedClassRunner {
	class InnerClass {

	}

	static class StaticNestedClass {

	}

	public static void main(String[] args) {
		StaticNestedClass nestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}

}
