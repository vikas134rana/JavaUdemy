package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Printer printer = new Printer(40, 300, false);
		
		System.out.println("Initially : ");
		System.out.println(printer);
		
		printer.fillToner(80);
		
		printer.printPages(80);
		
	}

}
