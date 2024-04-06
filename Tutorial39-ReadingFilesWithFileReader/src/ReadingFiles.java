import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			
			String[] bothNumbers = new String[5];
			
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
			
			int[] newNumber = new int[11];
			
//			boolean carryOver = false;
//			
//			for (int i=10; i<newNumber.length; i = i - 1) {
//				if ((Integer.parseInt(firstNumber[i]) + Integer.parseInt(firstNumber[i])) >= 9) {
//					carryOver = true;
//				}
//				
//				if (carryOver = true) {
//					
//				}
//			}
			
			int[] firstNumberDigits = new int[20];
			int[] secondNumberDigits = new int[20];
			
			for (int i=0; i<firstNumber.length; i++) {
				firstNumberDigits[i] = Integer.parseInt(firstNumber[i]);
				secondNumberDigits[i] = Integer.parseInt(secondNumber[i]);
			}
			
			
			
			
			for (int i=9; i>=0; i = i-1) {
				newNumber[i] = firstNumberDigits[i] + secondNumberDigits[i];

			}
			
			for (int i = 0; i<10; i = i + 1) {
				System.out.print(newNumber[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file);
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file);
		}
		
	}

}
