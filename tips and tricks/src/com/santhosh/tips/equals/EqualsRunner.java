package com.santhosh.tips.equals;

import java.util.Objects;

class Client {
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}

}

public class EqualsRunner {

	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}

//Access Modifier - 		// Class Access Modifiers		//Method Access Modifiers
// 		//Public - can Access from Everywhere
// 		//private - can Access only inside the same class
// 		//protected - can access from same Package and sub packages of it
// 		//default - can access from same package
//
//				[and for Variable always use private option, public can be used for fixed value of variables]

//Final classes and methods
// 		//final class
// 		//final void someMethod

//Final Variable and Argument
//		//Final Variable - cannot change once it is assigned Ex: final int i=5; or [final int i; i=5;]
//		//Final Argument - cannot change once it is assigned 
//		//		//public static void doSomething(final int arg){ //Already argument Assigned here
//		//		//			arg =6;//Not Allowed
//		//		//			}

//
//

//Static Variables and Methods
//		// When the variables shouldn't have multiple instance variables - ex: private static int count;
//		// Unique value for all Instances(We Should share the data across multiple instances)
//		// Same with Method level 
//		// ex: public static void someMethod(){}	ex: ClassName.someMethod()[Not Instance name here]
//		// Inside a Static method you cannot access instance level data.

// Class inside a class is called Nested class
//		//Inner Class - 	with out key word static
//		//Static Nested Class - with keyword static