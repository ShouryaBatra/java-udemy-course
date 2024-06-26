import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // create scanner object
		
		System.out.println("Enter a floating point value: "); // output the prompt
		
		double value = input.nextInt(); // wait for user to enter something
	
		System.out.println("You entered: " + value); // tell themn what they entered
	}

}
