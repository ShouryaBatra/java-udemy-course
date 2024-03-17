import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("enter a number");
			int number = input.nextInt();
		
			
		
			switch(number) {
			case 3:
				System.out.println("correct");
				
			
			case 6:
				System.out.println("special");
//				break;
			
			case 9:
				System.out.println("nine");
				break;
			default:
				System.out.println("wrong");
			
			}
		}	
	}
}
