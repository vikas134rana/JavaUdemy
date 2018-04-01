package oopsComplete;

public class Hamburger {

	private String breadRollType;
	private String meat;
	private double price;
	private String name;

	private String itemName1;
	private double itemPrice1;

	private String itemName2;
	private double itemPrice2;

	private String itemName3;
	private double itemPrice3;

	private String itemName4;
	private double itemPrice4;

	public Hamburger(String name,String breadRollType, String meat,  double price) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
		this.name = name;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void addItem1(String name, double price) {
		this.itemName1 = name;
		this.itemPrice1 = price;
	}

	public void addItem2(String name, double price) {
		this.itemName2 = name;
		this.itemPrice2 = price;
	}

	public void addItem3(String name, double price) {
		this.itemName3 = name;
		this.itemPrice3 = price;
	}

	public void addItem4(String name, double price) {
		this.itemName4 = name;
		this.itemPrice4 = price;
	}

	public double calculate() {
		double hamurgerPrice = this.price;

		System.out.println(name + " Hamurger with " + breadRollType + " bread and " + meat + " meat for $" + price);
		if (itemName1 != null) {
			hamurgerPrice += itemPrice1;
			System.out.println("Added item " + itemName1 + " for " + itemPrice1);
		}
		if (itemName2 != null) {
			hamurgerPrice += itemPrice2;
			System.out.println("Added item " + itemName2 + " for " + itemPrice2);
		}
		if (itemName3 != null) {
			hamurgerPrice += itemPrice3;
			System.out.println("Added item " + itemName3 + " for " + itemPrice3);
		}
		if (itemName4 != null) {
			hamurgerPrice += itemPrice4;
			System.out.println("Added item " + itemName4 + " for " + itemPrice4);
		}

		return hamurgerPrice;
	}

}
