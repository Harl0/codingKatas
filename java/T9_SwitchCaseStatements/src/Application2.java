import java.util.*;

public class Application2 {

	// Declaring userInput variable to hold user input later
	private static int userInput;

	public static void main(String args[]) {

		// Scanner object to collect user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please make a selection: ");
		System.out.println("1) Print case 1");
		System.out.println("2) Print case 2");
		System.out.println("0) Exit program");
		
		// loop to collect input until a case statement is met or program
		// canceled
		scannerLoop: while (scanner.hasNextInt()) {

			// Assigning captured input to the userInput variable
			userInput = scanner.nextInt();
			// Switch statement to determine goal
			switch (userInput) {
			case 0:
				System.out.println("Exiting program.");
				break scannerLoop;
			case 1:
				System.out.println("You choosed 1");
				break;
			case 2:
				System.out.println("You choosed 2");
				break;
			default:
				System.out.println("No such choice");
			}
		}

	}

}
