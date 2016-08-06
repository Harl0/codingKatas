package main.java;

class Robot {

	private String direction;
	private double meters;

	// receiving parameter from sam.speak() which is assigned to input
	public void speak(String input) {

		System.out.println(input);
	}
	
	public void jump(int height) {
		
		System.out.println("Jumping " + height + " meters");
	}

	public void move(String direction, double meters) {
		
		this.direction = direction;
		this.meters = meters;
		System.out.println("Moving in the direction of " + direction + " for " + meters + " meters");

	}
	
	public String getDirection(){
		
		return direction;
	}
	
	public double getMeters(){
		
		return meters;
	}
}

public class App {

	public static void main(String args[]) {

		Robot sam = new Robot();

		// passing String "Hello" input the method
		sam.speak("Hello");
		
		sam.jump(12);
		
		sam.move("NW", 12.2);

	}

}
