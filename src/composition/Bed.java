package composition;

public class Bed {

	int pillow;
	int height;
	
	public Bed(int pillow, int height) {
		super();
		this.pillow = pillow;
		this.height = height;
	}

	public int getPillow() {
		return pillow;
	}

	public int getHeight() {
		return height;
	}
	
	public void make() {
		System.out.println("Bed -> Making");
	}
	

}
