package toStringMethod;

class Person {
	private String name;
	private int age;
	
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hi my name is ").append(name).append(". I am ").append(age).append(" years old.");
		
		return sb.toString();
	}
	
}

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person("Sho", 12);
		System.out.println(person1);
		
		Person person2 = new Person("Kabir", 20);
		System.out.println(person2);
		
	}
}
