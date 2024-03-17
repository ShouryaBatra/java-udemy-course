import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello your coputer has virus");
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Enter a nubmer: ");
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Enter a nubmer: ");
			value = scanner.nextInt();
		}
		*/
		int value = 0;
		
		do {
			System.out.println("enter a number: ");
			value = scanner.nextInt();
		}
		while(value != 5);
		System.out.println("you got it");
	
		
	}

}
