package main.java;

class Person {

	String name;
	int age;

	void speak() {

		System.out.println("My name is " + name + ", I am " + age + " years old.");

	}

	int calculateRetirementAge() {

		int yearsLeft = 65 - age;
		
		return yearsLeft;

	}

}

public class App {
	
	public static void main(String args[]){
		
		Person person1 = new Person();
		
		person1.name="Jason";
		person1.age=25;
		
		person1.speak();
		
		int yearsLeft = person1.calculateRetirementAge();
		
		System.out.println("I currently have " + yearsLeft + " years left until I retire..." );
		
		
		
		
		
	}

}
