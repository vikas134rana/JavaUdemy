package polymorphism;

public class Car {

	String name;
	String engine;
	int cylinder;
	int wheels;
	
	public Car(String name, int cylinder) {
		super();
		this.name = name;
		this.cylinder = cylinder;
		this.wheels = 4;
	}

	public String getName() {
		return name;
	}

	public String getEngine() {
		return engine;
	}

	public int getCylinder() {
		return cylinder;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine() {
		System.out.println("Car -> starting engine");
	}
	
	public void accelerate() {
		System.out.println("Car -> accelerating");
	}
	
	public void brake() {
		System.out.println("Car -> using brake");
	}
	
}

class Bmw extends Car{

	public Bmw() {
		super("Bmw", 2);
	}
	
	public void startEngine() {
		System.out.println("Bmw -> starting engine");
	}
	
}

class Audi extends Car{

	public Audi() {
		super("Audi", 3);
	}
	
	public void accelerate() {
		System.out.println("Audi -> accelerating");
	}
	
}

class Mercedes extends Car{

	public Mercedes() {
		super("Mercedes", 4);
	}
	
	public void brake() {
		System.out.println("Mercedes -> using brake");
	}
}
