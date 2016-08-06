package main.java;

class Thing {
	// static final variables become constants and cannot be changed
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;

	public static int count = 1;
	public int ID;

	public Thing() {

		ID = count;
		count++;
	}

	public void showName() {

		System.out.println("Object ID: " + ID + ", " + description + ".");
	}

}

public class App {

	public static void main(String args[]) {

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		Thing.description = "I am a thing";

		thing1.showName();
		thing2.showName();

	}

}
