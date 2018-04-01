package polymorphism;

public class Main {

	public static void main(String[] args) {

		Car[] cars = {new Bmw(),new Audi(),new Mercedes()};
		
		for(Car c:cars) {
			System.out.println(c.getName());
			System.out.println(c.getCylinder());
			c.startEngine();
			c.accelerate();
			c.brake();
			System.out.println();
		}
	}

}
