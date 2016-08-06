package main.java;

class Machine {
	public String name;

	// New constructor, has to match the name of class
	public Machine() {
		name = "Arnie";
		System.out.println("Contsructor running");

	}
}

public class App {

	public static void main(String args[]) {
		// calling Machine constructor
		Machine machine1 = new Machine();
		
		System.out.println("Hello ");
		
//		Quick run of constructor
//		new Machine();

	}
}
