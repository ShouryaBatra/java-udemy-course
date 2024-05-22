
class Person {
	
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("person1");
		person1.setAge(17);
		
		person2.setInfo("person2", 5);
		
		System.out.println(person1.name + person1.age + person2.name + person2.age);
		
	}
}
