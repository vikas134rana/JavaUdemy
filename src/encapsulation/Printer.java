package encapsulation;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplexPrinter;

	public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.duplexPrinter = duplexPrinter;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}

	public void fillToner(int toner) {
		this.tonerLevel += toner;
		if(this.tonerLevel>100)
			this.tonerLevel=100;
		System.out.println("After adding " + toner + "% toner.  Total toner level is " + this.tonerLevel + "%");
	}

	public void printPages(int pages) {
		this.pagesPrinted += pages;
		System.out.println("After printing " + pages + " pages.  Total pages printed is " + this.pagesPrinted);
	}

	@Override
	public String toString() {
		return "tonerLevel = " + this.tonerLevel + "\n" + "pagesPrinted = " + this.pagesPrinted + "\n"
				+ "duplexPrinter = " + this.duplexPrinter + "\n";
	}

}
