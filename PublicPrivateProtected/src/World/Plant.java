package World;

public class Plant {
	
	// bad practice
	public String name;
	
	// good practice
	public static final int ID = 8;
	
	// good practice
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 10;
	}
	
}
