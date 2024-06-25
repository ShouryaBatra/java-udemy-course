
public class Person implements Info{

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("hello there");
	}
	
	public void showInfo() {
		System.out.println("name: " + name);
	}
	
}
