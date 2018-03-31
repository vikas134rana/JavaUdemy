package composition;

public class Room {

	private Door door;
	private Fan fan;
	private Bed bed;
	
	public Room(Door door, Fan fan, Bed bed) {
		super();
		this.door = door;
		this.fan = fan;
		this.bed = bed;
	}
	
	public void makeBed() {
		System.out.println("Room -> makeBed()");
		bed.make();
	}

	public Door getDoor() {
		return door;
	}

	public Fan getFan() {
		return fan;
	}

	public Bed getBed() {
		return bed;
	}
	
	
	
	
}
