package main.java;

class Name {
	private String name;
	private int age;

	// method to set name
	public void setName(String name) {
		this.name = name;
	}

	// method to set age
	public void setAge(int age) {
		this.age = age;
	}

	// method to set name and age
	// public void setInfo(String name, int age){
	// setName(name);
	// setAge(age);
	// }

	// method to get name
	public String getName() {
		return name;
	}

	// method to get age
	public int getAge() {
		return age;
	}

}

public class App {

	public static void main(String args[]) {

		Name name = new Name(); // method to output a name

		// name.setInfo("Jason", 25); // setting name value to Jason and age to
		// 25
		name.setName("Jason"); // setting name value to Jason
		name.setAge(25); // setting age value to 25

		// print out values from getName and getAge methods
		System.out.println("Hello, my name is " + name.getName() + " and I am " + name.getAge() + " years old.");

	}

}
