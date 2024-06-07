class Thing {
	
	public static final int A_W_NUMBER = 69;
	
	public String name;
	public static String description = "hello ji";
	
	public static int count;
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
	
}
public class App {
	public static void main(String[] args) {
		
		System.out.println(Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
//		thing1.description = "hello!";
		System.out.println(Thing.description);
		
		System.out.println(Thing.A_W_NUMBER);
		
		Thing.showInfo();
		
		System.out.println(Thing.count);
		System.out.println(thing2.id);
	}
}
