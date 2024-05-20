
class Fruit {
	String fruit;
	String color;
	int amount;
	
	
	void introduction() {
		System.out.println("Hi! I am " + fruit + ". My color is " + color + ". There is " + amount + " of me!");
	}
	
}



public class App {
	public static void main(String[] args) {
		Fruit banana = new Fruit();
		banana.fruit = "banana";
		banana.color = "yellow";
		banana.amount = 5;
		banana.introduction();
		
		Fruit apple = new Fruit();
		apple.fruit = "apple";
		apple.color = "red";
		apple.amount = 4;
		
		Fruit guava = new Fruit();
		guava.fruit = "guava";
		guava.color = "green";
		guava.amount = 1;
		
		
		
		System.out.println(banana.amount + apple.amount);
		
	}
}
