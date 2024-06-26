
class Plant {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getData() {
		return "some stuff: " + calculateGrowthForecast();
	}
	
	private int calculateGrowthForecast() {
		return 4834;
	}
	
	
}


public class App {
	public static void main(String[] args) {
		
		
		
	}
}
