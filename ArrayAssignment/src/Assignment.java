
public class Assignment {
	
	public static void main(String[] args) {
		int[] values = {1, 3, 5, 3, 2, 1, 5};
		
		int[] duplicates;
		duplicates = new int[5];
		
		int counter = 0;
		
		for(int i = 0; i < values.length; i++) {
			for(int j = i + 1; j < values.length; j++) {
				if(values[i] == values[j]) {
					
					duplicates[counter] = values[i];
					counter++;
				}
			}
		}
		
		for(int i = 0; i < duplicates.length; i++) {
			System.out.println(duplicates[i]);
		}
		
	}
}
