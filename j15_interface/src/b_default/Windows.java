package b_default;


public class Windows {

	public void uesePint(Printable printable) {
		printable.print();
		printable.threeDPrint();
	}
	
	public static void main(String[] args) {
		
		Windows windows = new Windows();
		
		LGPrinter lg = new LGPrinter();
		windows.uesePint(lg);
		
		HPPrinter hp = new HPPrinter();
		windows.uesePint(hp);
	}
	
	
}
