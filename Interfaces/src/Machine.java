
public class Machine implements Info {
	
	private int id;
	
	public void start() {
		System.out.println("Machine started");
	}

	public void showInfo() {
		System.out.println("machine id: " + id);
	}
	
}
