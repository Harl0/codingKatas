import java.util.Scanner;

public class Application {

	public static void main(String args[]) {
		// New scanner object
		Scanner input = new Scanner(System.in);

		// Prompt for input
		System.out.println("Please enter a command: ");

		// Collect user input
		String text = input.nextLine();

		// Switch statement to enable case matching
		switch (text) {
		// Matches string start or Start. Must be constant value.
		case "start":
		case "Start":
			System.out.println("Machine Started!");
			break;

		// Matches string stop or Stop. Must be constant value.
		case "stop":
		case "Stop":
			System.out.println("Machine Stopped!");
			break;

		// Default action if none of the above case statements are met. Must be
		// at the bottom
		default:
			System.out.println("Command not recognised!");

		}

	}

}
