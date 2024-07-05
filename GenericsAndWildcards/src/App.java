import java.util.ArrayList;

class Machine {
	
	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I am a camera";
	}
}


public class App {
	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("one");
		stringList.add("two");
		

		
		
		
		ArrayList<Machine> machineList = new ArrayList<>();
		
		machineList.add(new Machine());
		machineList.add(new Machine());
		
		showList(machineList);
		System.out.println();

		
		
		
		ArrayList<Camera> cameraList = new ArrayList<>();
		
		cameraList.add(new Camera());
		cameraList.add(new Camera());
		
		showList(cameraList);
		
	}
	
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value: list) {
			
			System.out.println(value);
			value.start();
			
		}
	}
	
	public static void showList2(ArrayList<?> list) {
		for (Object value: list) {
			
			System.out.println(value);
			
		}
	}
}
