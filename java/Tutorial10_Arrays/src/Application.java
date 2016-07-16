
public class Application {

	public static void main(String args[]) {

		// Instance variable
		int value = 7;

		// Declaring an array
		int[] values;
		// Assigning 4 positions to the array
		values = new int[3];

		// Printing array value of position 0
		System.out.println("Printing array value 0 = " + values[0]);

		// Assigning values to array position 0, 1 and 2
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		// Printing array value of position 0
		System.out.println("Printing array value 0 = " + values[0]);
		// Printing array value of position 1
		System.out.println("Printing array value 1 = " + values[1]);
		// Printing array value of position 2
		System.out.println("Printing array value 2 = " + values[2]);

		// For loop which will print out each array position value, for as many
		// array positions that exist
		// Setting variable i to 0
		// while i is less than the total number of array positions within array
		// values
		// increment i once
		// print out the array position and its assigned value
		for (int i = 0; i < values.length; i++) {
			System.out.println("Printing array value " + i + " = " + values[i]);
		}

		// declaring and populating an array called numbers
		int[] numbers = { 5, 6, 7 };

		// For loop which will print out each array position value, for as many
		// array positions that exist
		// Setting variable i to 0
		// while i is less than the total number of array positions within array
		// numbers
		// increment i once
		// print out the array position and its assigned value
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Printing array value " + i + " = " + numbers[i]);

		}

	}

}
