
public class If {
	public static void main(String[] args) {
		
//		int myInt = -1;
		
//		if (myInt > -30 && myInt < 0) {
//			System.out.println("hello");
//		}
		
		int loop = 0;
		
		while (loop < 5) {
			System.out.println("Looping: " + loop);
			
			if (loop == 5) {
				break;
			}
			
			loop++;
			
			
			System.out.println("running"); // doesnt get to code after if statement because loop is already broken
		}
		
	}
}
