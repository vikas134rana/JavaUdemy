package oopsComplete;

public class Main {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
//		hamburger.calculate();
		
		
		hamburger.addItem1("lattuce", .45);
		hamburger.addItem2("onion", .25);
		hamburger.addItem3("cheese", 1.15);
		System.out.println("Total price of hamurger is $"+hamburger.calculate());
	}

}
