
public class App {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		machine1.start();
		
		Car car1 = new Car();
		car1.start();
		
		car1.setName("bob");
		car1.showInfo();
		
		machine1.setName("bob");
		
	}
}
