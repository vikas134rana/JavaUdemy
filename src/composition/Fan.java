package composition;

public class Fan {

	String color;
	int blades;
	
	public Fan(String color, int blades) {
		super();
		this.color = color;
		this.blades = blades;
	}
	
	public String getColor() {
		return color;
	}

	public int getBlades() {
		return blades;
	}

	public void switchOn() {
		System.out.println("Fan -> Switching On");
	}
	
	
	
	
}
