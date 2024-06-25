import World.Plant;

// public: accessable anywhere
// private: only in the class
// protected: in the class, subclass, and package
// no modifier: in the package

public class App {
	
	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		
		//bad practice
		plant1.name = "Bob";
		System.out.println(plant1.name);
		
		// acceptable practice
		System.out.println(plant1.ID);
		
		
		// doesnt work --- type is private; only accesable in the class
		// System.out.println(plant1.type);
		
		// doesnt work --- size is protected; app is not in the same package as plant
		// ystem.out.println(plant1.size);
		
		// doesnt work; not in the same package, height has no modifier
		// plant1.height = 45;
	}
	
}
