import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			
			String[] bothNumbers = new String[2];
			
//			while ( (line = bufferedReader.readLine()) != null ) {
//				System.out.println(line);
//				
//			}
			
			for (int i=0; (line = bufferedReader.readLine()) != null; i++) {
				
				bothNumbers[i] = line;
				
			}
			
			String[] firstNumber = new String[10];
			String[] secondNumber = new String[10];

			for (int i=0; i < bothNumbers[0].length(); i++) {
				firstNumber[i] = bothNumbers[0].charAt(i) + "";
				
			}
			
			
			for (int i=0; i < bothNumbers[1].length(); i++) {
				secondNumber[i] = bothNumbers[1].charAt(i) + "";
				
			}
			
			
			
			
//			for (int i=0; i<firstNumber.length; i++) {
//				System.out.print(firstNumber[i] + " ");
//				
//			}
//			
//			System.out.println();
//			for (int i=0; i<secondNumber.length; i++) {
//				System.out.print(secondNumber[i] + " ");
//			}
			
			

			
			int[] firstNumberDigits = new int[10];
			int[] secondNumberDigits = new int[10];
			
			
			// convert all strings to integers
			for (int i=0; i<firstNumber.length; i++) {
				firstNumberDigits[i] = Integer.parseInt(firstNumber[i]);
				secondNumberDigits[i] = Integer.parseInt(secondNumber[i]);
			}
			
			int[] newNumber = new int[11];
			
			// put each new digit in array
			for (int i=9; i>=0; i = i-1) {
				if ((firstNumberDigits[i] + secondNumberDigits[i]) >= 10) {
					newNumber[i+1] = (firstNumberDigits[i] + secondNumberDigits[i]) % 10;
					if (i != 0) {
						firstNumberDigits[i-1] = firstNumberDigits[i-1] + 1;
					}
					else {
						newNumber[0] = 1;
					}
				}
				else {
					newNumber[i+1] = firstNumberDigits[i] + secondNumberDigits[i];
					
				}
				
				
			}
			
			
			
			
			// output each digit
			
			if (newNumber[0] == 1) {
				for (int i = 0; i<11; i = i + 1) {
					System.out.print(newNumber[i]);
				}
			}
			else {
				for (int i=1; i<10; i++) {
					System.out.print(newNumber[i]);
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file);
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file);
		}
		
	}

}
