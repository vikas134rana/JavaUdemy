package composition;

public class Main {
	
	public static void main(String[] args) {
		
		Bed bed=new Bed(4, 4);
		Fan fan= new Fan("white", 3);
		Door door = new Door("Teek", "Brown");
		
		Room room = new Room(door, fan, bed);
		
		room.makeBed();
		
		room.getFan().switchOn();
		
	}

}
