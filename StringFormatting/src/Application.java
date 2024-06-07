
public class Application {
	public static void main(String[] args) {
		
		// inefficient because it creates a new string every time
		String str1 = "abcd";
		str1 += "efghijk";
		str1 += "lmnopqrs";
		System.out.println(str1);
		
		
		// effiecent because it changes the string
		
		StringBuilder sb = new StringBuilder("abcd");
		sb.append("efghijk");
		sb.append("lmnopqrs");
		
		System.out.println(sb.toString());
		
		
		
		System.out.printf("%s: %8.2f", "This is a number", 2345.4523435);
		
	}
}
