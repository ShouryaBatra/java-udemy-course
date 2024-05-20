class Person {
	String name = "bob";
	int age;
	
	
	String getName() {
		return name;
	}
	
	
	int getAge() {
		return age;
	}
	
	int yearsUntilRetirment() {
		return 65 - age;
	}
}


public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "sho";
		System.out.println(person1.getName());
		person1.age = 13;
		
		System.out.println("You have " + (21 - person1.getAge()) + " years before you are an adult");
		System.out.println("You have " + person1.yearsUntilRetirment() + " years until retirement");
	}
}
