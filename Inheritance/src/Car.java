
public class Car extends Machine{
	
	public void showInfo() {
		System.out.println("Name: " + name);
	
	}
	
	@Override
	public void start() {
		System.out.println("car started");
	}
	
}
