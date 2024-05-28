class Person {
	private String name;
	private int age;
	
	public Person() {
		this("default", 0);
		System.out.println("first Constructor running!");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("second constructor running!");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println("third constructor running");
	}
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("abcd");
		Person person3 = new Person("name", 18);
	}
}
