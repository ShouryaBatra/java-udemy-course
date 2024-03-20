import java.util.Scanner;

public class Fractions {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		int answerNum = 0;
		int answerDen = 0;
		
		System.out.println("Enter the first fractions numerator: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter the first fractions denominator: ");
		int den1 = input.nextInt();
		
		System.out.println("Enter the second numbers numerator: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter the second numbers denominator: ");
		int den2 = input.nextInt();
		
		
		
		System.out.println("Would you like to add, subtract, multiply, or divide? Enter A, S, M, or D: ");
		String action = scanner.nextLine().toLowerCase();
		
		
		while(!(action.equals("a") || action.equals("s") || action.equals("m") || action.equals("d"))) {
			System.out.println("Enter A, S, M, or D please: ");
			action = scanner.nextLine().toLowerCase();
	
//			System.out.println(action.toLowerCase());
		}
		
//		System.out.println(action);
//		System.out.println(num1 + "/" + den1 + ", " + num2 + "/" + den2);
		
		switch(action) {
		case "a": 
			answerNum = (num1 * den2) + (num2 * den1);
			answerDen = den1 * den2;
			break;
		
		case "s":
			answerNum = (num1 * den2) - (num2 * den1);
			answerDen = den1 * den2;
			break;
			
		case "m":
			answerNum = num1 * num2;
			answerDen = den1 * den2;
			break;
			
		case "d":
			answerNum = num1 * den2;
			answerDen = den1 * num2;
			break;
			
		}
		
		System.out.println(answerNum + "/" + answerDen);
	}
}
