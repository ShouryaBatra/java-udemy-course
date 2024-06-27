import java.util.ArrayList;
import java.util.HashMap;


class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class App {
	public static void main(String[] args) {
		
		///////////// old way /////////////
		
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(";askdf");
		
		System.out.println((int)list.get(0));
		
		
		//////////// modern way //////////////
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Orange Juice");
		drinks.add("Premier Protein");
		drinks.add("Smoothie");
		
		System.out.println(drinks.get(1));
		
		/////////// improved modern way ////////
		
		ArrayList<Person> idkbro = new ArrayList<>(); // nothing in second <> brackets
		idkbro.add(new Person("bob"));
		System.out.println(idkbro.get(0).getName());
		
		
		///////// hashmap is a generic class with two type arguments ////////////
		HashMap<Integer, String> hashmap = new HashMap<>();
		
		
		
	}
}
