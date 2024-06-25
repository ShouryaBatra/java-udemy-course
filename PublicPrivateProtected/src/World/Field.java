package World;

public class Field {
	
	public Plant plant = new Plant();
	
	public Field() {
		
		// size is protected, field is in the same package
		System.out.println(plant.size);
	}
	
}
