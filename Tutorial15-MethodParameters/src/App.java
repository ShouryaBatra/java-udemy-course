class Robot {
	
	public void sayIntroduction(String name, int age) {
		System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
	}
	
	public void testScore(int score) {
		System.out.println("I got a " + score + " on my test.");
	}
	
}



public class App {
	public static void main(String[] args) {
		Robot robot1 = new Robot();
		
		robot1.sayIntroduction("robot1", 312);
		
		int number = 39;
		robot1.testScore(number);
	}
}
