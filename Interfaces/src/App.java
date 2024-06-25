
public class App {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine(); 
		mach1.start();
		mach1.showInfo();
		
		Person person1 = new Person("abcd");
		person1.greet();
		person1.showInfo();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println();
		
		outputInfo(info1);
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
