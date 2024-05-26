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
		
//		for (int i=0; i < values.length; i++) {
//			System.out.println(values[i]);
//		}
//		
		for (int i=0; i<values.length; i++) {
			if (values[i] != 0) {
				int smallestNumber = values[i];
				for (int j=2; j<=(values.length/values[i]);j++) {
					if ((smallestNumber * j) != 0) {
						smallestNumber * j =
					}
				}
			}
		}
		
	}
}
