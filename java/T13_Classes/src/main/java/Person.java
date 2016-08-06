package main.java;

public class Person {
	// Classes contain:
	// 1. Data
	// 2. Subroutines (methods)

	// Instance variables (data or "state")
	// private = can only be invoked within this class
	// public = can be imported and invoked from outside of this package
	// package = can be invoked from within this package (default)

	String name;
	int age;

	// method to print name and age values, 3 times :)
	// method must be invoked
	void speak() {

		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and I am " + age + " years old.");

		}
	}

	// main method
	public static void main(String[] args) {

		Person person1 = new Person();

		person1.name = "Jason Harris";
		person1.age = 25;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Becky Jones";
		person2.age = 24;
		person2.speak();

		// This sysout is now depricated. Replaced by speak() method.
		// System.out.println("Hello " + person1.name + ", " + "You are " +
		// person1.age + " years old.");

	}

}
