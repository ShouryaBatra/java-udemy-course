import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int K = input.nextInt();
		
		int[] values = new int[N - 1];
		
		for (int i=2; i <= N; i++) {
			values[i-2] = i;
		}
		

		int counter = 0;

		int smallestNumber = 0;
		// go through values
		for (int i=0; i<values.length; i++) {
			// check if smallest number is equal to zero
			if (values[i] != 0) {
				smallestNumber = values[i];
				counter++;
				if (counter == K) {
					System.out.println(values[i]);
					return;
				}
				values[i] = 0;
				
				for (int j = smallestNumber + i; j<values.length; j = j + smallestNumber) {
					if (values[j] != 0) {
						counter++;	
						if (counter == K) {
							System.out.println(values[j]);
							return;
						}
						values[j] = 0;
					}
				}
			}
			
			
			
		}
		
		
		
		
		
	}
}
