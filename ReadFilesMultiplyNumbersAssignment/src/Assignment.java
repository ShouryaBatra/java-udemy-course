import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
	public static void main(String[] args) {
		
File file = new File("text.txt");
		
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
			
			int digitAmount = 3;

			
			// each digit as a string in an array
			String[] firstNumberStrings = new String[digitAmount];
			String[] secondNumberStrings = new String[digitAmount];

			for (int i=0; i < bothNumbers[0].length(); i++) {
				firstNumberStrings[i] = (bothNumbers[0].charAt(i) + "");
				
			}
			
			
			for (int i=0; i < bothNumbers[1].length(); i++) {
				secondNumberStrings[i] = bothNumbers[1].charAt(i) + "";
				
			}
			
			// convert each string into an integer
			int[] firstNumber = new int[digitAmount];
			int[] secondNumber = new int[digitAmount];

			for (int i=0; i<firstNumberStrings.length; i++) {
				firstNumber[i] = Integer.parseInt(firstNumberStrings[i]);
			}
			
			for (int i=0; i<secondNumberStrings.length; i++) {
				secondNumber[i] = Integer.parseInt(secondNumberStrings[i]);
			}
			

			int[][] grid = new int[digitAmount][digitAmount * 2];
			
			
			
			
			
			// multiplies all digits and puts in an array
			for (int i=digitAmount-1; i>=0; i--) {
				for (int j=digitAmount-1; j>=0; j--) {
					
//					System.out.println(secondNumber[i] * firstNumber[j]);
					
					grid[digitAmount-i-1][j+digitAmount] = secondNumber[i] * firstNumber[j];
					
				}
			}
			
			
			
			
			
			
			// shifts over numbers
			for(int i=0; i<digitAmount; i++) {
				for(int j=0; j<digitAmount*2; j++) {
					if (j - i < 0) {
						continue;
					}
					grid[i][j-i] = grid[i][j];
				}
			}
			
			
			// add zeros to the end
			for (int i=1; i<digitAmount; i++) {
				for (int j=i; j>0; j--) {
					grid[i][(digitAmount*2)-j] = 0;
				}
//				grid[i][(digitAmount * 2) - i] = 0;
			}
			
			
			
			
			
			
			// print grid
			for(int i=0; i<grid.length; i++) {
				for(int j=0; j<grid[i].length; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.print("\n");
			}
			
			
			
			int[] answer = new int[digitAmount * 2];
			
			
			
			
			for (int i=0; i<answer.length; i++) {
				answer[i] = grid[0][i];
			}
			
			
			for (int i=1; i<digitAmount; i++) {
				for (int j=(digitAmount*2)-1; j>=0; j--) {
					if ((answer[j] + grid[i][j]) >= 10) {
						answer[j] = (answer[j] + grid[i][j]) % 10;
						
						answer[j-1] = answer[j-1] + 1;
						
						
					}
					else {
						answer[j] = answer[j] + grid[i][j];
						
					}
					
					
				}
			}
			
			
			
			

			if (answer[0] == 0) {
				for (int i=1; i<answer.length; i++) {
					System.out.print(answer[i]);
				}
			}
			else {
				for (int i=0; i<answer.length; i++) {
					System.out.print(answer[i]);
				}
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file);
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file);
		}
		
	}
}
